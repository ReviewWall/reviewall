package com.reviewall.reviewall.repository;

import com.reviewall.reviewall.model.Yorum;
import org.springframework.data.jpa.repository.JpaRepository;

public interface YorumRepository extends JpaRepository<Yorum, Long> {
}
