package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Yorum;

import java.util.List;

public interface YorumService {
    public List<Yorum> yorumlariGetir();
    public Yorum kaydet(Yorum yorum);
    public void silYorumById(Long id);
}
