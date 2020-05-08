package testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ThreadPoolSizeTest extends BaseCalculatorTest {

    @Test(invocationCount = 10, threadPoolSize = 3)
    public void verifyMinFunction() throws InterruptedException {
        Thread.sleep(4000);
        double min = calculator.min(10, 5);
        Assert.assertEquals(min, 5);
    }
}
