package edu.guvenlik.login.Data;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Yetki {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long num;

    private String yetkiAdi;

    @ManyToMany(mappedBy = "yetkiler")
    private List<Ogrenci> ogrenciler = new ArrayList<>();

    public Yetki() {}

    public Yetki(Long num, String yetkiAdi, List<Ogrenci> ogrenciler) {
        this.num = num;
        this.yetkiAdi = yetkiAdi;
        this.ogrenciler = ogrenciler;
    }

    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getYetkiAdi() {
        return yetkiAdi;
    }

    public void setYetkiAdi(String yetkiAdi) {
        this.yetkiAdi = yetkiAdi;
    }

    public List<Ogrenci> getOgrenciler() {
        return ogrenciler;
    }

    public void setOgrenciler(List<Ogrenci> ogrenciler) {
        this.ogrenciler = ogrenciler;
    }

}
