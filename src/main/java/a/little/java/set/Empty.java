package a.little.java.set;

/**
 * Created by onesuper on 31/01/2017.
 */
public class Empty extends Set{
    public boolean isMember(Integer i) {
        return false;
    }

    public Set plus(Set s) {
        return s;
    }

    public Set diff(Set s) {
        return new Empty();
    }

    public Set prod(Set s) {
        return new Empty();
    }
}
