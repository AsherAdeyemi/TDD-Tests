package test.java;
import org.junit.*;

import Maths.Maths;

public class MathsTest {

    @Before
    public void setUpInstance(){
        maths = new Maths();
    }
    @Test
    public void checkTheSumOfTwoNumbersEqualsThree(){
        Assert.assertEquals(3, maths.addTwoNumbers (9, 7));
    }
    @Test
    public void checkIfNumberIsPrime(){
        Assert.assertTrue(maths.checkPrime(number:9));

    }
}
