package com.example.umcchapter5mission.member.repository;

import com.example.umcchapter4mission.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 마이 페이지
    List<Member> findByMemberId(Long memberId);

}
