package com.example.umcchapter4mission.memberMission.service;

import com.example.umcchapter4mission.memberMission.dto.req.StartMissionReqDto;
import org.springframework.transaction.annotation.Transactional;

public interface MemberMissionCommandService {

    @Transactional
    void startMission();
}
