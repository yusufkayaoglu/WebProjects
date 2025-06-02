package com.yusuf.obs.controller;

import com.yusuf.obs.DTO.OgrenciDTO;
import com.yusuf.obs.service.OgrenciService;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;
@Controller
public class OgrenciController {
    private OgrenciService ogrenciService;

    public OgrenciController(OgrenciService ogrenciService) {
        this.ogrenciService = ogrenciService;
    }
    @GetMapping("/")
    public String anasayfa() {
        return "anasayfa";
    }

    @PostMapping("/ogrenciler/{id}")
    public String ogrenciGuncellemeTamamlama(@PathVariable("id") Long num,@ModelAttribute("ogrenci") OgrenciDTO ogrenciDTO,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("ogrenci", ogrenciDTO);
            return "guncelleOgrSayfasi";
        }
        ogrenciDTO.setNum(num);
        ogrenciService.guncelleTamamla(ogrenciDTO);
        return "redirect:/obsGetirHepsi";
    }

    @GetMapping("/ogrenciler/{id}/guncelle")
    public String ogrenciGuncelle(@PathVariable("id") Long num,Model model) {
        OgrenciDTO ogrenci = ogrenciService.getOgrenciId(num);
        model.addAttribute("ogrenci", ogrenci);
        return "guncelleOgrSayfasi";
    }

    @PostMapping("/ogrenciler")
    public String ogrenciyiKaydet(@Valid @ModelAttribute("ogrenci") OgrenciDTO ogrenciDTO,
                                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "yeniOgrSayfasi";
        }

        ogrenciService.yeniOgrKaydet(ogrenciDTO);
        return "redirect:/obsGetirHepsi";
    }

    @GetMapping("/yeniogr")
    public String yeniogr(Model model) {
        OgrenciDTO ogrenciDTO = new OgrenciDTO();
        model.addAttribute("ogrenci", ogrenciDTO);
        return "yeniogrSayfasi";
    }

    @GetMapping("/obsGetirHepsi")
    public String obsGetirHepsi(Model model) {
        List<OgrenciDTO> ogrencilerGetir = ogrenciService.getButunOgr();
        model.addAttribute("ogrenciler",ogrencilerGetir);
        return "obsGetirHepsi";
    }

    @GetMapping("/ogrenciler/{id}/sil")
    public String ogrenciSil(@PathVariable("id") Long id) {
        ogrenciService.ogrenciSil(id);
        return "redirect:/obsGetirHepsi";
    }

}
