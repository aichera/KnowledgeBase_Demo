package com.sofysmo.desing_pattern.visitor_pattern;

/**
 * Created by sofysmo on 05.06.16.
 */
public interface Visitor {
    void visit(Table table);
    void visit(Wardrobe wardrobe);

}
