package com.example.umcchapter4mission.review.serivce;

import com.example.umcchapter4mission.member.domain.Member;
import com.example.umcchapter4mission.review.converter.ReviewConverter;
import com.example.umcchapter4mission.review.domain.Review;
import com.example.umcchapter4mission.review.dto.req.ReviewCreateReqDto;
import com.example.umcchapter4mission.review.dto.res.ReviewResponseDto;
import com.example.umcchapter4mission.review.repository.ReviewRepository;
import com.example.umcchapter4mission.store.domain.Store;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReviewCommandServiceImpl implements ReviewCommandService {

    private final ReviewRepository reviewRepository;
    private final ReviewConverter reviewConverter;

    @Override
    @Transactional
    public ReviewResponseDto createReview(ReviewCreateReqDto dto) {

        Member member = reviewRepository.findById(1L)
                .orElseThrow(() -> new IllegalArgumentException("리뷰가 존재하지 않습니다."))
                .getMember();

        Store store = reviewRepository.findById(1L)
                .orElseThrow(() -> new IllegalArgumentException("리뷰가 존재하지 않습니다."))
                .getStore();


        Review review = reviewConverter.toReview(dto,member,store);

        return reviewConverter.toReviewResponseDto(reviewRepository.save(review));
    }
}
