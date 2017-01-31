package a.little.java.visitors;

import a.little.java.Expr;
import a.little.java.ExprVisitor;

/**
 * Created by onesuper on 31/01/2017.
 */
public abstract class Eval implements ExprVisitor {

    public Object forPlus(Expr l, Expr r) {
        return plus(l.accept(this), r.accept(this));
    }

    public Object forDiff(Expr l, Expr r) {
        return diff(l.accept(this), r.accept(this));
    }

    public Object forProd(Expr l, Expr r) {
        return prod(l.accept(this), r.accept(this));
    }

    public Object forConst(Object c) {
        return c;
    }

    public abstract Object plus(Object l, Object r);

    public abstract Object diff(Object l, Object r);

    public abstract Object prod(Object l, Object r);

}
