package com.nhnacademy.taskproject.service;

import com.nhnacademy.taskproject.domain.MemberSignUpRequest;
import com.nhnacademy.taskproject.entitiy.Member;

import java.util.Optional;

public interface MemberService {

    Member registerMember(MemberSignUpRequest request);

    Optional<Member> findMemberById(String memberIdDto);
}
