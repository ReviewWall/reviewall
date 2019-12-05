package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Yorum;

import java.util.List;

public interface YorumService {
    List<Yorum> yorumlariGetir();
    Yorum kaydet(Long id,String firmaAdi,Yorum yorum);
    void silYorumById(Long id);
    Yorum findYorumById(Long id);
}
