package core.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public Long id;

    @Column (unique = true)
    private String USERNAME;
    private String USERID;
    private String USERPW;
    private String USEREMAIL;


}
