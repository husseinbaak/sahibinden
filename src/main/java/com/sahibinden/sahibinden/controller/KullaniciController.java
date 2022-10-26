package com.sahibinden.sahibinden.controller;

import com.sahibinden.sahibinden.entity.KullaniciEntity;
import com.sahibinden.sahibinden.service.KullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping(path = "/api/kullanici")
@CrossOrigin()
public class KullaniciController {

    @Autowired
    private KullaniciService kullaniciService;
   
    @PostMapping(path = "/kullanici-ekle")
    public KullaniciEntity kullaniciEkle(@RequestBody  KullaniciEntity kullaniciEntity){
        return this.kullaniciService.kullaniciEkle(kullaniciEntity);
    }
    @GetMapping(path = "/kullanicilari-getir")
    public List<KullaniciEntity> kullanicilariGetir(){
        return this.kullaniciService.kullancilariGetir();
    }

    @GetMapping(path = "/id-kullanici-getir/{id}")
    public KullaniciEntity  idIleKullaniciGetir(@PathVariable Integer id){
        return this.kullaniciService.idIleKullaniciGetir(id);
    }

    @PutMapping(path = "/kullaniyi-guncelle")
    public KullaniciEntity kullniciyiGuncelle(@RequestBody  KullaniciEntity kullaniciEntity){
        return this.kullaniciService.kullaniciyiGuncelle(kullaniciEntity);
    }

    @DeleteMapping(path = "/kullanciyi-sil/{id}")
    public String kullanciyiSil(@PathVariable Integer id){

        this.kullaniciService.kullaniciyiSil(id);
        return  id + " idli kayit silindi";
    }





}
