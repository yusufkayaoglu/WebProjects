package com.gazi.springboot.ilk.ilkuygulama.RestAPIController;

import com.gazi.springboot.ilk.ilkuygulama.JsonDondurma.Ogrenci;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaPutDondurma {
    //@PutMapping var olan bir kaynağı güncelleme işini yapar.
    @PutMapping("ilk/{yas}")
    public Ogrenci putOgrenci(@RequestBody Ogrenci ogrenci, @PathVariable("yas") int yasBir)
    {
        System.out.println(ogrenci.getAd());
        System.out.println(ogrenci.getSoyad());
        return ogrenci;


    }





}
