package edu.guvenlik.login.Service;

import edu.guvenlik.login.DTO.OgrenciDTO;
import edu.guvenlik.login.Data.Ogrenci;
import edu.guvenlik.login.Data.Yetki;
import edu.guvenlik.login.Repository.OgrenciRepo;
import edu.guvenlik.login.Repository.YetkiRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class KayitImpl implements KayitService{
    private OgrenciRepo ogrenciRepo;
    private YetkiRepository yetkiRepo;

    @Autowired
    public KayitImpl(OgrenciRepo ogrenciRepo, YetkiRepository yetkiRepo) {
        this.ogrenciRepo = ogrenciRepo;
        this.yetkiRepo = yetkiRepo;
    }


    @Override
    public List<OgrenciDTO> butunListe() {
        List<Ogrenci> ogrenciler = ogrenciRepo.findAll();
        return ogrenciler.stream()
                .map(ogrenci -> ogrenciDTOEsle(ogrenci))
                .collect(Collectors.toList());
    }

    private OgrenciDTO ogrenciDTOEsle(Ogrenci ogrenci) {
        OgrenciDTO ogrenciDTO = new OgrenciDTO();
        ogrenciDTO.setAd(ogrenci.getAd());
        ogrenciDTO.setSoyad(ogrenci.getSoyad());
        ogrenciDTO.setYas(ogrenci.getYas());
        ogrenciDTO.setSifre(ogrenci.getSifre());
        return ogrenciDTO;
    }


    @Override
    public void kaydet(OgrenciDTO ogrenciDTO) {
        Ogrenci ogrenci = new Ogrenci();
        ogrenci.setAd(ogrenciDTO.getAd());
        ogrenci.setSoyad(ogrenciDTO.getSoyad());
        ogrenci.setYas(ogrenciDTO.getYas());
        ogrenci.setSifre(ogrenciDTO.getSifre());
        Yetki yetki = yetkiRepo.findByYetkiAdi("Admin");


        if(yetki == null) {
            yetki=yetkiKontrolVeriTabani();
        }
        ogrenci.setYetkiler(Arrays.asList(yetki));
        ogrenciRepo.save(ogrenci);


    }

    private Yetki yetkiKontrolVeriTabani()
    {
        Yetki yetki = new Yetki();
        yetki.setYetkiAdi("Admin");
        return yetkiRepo.save(yetki);
    }
}
