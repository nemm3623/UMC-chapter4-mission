package com.example.umcchapter4mission.memberMission.controller;

import com.example.umcchapter4mission.memberMission.dto.req.StartMissionReqDto;
import com.example.umcchapter4mission.memberMission.service.MemberMissionCommandService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/member-missions")
@RequiredArgsConstructor
public class MemberMissionController {

    private final MemberMissionCommandService memberMissionCommandService;

    @PostMapping("/start")
    public ResponseEntity<String> startMission() {
        memberMissionCommandService.startMission();
        return ResponseEntity.ok("미션 도전을 시작했습니다.");
    }
}

