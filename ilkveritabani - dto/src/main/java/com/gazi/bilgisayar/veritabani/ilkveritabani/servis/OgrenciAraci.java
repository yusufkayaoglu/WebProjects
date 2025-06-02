package com.gazi.bilgisayar.veritabani.ilkveritabani.servis;

import com.gazi.bilgisayar.veritabani.ilkveritabani.DTO.OgrenciDTO;
import com.gazi.bilgisayar.veritabani.ilkveritabani.veri.Ogrenci;

import java.util.List;


public interface OgrenciAraci {

    OgrenciDTO yeniOgrenci(OgrenciDTO ogrenci);
    OgrenciDTO getirOgrenci(Long ogrenciId);
    List<OgrenciDTO> getirOgrenciler();
    OgrenciDTO guncelleOgrenci(OgrenciDTO ogrenci);
    void silOgrenci(Long ogrenciId);


}
