package com.nhnacademy.taskproject.service.impl;

import com.nhnacademy.taskproject.controller.MemberRestController;
import com.nhnacademy.taskproject.domain.MemberSignUpRequest;
import com.nhnacademy.taskproject.entitiy.Member;
import com.nhnacademy.taskproject.repository.MemberRepository;
import com.nhnacademy.taskproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Override
    public Member registerMember(MemberSignUpRequest request) {
        Member member = Member.builder()
                .id(request.getId())
                .password(request.getPassword())
                .email(request.getEmail())
                .state(request.getState())
                .authority(request.getAuthority())
                .build();

        return memberRepository.saveAndFlush(member);
    }

    @Override
    public Optional<Member> findMemberById(String id) {
        return memberRepository.findById(id);
    }
}
