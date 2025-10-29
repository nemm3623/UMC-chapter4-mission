package com.example.umcchapter4mission.review.serivce;

import com.example.umcchapter4mission.review.domain.Review;
import com.example.umcchapter4mission.review.dto.MyReviewDto;
import com.example.umcchapter4mission.review.dto.ReviewResponseDto;
import com.example.umcchapter4mission.review.repository.ReviewRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ReviewService {

    private ReviewRepository reviewRepository;

    @Transactional(readOnly = true)
    public List<ReviewResponseDto> searchMyReviews(MyReviewDto dto) {

        return reviewRepository.searchMyReviews(dto);

    }
}
