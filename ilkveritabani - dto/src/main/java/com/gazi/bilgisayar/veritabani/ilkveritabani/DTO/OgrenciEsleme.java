package com.gazi.bilgisayar.veritabani.ilkveritabani.DTO;

import com.gazi.bilgisayar.veritabani.ilkveritabani.veri.Ogrenci;

public class OgrenciEsleme {
    public static OgrenciDTO ogrenciDTOEsle(Ogrenci ogrenci)
    {
        OgrenciDTO ogrenciDTO = new OgrenciDTO(
                ogrenci.getId(),
                ogrenci.getAd(),
                ogrenci.getSoyad()
        );
        return ogrenciDTO;

    }

    public  static Ogrenci ogrenciEsle(OgrenciDTO ogrenciDTO){

        Ogrenci ogr1 = new Ogrenci(
                ogrenciDTO.getId(),
                ogrenciDTO.getSoyad(),
                ogrenciDTO.getSoyad()
        );
        return ogr1;
    }

}
