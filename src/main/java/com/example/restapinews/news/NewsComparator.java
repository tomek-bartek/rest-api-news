package com.example.restapinews.news;

import java.util.Comparator;

public class NewsComparator implements Comparator<News> {

    @Override
    public int compare(News o1, News o2) {
        if(o1.getDate().equals(o2)){
            return 0;
        }else if(o1.getDate().isAfter(o2.getDate())){
            return 1;
        }else{
        return -1;
    }}
}
