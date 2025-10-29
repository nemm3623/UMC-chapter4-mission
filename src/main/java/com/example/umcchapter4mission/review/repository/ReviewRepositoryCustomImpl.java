package com.example.umcchapter4mission.review.repository;

import com.example.umcchapter4mission.review.domain.QReview;
import com.example.umcchapter4mission.review.dto.MyReviewDto;
import com.example.umcchapter4mission.review.dto.ReviewResponseDto;
import com.example.umcchapter4mission.store.domain.QStore;
import com.querydsl.core.types.Projections;
import com.querydsl.jpa.impl.JPAQueryFactory;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class ReviewRepositoryCustomImpl implements ReviewRepositoryCustom {

    private final JPAQueryFactory queryFactory;

    @Override
    public List<ReviewResponseDto> searchMyReviews(MyReviewDto reviewDto) {

        QReview review = QReview.review;

        QStore store = QStore.store;

        // Projections.constructor() 메서드를 활용해 생성자를 활용해 쿼리문 결과를 자바 객체로 변환
        return queryFactory
                .select(Projections.constructor(ReviewResponseDto.class,
                        review.id,
                        review.content,
                        review.star,
                        store.name
                ))
                .from(review)
                .leftJoin(review.store, store)
                .where(
                        review.member.id.eq(reviewDto.id()),
                        review.store.name.eq(reviewDto.storeName()),
                        review.star.goe(reviewDto.startRange())
                )
                .fetch();
    }
}
