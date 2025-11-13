package com.example.umcchapter4mission.review.converter;

import com.example.umcchapter4mission.member.domain.Member;
import com.example.umcchapter4mission.review.domain.Review;
import com.example.umcchapter4mission.review.dto.req.ReviewCreateReqDto;
import com.example.umcchapter4mission.review.dto.res.ReviewResponseDto;
import com.example.umcchapter4mission.store.domain.Store;
import org.springframework.stereotype.Component;

@Component
public class ReviewConverter {

    public Review toReview(ReviewCreateReqDto dto, Member member, Store store){
        return Review.builder()
                .title(dto.title())
                .content(dto.content())
                .member(member)
                .store(store)
                .build();
    }

    public ReviewResponseDto toReviewResponseDto(Review review){
        return new ReviewResponseDto
                (review.getId(), review.getStore().getName()
                        ,review.getTitle(), review.getContent(), review.getStar());
    }
}
