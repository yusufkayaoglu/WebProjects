package com.gazi.springboot.ilk.ilkuygulama.RestAPIController;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaDeleteDondurmaController {

    @DeleteMapping("ilk/{yas}")
    public String silOgrenci(@PathVariable("yas") int yasBir)
    {
        return "Silindi!!!";
    }
}
