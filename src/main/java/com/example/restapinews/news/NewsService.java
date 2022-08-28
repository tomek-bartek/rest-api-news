package com.example.restapinews.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;
import java.util.stream.Collectors;

import static java.util.Collections.sort;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    public List<News> getAllNewses() {
        List<News> newsList = newsRepository.findAll();

      Collections.sort(newsList,new NewsComparator());
        return newsList;
    }


    public News getNews(String id) {
      return newsRepository.findById(id).orElse(null);
    }

    public void addNews(News news) {
        newsRepository.save(news);
    }

    public void updateNews(String id, News news) {
      newsRepository.save(news);
    }

    public void deleteNews(String id, News news) {
        newsRepository.delete(news);
    }

    public List<News> getNewsByWord(String word) {
        return newsRepository.findByContentIsContaining(word);
    }
}
