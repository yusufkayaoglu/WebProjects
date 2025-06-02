package com.yusuf.kayaoglu.thymeleaf_uygulamasi.controller;

import com.yusuf.kayaoglu.thymeleaf_uygulamasi.ifadeler.YeniOgrenci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class OzellikKontroller {
    @GetMapping("/yeniOgrenciKayit")
    public String ogrenciKayitSayfasi(Model model){
        YeniOgrenci ogrenci = new YeniOgrenci();
        model.addAttribute("yeniogr",ogrenci);
        List<String>liste = Arrays.asList("Ankara","Adana","Istanbul");
        model.addAttribute("listeEklenmis",liste);
        return "yeniKayitSayfa";
    }

    @PostMapping("/kaydet")
    public String ogrenciKaydet(Model model, @ModelAttribute("yeniogr") YeniOgrenci ogrenci){
        model.addAttribute("yeniogr",ogrenci);
        return "kayitBasariliSayfasi";

    }

}
