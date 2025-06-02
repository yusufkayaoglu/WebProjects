package edu.guvenlik.login.Service;

import edu.guvenlik.login.DTO.OgrenciDTO;
import edu.guvenlik.login.Data.Ogrenci;

import java.util.List;

public interface KayitService {
    void kaydet(OgrenciDTO ogrenciDTO);
    List<OgrenciDTO> butunListe();

}
