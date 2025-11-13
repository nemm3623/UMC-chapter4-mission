package com.example.umcchapter4mission.review.serivce;

import com.example.umcchapter4mission.review.dto.req.MyReviewReqDto;
import com.example.umcchapter4mission.review.dto.res.ReviewResponseDto;
import com.example.umcchapter4mission.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewQueryServiceImpl {

    private ReviewRepository reviewRepository;

    @Transactional(readOnly = true)
    public List<ReviewResponseDto> searchMyReviews(MyReviewReqDto dto) {

        return reviewRepository.searchMyReviews(dto);

    }
}
