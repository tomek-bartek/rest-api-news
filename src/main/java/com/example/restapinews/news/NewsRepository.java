package com.example.restapinews.news;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewsRepository extends JpaRepository<News,String > {
    List<News> findAll();
    List<News> findByContentIsContaining(String content);
}
