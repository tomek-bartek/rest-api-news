package com.example.restapinews.news;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class News {


    @Id
    private String id;
    private String content;
    private LocalDate date;
    private String nameOfMagazine;
    private String author;
    private Long timestamp= new Date().getTime();


    public News() {

    }


    public News(String id, String content, LocalDate date, String nameOfMagazine, String author) {
        this.id = id;
        this.content = content;
        this.date = date;
        this.nameOfMagazine = nameOfMagazine;
        this.author = author;
        this.timestamp = new Date().getTime();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public String getNameOfMagazine() {
        return nameOfMagazine;
    }

    public void setNameOfMagazine(String nameOfMagazine) {
        this.nameOfMagazine = nameOfMagazine;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

}
