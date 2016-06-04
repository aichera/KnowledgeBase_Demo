package com.sofysmo.desing_pattern.template_pattern;

import java.util.List;

/**
 * Created by sofysmo on 04.06.16.
 */
public class AerosmithConcert extends Concert {

    AerosmithConcert(List<String> songs)
    {
        super(songs);
    }
    @Override
    void preparation()
    {
        System.out.println("Steven practicing");
        System.out.println("Joe found his guitar");
    }
    @Override
    void close()
    {
     System.out.println("Sing the encore \"Dream on\"");
    }
}
