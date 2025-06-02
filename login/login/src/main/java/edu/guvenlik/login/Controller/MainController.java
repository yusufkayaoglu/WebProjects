package edu.guvenlik.login.Controller;

import edu.guvenlik.login.DTO.OgrenciDTO;
import edu.guvenlik.login.Service.KayitService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class MainController {
    private KayitService kayitService;

    public MainController(KayitService kayitService) {
        this.kayitService = kayitService;
    }

    @GetMapping("/listele")
    public String listele(Model model) {
        List<OgrenciDTO>ogrencilerDTO=kayitService.butunListe();
        model.addAttribute("ogrenciler", ogrencilerDTO);
        return "listeleSayfasi";
    }

    @PostMapping("/kaydet")//th:action ile aynı olacak
    public String yeniKayitKaydet(@ModelAttribute("ogrenciDTO") OgrenciDTO ogrenciDTO) {
        kayitService.kaydet(ogrenciDTO);
        return "redirect:/yeniKayit?success";
    }

    @GetMapping("/yeniKayit")
    public String yeniKayit(Model model) {
        OgrenciDTO ogrenciDTO = new OgrenciDTO();
        model.addAttribute("ogrenciDTO", ogrenciDTO);
        return "yeniKayitSayfasi";
    }


    @GetMapping("/anaSayfa")
    public String anaSayfa() {
        return "AnaSayfa";
    }

}
