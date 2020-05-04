package com.github.api.dto;

import lombok.*;

import java.util.List;
import java.util.Map;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class CommitStatisticDto {

    private List<CommitSearchResponseDto> commitResponseItems;
    private Map<String, Integer> committerMap;
}