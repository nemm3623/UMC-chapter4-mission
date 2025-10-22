package com.example.umcchapter5mission.reviewmember;

import com.example.umcchapter4mission.reviewMember.domain.ReviewMember;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewMemberRepository extends JpaRepository<ReviewMember, Integer> {

    // 작성한 리뷰 보기
    @Query("select rm from ReviewMember rm where rm.member.id = :memeberId")
    List<ReviewMember> findById(@Param("memberId") long memberId);

}
