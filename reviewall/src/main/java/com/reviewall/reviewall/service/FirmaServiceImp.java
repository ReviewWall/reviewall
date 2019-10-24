package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Firma;
import com.reviewall.reviewall.repository.FirmaRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FirmaServiceImp implements FirmaService {
    private FirmaRepository firmaRepository;

    public FirmaServiceImp(FirmaRepository firmaRepository) {
        this.firmaRepository = firmaRepository;
    }

    @Override
    public List<Firma> firmalariGetir() {
        return firmaRepository.findAll();
    }

    @Override
    public Firma kaydet(Firma firma) {
        return firmaRepository.save(firma);
    }

    @Override
    public void silFirmaById(Long id) {
        firmaRepository.deleteById(id);
    }
}
