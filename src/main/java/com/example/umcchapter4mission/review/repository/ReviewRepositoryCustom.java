package com.example.umcchapter4mission.review.repository;

import com.example.umcchapter4mission.review.dto.MyReviewDto;
import com.example.umcchapter4mission.review.dto.ReviewResponseDto;


import java.util.List;


public interface ReviewRepositoryCustom {
    public List<ReviewResponseDto> searchMyReviews(MyReviewDto reviewDto);
}

