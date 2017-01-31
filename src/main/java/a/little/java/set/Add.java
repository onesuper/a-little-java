package a.little.java.set;

/**
 * Created by onesuper on 31/01/2017.
 */
public class Add extends Set {
    Integer i;
    Set s;
    public Add(Integer i, Set s) {
        this.i = i;
        this.s = s;
    }

    public boolean isMember(Integer n) {
        if (i.equals(n)) {
            return true;
        } else {
            return s.isMember(n);
        }
    }

    public Set plus(Set t) {
        return s.plus(t.add(i));
    }

    public Set diff(Set t) {
        if (t.isMember(i)) {
            return s.diff(t);
        } else {
            return s.diff(t).add(i);
        }
    }

    public Set prod(Set t) {
        if (t.isMember(i)) {
            return s.prod(t).add(i);
        } else {
            return s.prod(t);
        }
    }
}
