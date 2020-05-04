package com.github.api.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetailsDto {

    private String name;
    private String email;
    private Date date;
}
