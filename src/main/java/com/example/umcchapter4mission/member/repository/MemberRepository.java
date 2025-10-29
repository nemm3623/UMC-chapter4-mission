package com.example.umcchapter4mission.member.repository;

import com.example.umcchapter4mission.member.domain.Member;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface MemberRepository extends JpaRepository<Member, Long> {

    // 마이 페이지
    Optional<Member> findById(Long id);

}
