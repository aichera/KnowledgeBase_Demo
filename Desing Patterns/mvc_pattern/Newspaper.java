package com.sofysmo.desing_pattern.mvc_pattern;

import java.util.List;

/**
 * Created by sofysmo on 06.06.16.
 */
public class Newspaper {
    public void showArticle(List<Article> articleList){
        for(Article article:articleList) {
            System.out.println("Author: "+article.author);
            System.out.println();
            System.out.println(article.content);
        }
    }
}
