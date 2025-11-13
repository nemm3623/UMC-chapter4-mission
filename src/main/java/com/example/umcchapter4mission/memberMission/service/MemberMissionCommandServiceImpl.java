package com.example.umcchapter4mission.memberMission.service;

import com.example.umcchapter4mission.member.domain.Member;
import com.example.umcchapter4mission.member.repository.MemberRepository;
import com.example.umcchapter4mission.memberMission.converter.MemberMissionConverter;
import com.example.umcchapter4mission.memberMission.domain.MemberMission;
import com.example.umcchapter4mission.memberMission.dto.req.StartMissionReqDto;
import com.example.umcchapter4mission.memberMission.repository.MemberMissionRepository;
import com.example.umcchapter4mission.mission.domain.Mission;

import com.example.umcchapter4mission.mission.repository.MissionRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class MemberMissionCommandServiceImpl implements MemberMissionCommandService {

    private final MemberMissionRepository memberMissionRepository;
    private final MemberMissionConverter memberMissionConverter;
    private final MemberRepository memberRepository;
    private final MissionRepository missionRepository;

    @Override
    @Transactional
    public void startMission() {

        // 로그인 기능 없으면 하드코딩 가능
        Member member = memberRepository.findById(1L)
                .orElseThrow(() -> new IllegalArgumentException("회원이 존재하지 않습니다."));

        Mission mission = missionRepository.findById(1L)
                .orElseThrow(() -> new IllegalArgumentException("미션이 존재하지 않습니다."));

        MemberMission memberMission = memberMissionConverter.toMemberMission(member, mission);

        // 인스턴스 메서드 호출
        memberMissionRepository.save(memberMission);
    }
}

