package com.sofysmo.desing_pattern.visitor_pattern;

/**
 * Created by sofysmo on 05.06.16.
 */
public class Wardrobe implements Furniture{
    int countShelves;
    Wardrobe(int count){
        countShelves=count;
    }
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
}
