package com.nhnacademy.taskproject.repository;

import com.nhnacademy.taskproject.entitiy.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, String> {

    @Query("select m from Member m where m.id = :id")
    Optional<Member> findById(@Param("id")String id);

}
