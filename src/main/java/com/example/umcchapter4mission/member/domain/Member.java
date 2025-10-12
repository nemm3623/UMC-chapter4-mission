package com.example.umcchapter4mission.member.domain;


import com.example.umcchapter4mission.global.domain.BaseTimeEntity;
import com.example.umcchapter4mission.member.domain.mapping.MemberFood;
import com.example.umcchapter4mission.member.enums.Gender;
import com.example.umcchapter4mission.member.enums.Status;
import com.example.umcchapter4mission.memberMission.domain.MemberMission;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Table(name = "members")
@Builder
@Getter
public class Member extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String nickName;

    @Column(nullable = false)
    private String phoneNumber;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Gender gender;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    @Builder.Default
    private Status status = Status.ACTIVE;

    private int point;

    @OneToMany(mappedBy = "member")
    private List<MemberFood> memberFoodList = new ArrayList<>();

    @OneToMany(mappedBy = "member")
    private List<MemberMission> memberMissionList = new ArrayList<>();
}



