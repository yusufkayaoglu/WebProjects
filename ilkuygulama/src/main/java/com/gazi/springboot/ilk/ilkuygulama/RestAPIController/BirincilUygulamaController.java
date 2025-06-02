package com.gazi.springboot.ilk.ilkuygulama.RestAPIController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BirincilUygulamaController {
    @GetMapping("ilk")
    public String ilkUygulama(){
        return "Merhaba Yusuf Kayaoglu";
    }
}
