package com.sofysmo.desing_pattern.visitor_pattern;

import com.sun.org.apache.bcel.internal.classfile.*;

/**
 * Created by sofysmo on 05.06.16.
 */
public interface Furniture {
    void accept(Visitor visitor);
}
