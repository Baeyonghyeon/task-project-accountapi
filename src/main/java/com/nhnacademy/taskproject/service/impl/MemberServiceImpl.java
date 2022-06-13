package com.nhnacademy.taskproject.service.impl;

import com.nhnacademy.taskproject.entitiy.Member;
import com.nhnacademy.taskproject.repository.MemberRepository;
import com.nhnacademy.taskproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

@RequiredArgsConstructor
@Service
public class MemberServiceImpl implements MemberService {

    private final MemberRepository memberRepository;

    @Transactional
    @Override
    public Member registerMember(Member member) {

        return memberRepository.saveAndFlush(member);
    }

    @Override
    public Optional<Member> findMemberById(String id) {
        return memberRepository.findById(id);
    }
}
