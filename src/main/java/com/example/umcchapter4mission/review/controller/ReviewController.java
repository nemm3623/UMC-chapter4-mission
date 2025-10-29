package com.example.umcchapter4mission.review.controller;

import com.example.umcchapter4mission.review.domain.Review;
import com.example.umcchapter4mission.review.dto.MyReviewDto;
import com.example.umcchapter4mission.review.dto.ReviewResponseDto;
import com.example.umcchapter4mission.review.serivce.ReviewService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewService reviewService;

    @GetMapping("/api/reviews")
    public List<ReviewResponseDto> searchMyReviews(
            @RequestParam(required = false) long id,
            @RequestParam(required = false) String storeName,
            @RequestParam(required = false) Float starRange
    ) {

        MyReviewDto reviewDto = new MyReviewDto(id,storeName,starRange);

        return reviewService.searchMyReviews(reviewDto);
    }
}
