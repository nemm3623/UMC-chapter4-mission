package com.example.umcchapter4mission.reviewMember.domain;

import com.example.umcchapter4mission.member.domain.Member;
import com.example.umcchapter4mission.mission.domain.Mission;
import com.example.umcchapter4mission.review.domain.Review;
import jakarta.persistence.*;
import lombok.*;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "reivews_members")
@Builder
@Getter
public class ReviewMember {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "reivew_id")
    private Review review;


}
