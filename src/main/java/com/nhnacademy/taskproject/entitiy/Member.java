package com.nhnacademy.taskproject.entitiy;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Setter
@Getter
@Entity
@Table(name = "member")
public class Member {

    @Id
    private String id;

    private String password;

    private String email;

    private String authority;

}
