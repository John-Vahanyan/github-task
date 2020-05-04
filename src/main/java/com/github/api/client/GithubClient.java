package com.github.api.client;

import com.github.api.dto.CommitSearchResponseDto;
import com.github.api.dto.RepositorySearchResponseDto;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.text.MessageFormat;

@Component
public class GithubClient {

    private final RestTemplate restTemplate = new RestTemplate();

    @Value("${github.api.base}")
    private String githubBaseUrl;
    @Value("${github.api.search}")
    private String githubSearchEndpoint;

    public RepositorySearchResponseDto searchRepositories(String searchText, int page, int perPage) {
        ResponseEntity<RepositorySearchResponseDto> result = restTemplate.exchange(
                MessageFormat.format("{0}{1}?q={2}&&page={3}&&per_page={4}", githubBaseUrl, githubSearchEndpoint, searchText, page, perPage),
                HttpMethod.GET, null, RepositorySearchResponseDto.class);
        return result.getBody();
    }

    public CommitSearchResponseDto[] searchCommits(String ownerName, String repoName, int page, int perPage) {
        ResponseEntity<CommitSearchResponseDto[]> commitResult = restTemplate.exchange(
                MessageFormat.format("{0}/repos/{1}/{2}/commits?page={3}&&perPage={4}", githubBaseUrl, ownerName, repoName, page, perPage),
                HttpMethod.GET, null, CommitSearchResponseDto[].class);
        return commitResult.getBody();
    }


}
