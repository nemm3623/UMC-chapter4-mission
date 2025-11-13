package com.example.umcchapter4mission.memberMission.repository;


import com.example.umcchapter4mission.memberMission.domain.MemberMission;
import com.example.umcchapter4mission.memberMission.enums.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberMissionRepository extends JpaRepository<MemberMission, Long> {

    // 해당 유저 모든 미션 보기
    @Query("select mm from MemberMission mm where mm.member.id = :memberId ")
    List<MemberMission> findByMemberId(@Param("memberId") long memberId);

    // 해당 유저 특정 상태 지정 미션 보기
    @Query("select mm from MemberMission mm where mm.member.id = :memberId and mm.status = :status ")
    List<MemberMission> findByMemberId(@Param("memberId") long memberId, @Param("status") Status status);

}
