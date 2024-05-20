package com.bcw.Calculate.member;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column (unique = true)
    private String USERNAME;
    private String USERID;
    private String USERPW;
    private String USEREMAIL;


}
