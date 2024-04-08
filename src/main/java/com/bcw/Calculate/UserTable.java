package com.bcw.Calculate;

import jakarta.persistence.*;

@Entity
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;
    @Column(nullable = false, unique = true)
    public String USERNAME;
    public String USERID;
    public String USERPW;
    public String USEREMAIL;
}
