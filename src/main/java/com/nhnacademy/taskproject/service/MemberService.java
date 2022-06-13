package com.nhnacademy.taskproject.service;

import com.nhnacademy.taskproject.entitiy.Member;

import java.util.Optional;

public interface MemberService {

    Member registerMember(Member member);

    Optional<Member> findMemberById(String memberIdDto);
}
