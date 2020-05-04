package com.github.api;

import com.github.api.client.GithubClient;
import lombok.RequiredArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RequiredArgsConstructor
public class Starter implements CommandLineRunner {
    private final GithubClient githubClient;

    public static void main(String[] args) {
        SpringApplication.run(Starter.class, args);

    }

    public void run(String... args) throws Exception {
        githubClient.searchRepositories("abc", 1, 30);
    }
}