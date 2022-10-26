package com.sahibinden.sahibinden.repository;

import com.sahibinden.sahibinden.entity.KullaniciEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KullaniciRepo extends JpaRepository<KullaniciEntity,Integer> {
    KullaniciEntity findByAd(String isim);
}


