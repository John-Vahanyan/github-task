package com.github.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommitDto {

    private UserDetailsDto author;
    private UserDetailsDto committer;
    private String message;
    private String url;

    @JsonProperty("comment_count")
    private Integer commentCount;

    private VerificationDto verification;
}
