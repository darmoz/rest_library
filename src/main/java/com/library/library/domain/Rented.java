package com.library.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "RENTED")
public class Rented {
    @Column(name = "COPY_ID")
    private int copyId;
    @Column(name = "ID")
    private Long userId;
    @Column(name = "RENT_DATE")
    private Date rentDate;
    @Column(name = "RETURN_DATE")
    private Date returnDate;
}
