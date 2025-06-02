package com.olgun_yilmaz.lab4.esleme;

import com.olgun_yilmaz.lab4.dto.OgrenciDTO;
import com.olgun_yilmaz.lab4.veri.Ogrenci;

public class Esleme {
    public static OgrenciDTO ogrenciDTOEsle(Ogrenci ogrenci)
    {
        OgrenciDTO ogrenciDTO = new OgrenciDTO(
                ogrenci.getNum(),
                ogrenci.getAd(),
                ogrenci.getSoyad(),
                ogrenci.getYas()
        );
        return ogrenciDTO;
    }

    public static Ogrenci ogrenciEsle(OgrenciDTO ogrenciDTO) {
        Ogrenci ogr1 = new Ogrenci(
                ogrenciDTO.getNum(),
                ogrenciDTO.getAd(),
                ogrenciDTO.getSoyad(),
                ogrenciDTO.getYas()
        );
        return ogr1;


    }
}
