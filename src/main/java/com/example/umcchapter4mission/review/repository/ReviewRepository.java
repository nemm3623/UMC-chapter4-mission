package com.example.umcchapter4mission.review.repository;

import com.example.umcchapter4mission.review.domain.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long>, ReviewRepositoryCustom {
}
