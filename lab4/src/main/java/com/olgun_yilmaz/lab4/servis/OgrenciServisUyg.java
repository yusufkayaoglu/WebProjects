package com.olgun_yilmaz.lab4.servis;

import com.olgun_yilmaz.lab4.dto.OgrenciDTO;
import com.olgun_yilmaz.lab4.esleme.Esleme;
import com.olgun_yilmaz.lab4.repo.OgrenciRepo;
import com.olgun_yilmaz.lab4.veri.Ogrenci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OgrenciServisUyg implements OgrenciServis{

    private OgrenciRepo ogrenciRepo;


    @Autowired
    public OgrenciServisUyg(OgrenciRepo ogrenciRepo) {
        this.ogrenciRepo = ogrenciRepo;
    }

    @GetMapping("/yeniogr")
    public String yeniogr(Model model) {
        OgrenciDTO ogrenciDTO = new OgrenciDTO();
        model.addAttribute("ogrenci", ogrenciDTO);
        return "yeniOgrSayfasi";

    }


    @Override
    public List<OgrenciDTO> getButunOgr() {
        List<Ogrenci>ogrenciListesi = ogrenciRepo.findAll();
        List<OgrenciDTO> ogrenciDTOListesi = ogrenciListesi.stream().map((ogrenci )-> Esleme.ogrenciDTOEsle(ogrenci)).collect(Collectors.toList());
        return ogrenciDTOListesi;
    }

    @Override
    public void yeniOgrKaydet(OgrenciDTO ogrenciDTO) {
        Ogrenci ogrenci = Esleme.ogrenciEsle(ogrenciDTO);
        ogrenciRepo.save(ogrenci);
    }
    @Override
    public void guncelleTamamla(OgrenciDTO ogrenciDTO) {
        Ogrenci mevcut = ogrenciRepo.findById(ogrenciDTO.getNum())
                .orElseThrow(() -> new RuntimeException("Öğrenci bulunamadı!"));

        // DTO'dan entity'e değerleri aktar
        mevcut.setAd(ogrenciDTO.getAd());
        mevcut.setSoyad(ogrenciDTO.getSoyad());
        mevcut.setYas(ogrenciDTO.getYas());

        ogrenciRepo.save(mevcut);
    }

    @Override
    public OgrenciDTO getOgrenciId(Long num) {
        Ogrenci ogrenci = ogrenciRepo.findById(num)
                .orElseThrow(() -> new RuntimeException("Öğrenci bulunamadı!"));

        return Esleme.ogrenciDTOEsle(ogrenci);
    }

    @Override
    public void ogrenciSil(Long id) {
        ogrenciRepo.deleteById(id);
    }


}