package com.github.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommitSearchResponseDto {
    private String sha;

    @JsonProperty("node_id")
    private String nodeId;

    private CommitDto commit;

    private String url;

    @JsonProperty("html_url")
    private String htmlUrl;

    private UserDto author;
    private UserDto committer;

    private List<ParentDto> parents;


}
