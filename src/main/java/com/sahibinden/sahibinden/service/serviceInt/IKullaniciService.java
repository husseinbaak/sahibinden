package com.sahibinden.sahibinden.service.serviceInt;

import com.sahibinden.sahibinden.entity.KullaniciEntity;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public interface IKullaniciService {
    KullaniciEntity kullaniciEkle(KullaniciEntity kullaniciEntity);
    List<KullaniciEntity> kullancilariGetir();
    KullaniciEntity kullaniciyiGuncelle(KullaniciEntity kullaniciEntity);
}





