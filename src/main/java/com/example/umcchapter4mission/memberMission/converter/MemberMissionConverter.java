package com.example.umcchapter4mission.memberMission.converter;

import com.example.umcchapter4mission.member.domain.Member;
import com.example.umcchapter4mission.memberMission.domain.MemberMission;
import com.example.umcchapter4mission.memberMission.dto.req.StartMissionReqDto;
import com.example.umcchapter4mission.mission.domain.Mission;
import org.springframework.stereotype.Component;

@Component
public class MemberMissionConverter {

    public MemberMission toMemberMission(Member member, Mission mission) {

        return MemberMission.builder()
                .mission(mission)
                .member(member)
                .build();

    }

}
