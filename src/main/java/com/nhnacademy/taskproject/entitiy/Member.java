package com.nhnacademy.taskproject.entitiy;

import lombok.*;

import javax.persistence.*;


@Data
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
}
