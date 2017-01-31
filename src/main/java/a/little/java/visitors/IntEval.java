package a.little.java.visitors;

/**
 * Created by onesuper on 31/01/2017.
 */
public class IntEval extends Eval {

    public Object plus(Object l, Object r) {
        return new Integer(
                ((Integer) l).intValue() + ((Integer) r).intValue());
    }

    public Object diff(Object l, Object r) {
        return new Integer(
                ((Integer) l).intValue() - ((Integer) r).intValue());
    }

    public Object prod(Object l, Object r) {
        return new Integer(
                ((Integer) l).intValue() * ((Integer) r).intValue());
    }
}
