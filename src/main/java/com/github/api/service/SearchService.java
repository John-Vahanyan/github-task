package com.github.api.service;

import com.github.api.client.GithubClient;
import com.github.api.dto.CommitStatisticDto;
import com.github.api.dto.RepositorySearchResponseDto;
import com.github.api.mapper.CommitMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Arrays;

@Service
@RequiredArgsConstructor
public class SearchService {
    private final GithubClient githubClient;
    private final CommitMapper commitMapper;

    public RepositorySearchResponseDto searchRepositories(String text, Integer page, Integer perPage) {
        return githubClient.searchRepositories(text, page == null ? 1 : page, perPage == null ? 30 : perPage);
    }

    public CommitStatisticDto searchRepositoryCommits(String ownerName, String repoName) {
        return commitMapper.toStatisticDto(Arrays.asList(githubClient.searchCommits(ownerName, repoName, 1, 100)));
    }
}