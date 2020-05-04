package com.github.api.service;

import com.github.api.client.GithubClient;
import com.github.api.dto.CommitSearchResponseDto;
import com.github.api.dto.RepositorySearchResponseDto;
import com.github.api.mapper.CommitMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final GithubClient githubClient;
    private final CommitMapper commitMapper;

    public RepositorySearchResponseDto searchRepositories(String text, Integer page, Integer perPage) {
        return githubClient.searchRepositories(text, page == null ? 1 : page, perPage == null ? 30 : perPage);
    }

    public List<CommitSearchResponseDto> searchRepositoryCommits(String ownerName, String repoName) {
        return Arrays.stream(githubClient.searchCommits(ownerName, repoName, 1, 100))
                .map(commitMapper::toStatisticDto)
                .collect(Collectors.toList());
    }
}