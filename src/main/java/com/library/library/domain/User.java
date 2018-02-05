package com.library.library.domain;

import lombok.Getter;
import lombok.Setter;
import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Date;

@Setter
@Getter
@Entity(name = "USER")
public class User {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "ID", unique = true)
    private long id;
    @Column(name = "FIRST_NAME")
    private String firstName;
    @Column(name = "LAST_NAME")
    private String lastName;
    @Temporal(TemporalType.DATE)
    private Date REGISTRATION_DATE;

    public User() {}

    public User(String firstName, String lastName, Date REGISTRATION_DATE){
        this.firstName=firstName;
        this.lastName=lastName;
        this.REGISTRATION_DATE=REGISTRATION_DATE;

    }
}
