package com.nhnacademy.taskproject.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;

@Data
public class MemberSignUpRequest {

    private String id;

    private String password;

    private String email;

    private String state;

    private String authority;
}
