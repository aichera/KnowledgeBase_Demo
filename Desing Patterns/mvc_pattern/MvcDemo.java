package com.sofysmo.desing_pattern.mvc_pattern;

/**
 * Created by sofysmo on 06.06.16.
 */
public class MvcDemo {
    public static void main(String[] args)
    {
        Publisher publisher=new Publisher();
        Article article=new Article("Tom Mor", "Once upon a time");
        Article article1=new Article("Steven Byle","Android Material Themes Made Easy");
        publisher.addArticle(article);
        publisher.addArticle(article1);
        publisher.publishNewspaper();
    }
}
