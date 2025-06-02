package com.yusuf.obs.service;

import com.yusuf.obs.DTO.OgrenciDTO;
import com.yusuf.obs.data.Ogrenci;
import com.yusuf.obs.mapping.Mapping;
import com.yusuf.obs.repository.OgrenciRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class OgrenciServiceImpl implements OgrenciService{

    private OgrenciRepo ogrenciRepo;


    @Autowired
    public OgrenciServiceImpl(OgrenciRepo ogrenciRepo) {
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
        List<OgrenciDTO> ogrenciDTOListesi = ogrenciListesi.stream().map((ogrenci )-> Mapping.ogrenciDTOEsle(ogrenci)).collect(Collectors.toList());
        return ogrenciDTOListesi;
    }

    @Override
    public void yeniOgrKaydet(OgrenciDTO ogrenciDTO) {
        Ogrenci ogrenci = Mapping.ogrenciEsle(ogrenciDTO);
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

        return Mapping.ogrenciDTOEsle(ogrenci);
    }

    @Override
    public void ogrenciSil(Long id) {
        ogrenciRepo.deleteById(id);
    }


}