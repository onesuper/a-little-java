package a.little.java.set;

/**
 * Created by onesuper on 31/01/2017.
 */
public abstract class Set {

    public Set add(Integer i) {
        if (isMember(i)) {
            return this;
        } else {
            return new Add(i, this);
        }
    }

    public abstract boolean isMember(Integer i);
    public abstract Set plus(Set s);
    public abstract Set diff(Set s);
    public abstract Set prod(Set s);
}
