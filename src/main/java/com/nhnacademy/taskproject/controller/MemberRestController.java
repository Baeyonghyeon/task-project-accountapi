package com.nhnacademy.taskproject.controller;

import com.nhnacademy.taskproject.entitiy.Member;
import com.nhnacademy.taskproject.domain.MemberIdDto;
import com.nhnacademy.taskproject.service.MemberService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class MemberRestController {

    private final MemberService memberService;

    @PostMapping("/signup")
    public Member signUp(@RequestBody Member member){
        return memberService.registerMember(member);
    }

    @PostMapping("/signin")
    public Member findMember(@RequestBody MemberIdDto memberIdDto){
        return memberService.findMemberById(memberIdDto.getId()).get();
    }
}
