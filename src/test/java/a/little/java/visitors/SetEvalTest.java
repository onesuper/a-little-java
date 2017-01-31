package a.little.java.visitors;

import a.little.java.exprs.Const;
import a.little.java.exprs.Diff;
import a.little.java.exprs.Plus;
import a.little.java.exprs.Prod;
import a.little.java.set.Empty;
import a.little.java.set.Set;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by onesuper on 31/01/2017.
 */
public class SetEvalTest {
    @Test
    public void testPlus() throws Exception {
        Set s = (Set) new Plus(
                new Const(new Empty().add(1)),
                new Const(new Empty().add(2))
        ).accept(new SetEval());

        Assert.assertTrue(s.isMember(1));
        Assert.assertTrue(s.isMember(2));
    }

    @Test
    public void testDiff() throws Exception {
        Set s = (Set) new Diff(
                new Const(new Empty().add(1).add(2).add(3)),
                new Const(new Empty().add(1).add(2))
        ).accept(new SetEval());

        Assert.assertTrue(s.isMember(3));
        Assert.assertFalse(s.isMember(1));
        Assert.assertFalse(s.isMember(2));
    }

    @Test
    public void testProd() throws Exception {
        Set s = (Set) new Prod(
                new Const(new Empty().add(1).add(2).add(3)),
                new Const(new Empty().add(2).add(3).add(4))
        ).accept(new SetEval());

        Assert.assertTrue(s.isMember(2));
        Assert.assertTrue(s.isMember(3));
        Assert.assertFalse(s.isMember(1));
        Assert.assertFalse(s.isMember(4));
    }
}