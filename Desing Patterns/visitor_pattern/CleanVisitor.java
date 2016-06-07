package com.sofysmo.desing_pattern.visitor_pattern;

import com.sun.org.apache.bcel.internal.classfile.*;

/**
 * Created by sofysmo on 05.06.16.
 */
public class CleanVisitor implements Visitor {
    public void visit(Table table){
        System.out.println("The table was cleaned");
    }
    public void visit(Wardrobe wardrobe){
        System.out.println("The wardrobe was cleaned");
    }

}
