package com.gazi.bilgisayar.veritabani.ilkveritabani.servis;

import com.gazi.bilgisayar.veritabani.ilkveritabani.DTO.OgrenciDTO;
import com.gazi.bilgisayar.veritabani.ilkveritabani.DTO.OgrenciEsleme;
import com.gazi.bilgisayar.veritabani.ilkveritabani.repository.OgrenciRepo;
import com.gazi.bilgisayar.veritabani.ilkveritabani.veri.Ogrenci;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
public class OgrenciAraciImplementasyonu implements OgrenciAraci {

    private  OgrenciRepo ogrenciRepo;

    @Autowired
    public OgrenciAraciImplementasyonu(OgrenciRepo ogrenciRepo) {
        this.ogrenciRepo = ogrenciRepo;
    }

    @Override
    public OgrenciDTO yeniOgrenci(OgrenciDTO ogrenciDTO) {
        Ogrenci ogr = OgrenciEsleme.ogrenciEsle(ogrenciDTO);
        Ogrenci yeniKayit = ogrenciRepo.save(ogr);
        OgrenciDTO yeniKayitDTO = OgrenciEsleme.ogrenciDTOEsle(yeniKayit);
        return yeniKayitDTO;
    }

    @Override
    public OgrenciDTO getirOgrenci(Long ogrenciId) {
        Optional<Ogrenci>ogrenciGet = ogrenciRepo.findById(ogrenciId);
        Ogrenci ogrenci = ogrenciGet.get();
        return OgrenciEsleme.ogrenciDTOEsle(ogrenci);
    }

    @Override
    public List<OgrenciDTO> getirOgrenciler() {
        List<Ogrenci> ogrenci = ogrenciRepo.findAll();
        return ogrenci.stream().map(OgrenciEsleme ::ogrenciDTOEsle).collect(Collectors.toList());
    }


    @Override
    public OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci) {
       Ogrenci guncelle = ogrenciRepo.findById(ogrenci.getId()).get();
       guncelle.setAd(ogrenci.getAd());
       guncelle.setSoyad(ogrenci.getSoyad());
       Ogrenci ogrGuncelle = ogrenciRepo.save(guncelle);
       return OgrenciEsleme.ogrenciDTOEsle(ogrGuncelle);
    }

    @Override
    public void silOgrenci(Long ogrenciId) {
        ogrenciRepo.deleteById(ogrenciId);
    }
}

