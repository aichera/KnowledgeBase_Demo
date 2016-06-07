package com.sofysmo.desing_pattern.mvc_pattern;

/**
 * Created by sofysmo on 06.06.16.
 */
public class Article {
    String author;
    String content;
    Article(String author, String content)
    {
        this.author=author;
        this.content=content;
    }
    public String getAuthor(){
        return author;
    }
    public void setAuthor(String author){
        this.author=author;
    }
    public String getContent(){
        return content;
    }
    public void setContent(String content){
        this.content=content;
    }

}
