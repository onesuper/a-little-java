package a.little.java.exprs;

import a.little.java.Expr;
import a.little.java.ExprVisitor;

/**
 * Created by onesuper on 31/01/2017.
 */
public class Plus extends Expr {
    Expr l;
    Expr r;
    public Plus (Expr l, Expr r) {
        this.l = l;
        this.r = r;
    }

    public Object accept(ExprVisitor ask) {
        return ask.forPlus(l, r);
    }
}
