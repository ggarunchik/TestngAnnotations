package testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.Retry;

import java.util.Random;

public class RetryTest extends BaseCalculatorTest{

    @Test(retryAnalyzer = Retry.class)
    public void verifyMinFunction() {
        double min = calculator.min(10, 5);
        Assert.assertEquals(min, 5);
        if (new Random().nextBoolean()) {
            Assert.fail();
        }
    }
}
