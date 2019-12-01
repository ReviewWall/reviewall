package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Firma;

import java.util.List;

public interface FirmaService {
    List<Firma> firmalariGetir();
    Firma kaydet(Firma firma);
    void silFirmaById(Long id);
    Firma getirFirmaByName(String name);
}
