package testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpectedExceptionTest extends BaseCalculatorTest {

    @Test(invocationCount = 2, expectedExceptions = NullPointerException.class)
    public void verifyDivFunction() throws InterruptedException {
        Thread.sleep(2000);
        double div = calculator.div(4, 2);
        Assert.assertEquals(div, 2);
        if (div == 2) {
            throw new NullPointerException();
        }
    }
}
