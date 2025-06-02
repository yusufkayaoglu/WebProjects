package com.gazi.bilgisayar.veritabani.ilkveritabani.servis;

import com.gazi.bilgisayar.veritabani.ilkveritabani.repository.OgrenciRepo;
import com.gazi.bilgisayar.veritabani.ilkveritabani.veri.Ogrenci;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class OgrenciAraciImplementasyonu implements OgrenciAraci {

    private final OgrenciRepo ogrenciRepo;

    @Autowired
    public OgrenciAraciImplementasyonu(OgrenciRepo ogrenciRepo) {
        this.ogrenciRepo = ogrenciRepo;
    }

    @Override
    public Ogrenci yeniOgrenci(Ogrenci ogrenci) {
        return ogrenciRepo.save(ogrenci);
    }

    @Override
    public Ogrenci getirOgrenci(Long ogrenciId) {
        Optional<Ogrenci>ogrenciGet = ogrenciRepo.findById(ogrenciId);
        return ogrenciGet.get();
    }

    @Override
    public List<Ogrenci> getirOgrenciler() {
        return ogrenciRepo.findAll();
    }


    @Override
    public Ogrenci guncelleOgrenci(Ogrenci ogrenci) {
       Ogrenci guncelle = ogrenciRepo.findById(ogrenci.getId()).get();
       guncelle.setAd(ogrenci.getAd());
       guncelle.setSoyad(ogrenci.getSoyad());
       Ogrenci ogrGuncelle = ogrenciRepo.save(guncelle);
       return ogrGuncelle;
    }

    @Override
    public void silOgrenci(Long ogrenciId) {
        ogrenciRepo.deleteById(ogrenciId);
    }
}

