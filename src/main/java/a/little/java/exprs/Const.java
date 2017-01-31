package a.little.java.exprs;

import a.little.java.Expr;
import a.little.java.ExprVisitor;

/**
 * Created by onesuper on 31/01/2017.
 */
public class Const extends Expr {
    Object c;
    public Const(Object c) {
        this.c = c;
    }

    public Object accept(ExprVisitor ask) {
        return ask.forConst(c);
    }
}
