package com.library.library.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class RentedDto {
    private long rentId;
    private long copyId;
    private long userId;
    private Date rentDate;
    private Date returnDate;
}
