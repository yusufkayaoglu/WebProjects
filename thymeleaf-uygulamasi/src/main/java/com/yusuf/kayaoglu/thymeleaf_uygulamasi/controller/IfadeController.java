package com.yusuf.kayaoglu.thymeleaf_uygulamasi.controller;

import com.yusuf.kayaoglu.thymeleaf_uygulamasi.ifadeler.Ogrenci;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IfadeController {

    @GetMapping("/kosul")
    public String kosulOrnek(Model model){
        Ogrenci ogrenci = new Ogrenci("Yusuf","Kayaoglu",23);
        Ogrenci ogrenci1 = new Ogrenci("Ali","Kayaoglu",28);
        Ogrenci ogrenci2 = new Ogrenci("Ercan","Kayaoglu",48);
        Ogrenci ogrenci3 = new Ogrenci("Yusuf","Kayaoglu",60);
        List<Ogrenci>liste = new ArrayList<>();
        liste.add(new Ogrenci("Yusuf","Kayaoglu",23));
        liste.add(ogrenci);
        liste.add(ogrenci1);
        liste.add(ogrenci2);
        liste.add(ogrenci3);
        model.addAttribute("ogrenciKosul",liste);
        return "kosulSayfa";
    }

    @GetMapping("/iterasyon")
    public String iterasyonOrnek(Model model){
        Ogrenci ogrenci = new Ogrenci("Yusuf","Kayaoglu",23);
        Ogrenci ogrenci1 = new Ogrenci("Ali","Kayaoglu",23);
        Ogrenci ogrenci2 = new Ogrenci("Ercan","Kayaoglu",23);
        Ogrenci ogrenci3 = new Ogrenci("Zehra","Kayaoglu",23);
        List<Ogrenci>liste = new ArrayList<>();
        liste.add(ogrenci);
        liste.add(ogrenci1);
        liste.add(ogrenci2);
        liste.add(ogrenci3);
        model.addAttribute("ogrenciiter",liste);
        return "iterasyonSayfa";
    }

    @GetMapping("/parca")
    public String parcaIfade(){
        return "parcaSayfa";
    }


    @GetMapping("/degisken")
    public String degiskenIfade(Model model){
        Ogrenci ogrenci = new Ogrenci("Yusuf","Kayaoglu",23);
        model.addAttribute("degisken",ogrenci);
        return "degiskenSayfa";
    }

    @GetMapping("/secim")
    public String secimIfade(Model model){
        Ogrenci ogrenci = new Ogrenci("Yusuf","Kayaoglu",23);
        model.addAttribute("secim",ogrenci);
        return "secimSayfa";
    }

    @GetMapping("/i18n")
    public String i18nIfade(Model model){
        return "i18nSayfa";
    }

    @GetMapping("/link")
    public String linkIfade(Model model)
    {
        model.addAttribute("ad","Yusuf");
        return "linkSayfa";
    }

}
