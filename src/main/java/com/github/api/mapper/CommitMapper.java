package com.github.api.mapper;

import com.github.api.dto.CommitSearchResponseDto;
import org.springframework.stereotype.Component;

@Component
public class CommitMapper {

    public CommitSearchResponseDto toStatisticDto(CommitSearchResponseDto commitSearchResponseDto) {
        return commitSearchResponseDto;
    }
}
