package edu.guvenlik.login.DTO;

public class OgrenciDTO {
    private Long num;
    private String ad;
    private String soyad;
    private int yas;
    private String sifre;

    public OgrenciDTO() {}

    public OgrenciDTO(Long num, String ad, String soyad, int yas, String sifre) {
        this.num = num;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
        this.sifre = sifre;
    }


    public Long getNum() {
        return num;
    }

    public void setNum(Long num) {
        this.num = num;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getYas() {
        return yas;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getSifre() {
        return sifre;
    }

    public void setSifre(String sifre) {
        this.sifre = sifre;
    }
}
