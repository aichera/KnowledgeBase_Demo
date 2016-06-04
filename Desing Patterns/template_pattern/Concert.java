package com.sofysmo.desing_pattern.template_pattern;

import java.util.List;

/**
 * Created by sofysmo on 04.06.16.
 */
public abstract class Concert {
    List<String> songs;
    Concert(List<String> songs)
    {
        this.songs=songs;
    }
    public void perform()
    {
        preparation();
        for(String song:songs)
            System.out.println("Sounds \""+song+"\"");
        close();
    }
    abstract void preparation();
    abstract void close();


}
