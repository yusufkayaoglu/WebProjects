package com.yusuf.obs.mapping;

import com.yusuf.obs.DTO.OgrenciDTO;
import com.yusuf.obs.data.Ogrenci;
import jakarta.validation.constraints.NotEmpty;

public class Mapping {
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
