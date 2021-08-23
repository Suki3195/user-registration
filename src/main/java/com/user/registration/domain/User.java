package com.user.registration.domain;

import lombok.Getter;
import lombok.Setter;

import java.sql.Date;

@Getter
@Setter
public class User {

    private String name;
    private String gender;
    private Date dateOfBirth;
    private String description;
    private String skills;

}
