package com.github.api.mapper;

import com.github.api.dto.CommitSearchResponseDto;
import com.github.api.dto.CommitStatisticDto;
import com.github.api.dto.UserDetailsDto;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CommitMapper {

    public CommitStatisticDto toStatisticDto(List<CommitSearchResponseDto> commitSearchResponseDto) {
        Map<String, Integer> map = new HashMap<>();
        commitSearchResponseDto.forEach(item -> {
            UserDetailsDto committer = item.getCommit().getCommitter();
            if (committer != null) {
                Integer count = map.getOrDefault(committer.getName(), 0);
                count += 1;
                map.put(committer.getName(), count);
            }
        });
        return new CommitStatisticDto(commitSearchResponseDto, map);
    }
}
