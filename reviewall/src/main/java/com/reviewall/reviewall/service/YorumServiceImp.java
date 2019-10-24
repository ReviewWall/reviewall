package com.reviewall.reviewall.service;

import com.reviewall.reviewall.model.Yorum;
import com.reviewall.reviewall.repository.YorumRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YorumServiceImp implements YorumService {
    private YorumRepository yorumRepository;

    public YorumServiceImp(YorumRepository yorumRepository) {
        this.yorumRepository = yorumRepository;
    }

    @Override
    public List<Yorum> yorumlariGetir() {
        return yorumRepository.findAll();
    }

    @Override
    public Yorum kaydet(Yorum yorum) {
        return yorumRepository.save(yorum);
    }

    @Override
    public void silYorumById(Long id) {
        yorumRepository.deleteById(id);
    }
}
