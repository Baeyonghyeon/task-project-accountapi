package com.nhnacademy.taskproject.entitiy;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@NoArgsConstructor
@Setter
@Getter
@Entity
@Table(name = "member")
public class Member {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long memberNo;

    private String id;

    private String password;

    private String email;

    private String state;

    private String authority;

    @Builder
    public Member(String id, String password, String email, String state ,String authority) {
        this.id = id;
        this.password = password;
        this.email = email;
        this.state = state;
        this.authority = authority;
    }
}
