package com.sahibinden.sahibinden.service;

import com.sahibinden.sahibinden.entity.KullaniciEntity;
import com.sahibinden.sahibinden.error.ExceptionNotFound;
import com.sahibinden.sahibinden.error.UserHand;
import com.sahibinden.sahibinden.repository.KullaniciRepo;
import com.sahibinden.sahibinden.service.serviceInt.IKullaniciService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class KullaniciService implements IKullaniciService {
    @Autowired
    private KullaniciRepo kullaniciRepo;
    @Override
    public KullaniciEntity kullaniciEkle(KullaniciEntity kullaniciEntity) {
        return kullaniciRepo.save(kullaniciEntity);
    }
    @Override
    public List<KullaniciEntity> kullancilariGetir(){
        if(kullaniciRepo.findAll().isEmpty()){
            throw new ExceptionNotFound(" veri tabanında kayıtlı kullanıcı buluanmadı ");
        }else {

            return this.kullaniciRepo.findAll();
        }

    }

    @Override
    public KullaniciEntity kullaniciyiGuncelle(KullaniciEntity kullaniciEntity) {
        return this.kullaniciRepo.save(kullaniciEntity);
    }

    public String kullaniciyiSil(Integer id) {
       if(this.kullaniciRepo.findById(id).isPresent()){
           this.kullaniciRepo.deleteById(id);
           return "kullanıcı silindi ";
       }else {
           throw new ExceptionNotFound(String.format("bu %s idiye ait kullanıcı bulunamadı ",id));
       }

    }

    public KullaniciEntity idIleKullaniciGetir(Integer id) {
//        Optional<KullaniciEntity> kullaniciEntity=
//                kullaniciRepo.findById(id); هذه الدالة ترجع نال ان كان ال اد غير موجود
//        if(kullaniciEntity.isPresent()){ هنا بما انه ال اد غير موجود مع وجود ما بعد النقطة يعطي صح
//
//        }
        Optional<KullaniciEntity> kullaniciEntity=
               kullaniciRepo.findById(id);

//        if(kullaniciRepo.findAll().isEmpty()){ // هذه الدالة تقول لا يجود شيء بالقاعدة لكن قد يكون موجود مستخدمين لكن ما نبحث عنه غير موجود
        if(!kullaniciEntity.isPresent()){
            throw new UserHand("girilen id bulunmadı");
        }
       else {
            return this.kullaniciRepo.findById(id).get();

        }
    }
}
