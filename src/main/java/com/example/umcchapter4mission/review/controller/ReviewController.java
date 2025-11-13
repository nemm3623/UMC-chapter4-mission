package com.example.umcchapter4mission.review.controller;

import com.example.umcchapter4mission.review.dto.req.MyReviewReqDto;
import com.example.umcchapter4mission.review.dto.req.ReviewCreateReqDto;
import com.example.umcchapter4mission.review.dto.res.ReviewResponseDto;
import com.example.umcchapter4mission.review.serivce.ReviewCommandService;
import com.example.umcchapter4mission.review.serivce.ReviewQueryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/reviews")
public class ReviewController {

    private final ReviewQueryServiceImpl reviewQueryServiceImpl;
    private final ReviewCommandService reviewCommandService;

    @GetMapping("/api/reviews")
    public List<ReviewResponseDto> searchMyReviews(
            @RequestParam(required = false) long id,
            @RequestParam(required = false) String storeName,
            @RequestParam(required = false) Float starRange
    ) {

        MyReviewReqDto reviewDto = new MyReviewReqDto(id,storeName,starRange);

        return reviewQueryServiceImpl.searchMyReviews(reviewDto);
    }

    @GetMapping("/api/reivews/create")
    public ReviewResponseDto createMyReview(
            @RequestParam(required = false) String title,
            @RequestParam(required = false) String content,
            @RequestParam(required = false) Float star,
            @RequestParam(required = false) long member_id,
            @RequestParam(required = false) long store_id
    ){
        ReviewCreateReqDto dto = new ReviewCreateReqDto(title,content,star,member_id,store_id);
        return reviewCommandService.createReview(dto);
    }
}
