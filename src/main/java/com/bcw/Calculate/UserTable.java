package com.bcw.Calculate;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@ToString
@Getter
@Setter
public class UserTable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    private String USERNAME;
    private String USERID;
    private String USERPW;
    private String USEREMAIL;


}
