package com.gazi.bilgisayar.veritabani.ilkveritabani.controller;

import com.gazi.bilgisayar.veritabani.ilkveritabani.servis.OgrenciAraci;
import com.gazi.bilgisayar.veritabani.ilkveritabani.veri.Ogrenci;
import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
public class OgrenciKontroller {

    private final OgrenciAraci araci;

    @Autowired
    public OgrenciKontroller(OgrenciAraci araci) {
        this.araci = araci;
    }

    @PostMapping("/ilkKayit")
    public ResponseEntity<Ogrenci> yeniOgrenci(@RequestBody Ogrenci ogrenci){
        Ogrenci ogrenciKayit = araci.yeniOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciKayit, HttpStatus.CREATED);
    }

    @GetMapping("/ilkGetir/{id}")
    public ResponseEntity<Ogrenci> getirOgrenciResponseEntity(@PathVariable("id") Long ogrenciId)
    {
        Ogrenci ogrenciGetir = araci.getirOgrenci(ogrenciId);
        return new ResponseEntity<>(ogrenciGetir,HttpStatus.OK);

    }

    @GetMapping("/ilkGetirHepsi")
    public ResponseEntity<List<Ogrenci>> getirButunOgrenciler(){
        List<Ogrenci> ogrencilerGetir = araci.getirOgrenciler();
        return new ResponseEntity<>(ogrencilerGetir,HttpStatus.OK);
    }

    @PutMapping("/ilkguncelle/{id}")
    public ResponseEntity<Ogrenci>guncelleOgrenci(@PathVariable("id") Long ogrenciId,
                                                  @RequestBody Ogrenci ogrenci)
    {
        ogrenci.setId(ogrenciId);
        Ogrenci ogrenciGuncelle = araci.guncelleOgrenci(ogrenci);
        return new ResponseEntity<>(ogrenciGuncelle,HttpStatus.OK);
    }

    @DeleteMapping("/ilksil/{id}")
    public ResponseEntity<String>silOgrenci(@PathVariable("id") Long ogrenciId)
    {
        araci.silOgrenci(ogrenciId);
        return new ResponseEntity<>("Ogrenci Silindi!!",HttpStatus.OK);


    }

}
