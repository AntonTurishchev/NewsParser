package com.newsFactory.somenews.service;

import com.newsFactory.somenews.entity.News;
import com.newsFactory.somenews.repository.NewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsServiceImpl implements NewsService{

    @Autowired
    NewsRepository repository;

    @Override
    public void save(News news) {
        repository.save(news);

    }

    @Override
    public boolean isExist(String newsTitle) {
        List<News> listOfNews = repository.findAll();
        for (News n : listOfNews) {
            if (n.getNewsTitle().equals(newsTitle)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public List<News> getAllNews() {
        return repository.findAll();
    }
}

