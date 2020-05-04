package com.github.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RepositoryDto {
    private Long id;

    @JsonProperty("node_id")
    private String nodeId;

    private String name;

    @JsonProperty("full_name")
    private String fullName;

    private UserDto owner;

    @JsonProperty("html_url")
    private String htmlUrl;

    private String description;

    private String url;

    private Integer size;

    @JsonProperty("open_issues_count")
    private Integer openIssuesCount;

    private Integer watchers;

    @JsonProperty("default_branch")
    private String defaultBranch;

    private Integer score;

    private String language;

    @JsonProperty("stargazers_count")
    private Integer stargazersCount;

    @JsonProperty("created_at")
    private Date createdAt;

    @JsonProperty("updated_at")
    private Date updatedAt;
}
