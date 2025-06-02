package com.yusuf.obs.DTO;

import jakarta.validation.constraints.NotEmpty;

public class OgrenciDTO {
    private Long num;
    @NotEmpty(message = "Ogrenci Adını Yazınız")
    private String ad;
    @NotEmpty(message = "Ogrenci Soyadını Yazınız")
    private String soyad;
    private int yas;

    public OgrenciDTO() {

    }

    public OgrenciDTO(Long num, String ad, String soyad, int yas) {
        this.num = num;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
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
}
