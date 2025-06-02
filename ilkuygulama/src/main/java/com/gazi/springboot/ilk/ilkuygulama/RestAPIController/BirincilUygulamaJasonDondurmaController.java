package com.gazi.springboot.ilk.ilkuygulama.RestAPIController;

import com.gazi.springboot.ilk.ilkuygulama.JsonDondurma.Ogrenci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class BirincilUygulamaJasonDondurmaController {

    /*@GetMapping("ilkJson")
    public Ogrenci getIlkUygulamaJason(){
        Ogrenci ogrenci = new Ogrenci("Yusuf","Kayaoglu",23);
        return ogrenci;
    }*/

    @GetMapping("ilkListe")
    public List<Ogrenci> getIlkUygulamaListe() {
        List<Ogrenci> ogrenciler = new ArrayList<>();
        ogrenciler.add(new Ogrenci("Yusuf","Kayaoglu",23));
        ogrenciler.add(new Ogrenci("Ali","Kayaoglu",23));
        ogrenciler.add(new Ogrenci("Kübra","Kayaoglu",23));
        return ogrenciler;
    }

}
