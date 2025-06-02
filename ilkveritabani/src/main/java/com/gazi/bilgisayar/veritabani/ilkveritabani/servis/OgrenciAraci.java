package com.gazi.bilgisayar.veritabani.ilkveritabani.servis;

import com.gazi.bilgisayar.veritabani.ilkveritabani.veri.Ogrenci;

import java.util.List;


public interface OgrenciAraci {

    Ogrenci yeniOgrenci(Ogrenci ogrenci);
    Ogrenci getirOgrenci(Long ogrenciId);
    List<Ogrenci> getirOgrenciler();
    Ogrenci guncelleOgrenci(Ogrenci ogrenci);
    void silOgrenci(Long ogrenciId);


}
