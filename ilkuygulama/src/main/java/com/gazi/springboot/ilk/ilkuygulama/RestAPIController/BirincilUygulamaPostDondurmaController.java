package com.gazi.springboot.ilk.ilkuygulama.RestAPIController;

import com.gazi.springboot.ilk.ilkuygulama.JsonDondurma.Ogrenci;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaPostDondurmaController {
    @PostMapping("ilkOlustur")
    public Ogrenci postOgrenci(@RequestBody Ogrenci ogrenci)
    {
        System.out.println(ogrenci.getAd());
        System.out.println(ogrenci.getSoyad());
        System.out.println(ogrenci.getYas());
        return ogrenci;
    }
}
