package com.gazi.springboot.ilk.ilkuygulama.RestAPIController;

import com.gazi.springboot.ilk.ilkuygulama.JsonDondurma.Ogrenci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaRequestParamDondurma {

    @GetMapping("ilkReqPar")
    public Ogrenci requestParameterOgrenci(@RequestParam int yas)
    {
        return new Ogrenci("Yusuf","Kayaoglu",yas);
    }

}
