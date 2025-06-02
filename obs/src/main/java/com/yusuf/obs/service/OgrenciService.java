package com.yusuf.obs.service;

import com.yusuf.obs.DTO.OgrenciDTO;
import org.springframework.ui.Model;

import java.util.List;

public interface OgrenciService {
    List<OgrenciDTO> getButunOgr();
    void yeniOgrKaydet(OgrenciDTO ogrenciDTO);
    void guncelleTamamla(OgrenciDTO ogrenciDTO);
    OgrenciDTO getOgrenciId(Long num);
    void ogrenciSil(Long id);


}
