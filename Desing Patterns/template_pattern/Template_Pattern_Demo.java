package com.sofysmo.desing_pattern.template_pattern;

/**
 * Created by sofysmo on 04.06.16.
 */

import java.util.ArrayList;
import java.util.List;

/**
 * Template pattern
 * Just create abstract class. It has methods that implement a base algorithm and abstract methods.
 * Subclasses override abstract method but don't change a base algorithm.
 */
public class Template_Pattern_Demo{
    public static void main(String[] args)
    {
        List<String> songs=new ArrayList<String>();
        songs.add("Dream on");
        songs.add("Love In An Elevator");
        songs.add("Livin' On The Edge");
        Concert concert=new AerosmithConcert(songs);
        concert.perform();
    }
}
