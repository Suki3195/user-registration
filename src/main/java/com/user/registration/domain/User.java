package com.user.registration.domain;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Date;


@Getter
@Setter
@ToString
public class User {

    private String name;
    private String gender;
    private String note;
    private String skills;
    private Date dateOfBirth;

}