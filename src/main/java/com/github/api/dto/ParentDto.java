package com.github.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ParentDto {
    private String sha;
    private String url;

    @JsonProperty(value = "html_url")
    private String htmlUrl;
}
