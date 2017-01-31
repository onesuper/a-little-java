package a.little.java.exprs;

import a.little.java.Expr;
import a.little.java.ExprVisitor;

/**
 * Created by onesuper on 31/01/2017.
 */
public class Prod extends Expr {
    Expr l;
    Expr r;
    public Prod(Expr l, Expr r) {
        this.l = l;
        this.r = r;
    }

    public Object accept(ExprVisitor ask) {
        return ask.forProd(l, r);
    }
}
