package a.little.java;

/**
 * Created by onesuper on 31/01/2017.
 */
public abstract class Expr {
    public abstract Object accept(ExprVisitor ask);
}
