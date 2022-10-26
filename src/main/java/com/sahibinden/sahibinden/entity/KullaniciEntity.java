package com.sahibinden.sahibinden.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.*;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name = "users")
@Data
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class KullaniciEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kullanici_id")
    private Integer kullanici_id;
    private int deneme;

    @Column(name = "ad")
    private String  ad;

    @Column(name = "soyad")
    private String  soyad;

    @Column(name = "kullanici_adi")
    private String  kullanici_adi;

    @Column(name = "sifre")
    private String  sifre;

    @JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "dd/MM/yyyy")
    @Column(name = "kayit_tarihi")
    private Date kayit_tarihi;

    @JsonFormat(shape = JsonFormat.Shape.STRING ,pattern = "dd/MM/yyyy")
    @Column(name = "dogum_tarihi")
    private Date  dogum_tarihi;

    @Column(name = "cinsiyet")
    private String  cinsiyet;
}
