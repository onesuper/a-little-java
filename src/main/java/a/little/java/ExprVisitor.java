package a.little.java;

/**
 * Created by onesuper on 31/01/2017.
 */
public interface ExprVisitor {
    Object forPlus(Expr l, Expr r);
    Object forDiff(Expr l, Expr r);
    Object forProd(Expr l, Expr r);
    Object forConst(Object c);
}
