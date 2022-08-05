package com.newsFactory.somenews.controller;

import com.newsFactory.somenews.entity.News;
import com.newsFactory.somenews.service.NewsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NewsController {

    @Autowired
    NewsService newsService;

    @GetMapping(value = "/news")
    public List<News> getNews() {
        return newsService.getAllNews();
    }
}
