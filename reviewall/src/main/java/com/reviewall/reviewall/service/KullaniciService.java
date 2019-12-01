package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Kullanici;

import java.util.List;

public interface KullaniciService {
    List<Kullanici> kullanicilariGetir();
    Kullanici kaydet(Kullanici kullanici);
    Kullanici kullaniciGetirById(Long id);
    void silKullaniciById(Long id);
}
