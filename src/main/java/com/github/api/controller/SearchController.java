package com.github.api.controller;

import com.github.api.service.SearchService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/search")
@RequiredArgsConstructor
public class SearchController {
    private final SearchService searchService;

    @GetMapping("/repositories")
    public ResponseEntity<?> searchRepositories(@RequestParam("text") String text,
                                                @RequestParam("page") Integer page,
                                                @RequestParam("perPage") Integer perPage) {
        return ResponseEntity.ok(searchService.searchRepositories(text, page, perPage));
    }

    @GetMapping("/commits")
    public ResponseEntity<?> searchCommits(@RequestParam("owner") String owner,
                                           @RequestParam("repo") String repo) {
        return ResponseEntity.ok(searchService.searchRepositoryCommits(owner, repo));
    }

}
