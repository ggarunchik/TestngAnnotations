package testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependencyTest extends BaseCalculatorTest {

    @Test(invocationCount = 4, threadPoolSize = 2)
    public void verifyMinFunction() throws InterruptedException {
        Thread.sleep(4000);
        double min = calculator.min(10, 5);
        Assert.assertEquals(min, 5);
    }

    @Test(invocationCount = 2, dependsOnMethods={"verifyMinFunction"})
    public void verifySumFunction() {
        double sum = calculator.sum(4, 3);
        Assert.assertEquals(sum, 7);
    }

    @Test(description = "Test for Parameters annotation")
    public void verifyMulFunction(double a, double b, double expectedSum) {
        double mul = calculator.mul(a, b);
        Assert.assertEquals(mul, expectedSum);
    }
}
