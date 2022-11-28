package com.hospital.review.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.hibernate.annotations.GeneratorType;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@AllArgsConstructor
@Getter
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String userName;
    private String password;
    private String emailAddress;
}
