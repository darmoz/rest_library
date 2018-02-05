package com.library.library.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@Entity(name = "RENTED")
public class Rented {
    @Id
    @GeneratedValue
    @NotNull
    @Column(name = "RENT_ID")
    private Long rentId;
    @Column(name = "COPY_ID")
    private long copyId;
    @Column(name = "ID")
    private long userId;
    @Temporal(TemporalType.DATE)
    private Date RENT_DATE;
    @Temporal(TemporalType.DATE)
    private Date RETURN_DATE;

    public Rented() {
    }

    public Rented(Date RENT_DATE) {
        this.RENT_DATE=RENT_DATE;
    }

}
