package com.olgun_yilmaz.lab4.kontroller;

import com.olgun_yilmaz.lab4.dto.OgrenciDTO;
import com.olgun_yilmaz.lab4.servis.OgrenciServis;
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
public class OgrenciKontroller {
    private OgrenciServis ogrenciServis;

    public OgrenciKontroller(OgrenciServis ogrenciServis) {
        this.ogrenciServis = ogrenciServis;
    }


    @PostMapping("/ogrenciler/{id}")
    public String ogrenciGuncellemeTamamlama(@PathVariable("id") Long num,@ModelAttribute("ogrenci") OgrenciDTO ogrenciDTO,BindingResult bindingResult, Model model) {
        if(bindingResult.hasErrors()) {
            model.addAttribute("ogrenci", ogrenciDTO);
            return "guncelleOgrSayfasi";
        }
        ogrenciDTO.setNum(num);
        ogrenciServis.guncelleTamamla(ogrenciDTO);
        return "redirect:/obsGetirHepsi";
    }

    @GetMapping("/ogrenciler/{id}/guncelle")
    public String ogrenciGuncelle(@PathVariable("id") Long num,Model model) {
        OgrenciDTO ogrenci = ogrenciServis.getOgrenciId(num);
        model.addAttribute("ogrenci", ogrenci);
        return "guncelleOgrSayfasi";
    }

    @PostMapping("/ogrenciler")
    public String ogrenciyiKaydet(@Valid @ModelAttribute("ogrenci") OgrenciDTO ogrenciDTO,
                                  BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "yeniOgrSayfasi";
        }

        ogrenciServis.yeniOgrKaydet(ogrenciDTO);
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
        List<OgrenciDTO> ogrencilerGetir = ogrenciServis.getButunOgr();
        model.addAttribute("ogrenciler",ogrencilerGetir);
        return "obsGetirHepsi";
    }

    @GetMapping("/ogrenciler/{id}/sil")
    public String ogrenciSil(@PathVariable("id") Long id) {
        ogrenciServis.ogrenciSil(id);
        return "redirect:/obsGetirHepsi";
    }

}
