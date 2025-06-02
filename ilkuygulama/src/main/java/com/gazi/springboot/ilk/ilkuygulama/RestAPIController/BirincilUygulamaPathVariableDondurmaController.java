package com.gazi.springboot.ilk.ilkuygulama.RestAPIController;

import com.gazi.springboot.ilk.ilkuygulama.JsonDondurma.Ogrenci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaPathVariableDondurmaController {

    @GetMapping("ilkPathVar/{yas}/{ad}/{soyad}")
    public Ogrenci pathVariableOgrenci(@PathVariable("yas") int ogrenciYas)
    {
        return new Ogrenci("Yusuf","Kayaoglu",ogrenciYas);
    }
}
