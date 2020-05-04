package com.github.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class UserDto {
    private Long id;

    @JsonProperty("node_id")
    private String nodeId;

    private String login;

    @JsonProperty("avatar_url")
    private String avatarUrl;
}
