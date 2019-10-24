package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Kullanici;

import java.util.List;

public interface KullaniciService {
    public List<Kullanici> kullanicilariGetir();
    public Kullanici kaydet(Kullanici kullanici);
    public Kullanici kullaniciGetirById(Long id);
    public void silKullaniciById(Long id);
}
