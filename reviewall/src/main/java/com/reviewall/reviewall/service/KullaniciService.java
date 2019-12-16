package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Kullanici;

import java.util.List;
import java.util.Optional;

public interface KullaniciService {
    List<Kullanici> kullanicilariGetir();
    Kullanici kaydet(Kullanici kullanici);
    Kullanici kullaniciGetirById(Long id);
    Kullanici kullaniciGetirByUsername(String username);
    void silKullaniciById(Long id);
}
