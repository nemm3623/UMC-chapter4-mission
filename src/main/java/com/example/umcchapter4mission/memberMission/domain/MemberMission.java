package com.example.umcchapter4mission.memberMission.domain;

import com.example.umcchapter4mission.member.domain.Member;
import com.example.umcchapter4mission.memberMission.enums.Status;
import com.example.umcchapter4mission.mission.domain.Mission;
import jakarta.persistence.*;
import lombok.*;

@Entity
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access =  AccessLevel.PROTECTED)
@Table(name = "member_missions")
@Builder
@Getter
public class MemberMission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "member_id")
    private Member member;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "mission_id")
    private Mission mission;

    @Enumerated(EnumType.STRING)
    private Status status;
}
