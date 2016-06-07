package com.sofysmo.desing_pattern.mvc_pattern;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by sofysmo on 06.06.16.
 */
public class Publisher {
    List<Article> articleList;
    Newspaper newspaper;
    Publisher()
    {
        articleList=new ArrayList<Article>();
        newspaper=new Newspaper();
    }
    public void addArticle(Article article)
    {
        articleList.add(article);
    }
    public void removeArticle(Article article)
    {
        articleList.remove(article);
    }
    public void publishNewspaper()
    {
        newspaper.showArticle(articleList);
    }

}
