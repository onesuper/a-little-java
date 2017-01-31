package a.little.java.visitors;

import a.little.java.exprs.Const;
import a.little.java.exprs.Diff;
import a.little.java.exprs.Plus;
import a.little.java.exprs.Prod;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Created by onesuper on 31/01/2017.
 */
public class IntEvalTest {
    @Test
    public void testForPlus() throws Exception {
        Assert.assertEquals(5,
                new Plus(
                        new Const(new Integer(2)),
                        new Const(new Integer(3))
                ).accept(new IntEval()));
    }

    @Test
    public void testForDiff() throws Exception {
        Assert.assertEquals(-1,
                new Diff(
                        new Const(new Integer(2)),
                        new Const(new Integer(3))
                ).accept(new IntEval()));
    }

    @Test
    public void testForProd() throws Exception {
        Assert.assertEquals(6,
                new Prod(
                        new Const(new Integer(2)),
                        new Const(new Integer(3))
                ).accept(new IntEval()));
    }

    @Test
    public void testForConst() throws Exception {
        Assert.assertEquals(2, new Const(2).accept(new IntEval()));
    }

}