package com.olgun_yilmaz.lab4.servis;

import com.olgun_yilmaz.lab4.dto.OgrenciDTO;

import java.util.List;

public interface OgrenciServis {
    List<OgrenciDTO> getButunOgr();
    void yeniOgrKaydet(OgrenciDTO ogrenciDTO);
    void guncelleTamamla(OgrenciDTO ogrenciDTO);
    OgrenciDTO getOgrenciId(Long num);
    void ogrenciSil(Long id);

}
