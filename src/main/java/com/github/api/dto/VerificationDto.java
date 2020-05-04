package com.github.api.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class VerificationDto {

    private Boolean isVerified;
    private String reason;
    private String signature;
    private String payload;
}
