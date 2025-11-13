package com.example.umcchapter4mission.review.repository;

import com.example.umcchapter4mission.review.dto.req.MyReviewReqDto;
import com.example.umcchapter4mission.review.dto.res.ReviewResponseDto;


import java.util.List;


public interface ReviewRepositoryCustom {
    public List<ReviewResponseDto> searchMyReviews(MyReviewReqDto reviewDto);
}

