package com.nhnacademy.taskproject.controller;

import com.nhnacademy.taskproject.domain.MemberSignUpRequest;
import com.nhnacademy.taskproject.entitiy.Member;
import com.nhnacademy.taskproject.domain.MemberIdDto;
import com.nhnacademy.taskproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RequiredArgsConstructor
@RestController
@Slf4j
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public Member signUp(@RequestBody MemberSignUpRequest request){
        return memberService.registerMember(request);
    }

    @PostMapping("/signin")
    public Optional<Member> findMember(@RequestBody MemberIdDto memberIdDto){
        Optional<Member> member = memberService.findMemberById(memberIdDto.getId());

        if (member.isEmpty()) {
            log.debug("member null!!!!!");
        }

        return member;
    }
}
