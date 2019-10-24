package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Firma;

import java.util.List;

public interface FirmaService {
    public List<Firma> firmalariGetir();
    public Firma kaydet(Firma firma);
    public void silFirmaById(Long id);
}
