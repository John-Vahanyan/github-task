package com.github.api.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDetailsDto {

    private String name;
    private String email;
    private String date;
}
