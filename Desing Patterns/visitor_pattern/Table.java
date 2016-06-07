package com.sofysmo.desing_pattern.visitor_pattern;



/**
 * Created by sofysmo on 05.06.16.
 */
public class Table implements Furniture{
    int width;
    int length;
    int height;
    public void accept(Visitor visitor)
    {
        visitor.visit(this);
    }
    Table(int width, int length, int height)
    {
        this.width=width;
        this.length=length;
        this.height=height;
    }
}
