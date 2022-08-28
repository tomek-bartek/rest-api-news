package com.example.restapinews.news;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

@RestController
public class NewsController {
    @Autowired
    private NewsService newsService;

    @RequestMapping("/newses")
    public List<News> getAllNewses() {
        return newsService.getAllNewses();
    }

    @RequestMapping("/newses/{id}")
    public News getNews(@PathVariable String id) {
        return newsService.getNews(id);
    }
    @RequestMapping("/newses/search/{word}")
    public List<News> getNewsByWord(@PathVariable String word) {
        return newsService.getNewsByWord(word);
    }
    @RequestMapping(method = RequestMethod.POST, value = "/newses")
    public void addNews(@RequestBody News news) {
        newsService.addNews(news);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/newses/{id}")
    public void updateNews(@RequestBody News news, @PathVariable String id) {
        newsService.updateNews(id, news);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/newses/{id}")
    public void deleteNews(@RequestBody News news, @PathVariable String id) {
        newsService.deleteNews(id, news);
    }
}
