package com.example.umcchapter4mission.review.domain;

import com.example.umcchapter4mission.reviewMember.domain.ReviewMember;
import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "reviews")
@Builder
@Getter
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    private String content;

    @Column(nullable = false)
    @Min(0)
    @Max(5)
    private float star;

    @OneToMany(mappedBy = "review")
    private List<ReviewMember> reviewMemberList = new ArrayList<>();

}
