package com.yusuf.kayaoglu.thymeleaf_uygulamasi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IlkController {
    @GetMapping("/ilk")
    public String ilkMetod(Model model){
        model.addAttribute("mesaj","Merhaba Yusuf Kayaoglu!");
        return "sayfa";
    }



}
