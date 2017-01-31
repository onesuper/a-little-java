package a.little.java.visitors;

import a.little.java.set.Set;

/**
 * Created by onesuper on 31/01/2017.
 */
public class SetEval extends Eval {
    public Object plus(Object l, Object r) {
        return ((Set) l).plus((Set) r);
    }

    public Object diff(Object l, Object r) {
        return ((Set) l).diff((Set) r);
    }

    public Object prod(Object l, Object r) {
        return ((Set) l).prod((Set) r);
    }
}
