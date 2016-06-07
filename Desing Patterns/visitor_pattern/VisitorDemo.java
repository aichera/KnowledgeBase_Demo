package com.sofysmo.desing_pattern.visitor_pattern;

/**
 * Created by sofysmo on 05.06.16.
 */

/**
 * Visitor Pattern
 * You have many different class. You want to perform some operation on them without changing classes.
 * You create class Visiter (operation like class) with method visit()
 * for everything class. The Method perform operation on class.
 * In every class you create method which execute method visit().
 */
public class VisitorDemo {
    public static void main(String[] args) {
        Table table=new Table(4, 4, 2);
        Wardrobe wardrobe=new Wardrobe(5);
        CleanVisitor cleaner=new CleanVisitor();
        table.accept(cleaner);
        wardrobe.accept(cleaner);
    }
}
