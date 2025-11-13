package com.example.umcchapter4mission.review.serivce;


import com.example.umcchapter4mission.review.domain.Review;
import com.example.umcchapter4mission.review.dto.req.ReviewCreateReqDto;
import com.example.umcchapter4mission.review.dto.res.ReviewResponseDto;
import org.springframework.transaction.annotation.Transactional;

public interface ReviewCommandService {


    @Transactional
    ReviewResponseDto createReview(ReviewCreateReqDto dto);
}
