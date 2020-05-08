package testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class InvocationCountTest extends BaseCalculatorTest {

    @Test(invocationCount = 5)
    public void verifySumFunction() {
        double sum = calculator.sum(4, 3);
        Assert.assertEquals(sum, 7);
    }
}
