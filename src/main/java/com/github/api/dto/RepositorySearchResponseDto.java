package com.github.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class RepositorySearchResponseDto {
    @JsonProperty(value = "total_count")
    private Integer totalCount;

    @JsonProperty(value = "incomplete_results")
    private Boolean incompleteResults;

    private List<RepositoryDto> items;
}
