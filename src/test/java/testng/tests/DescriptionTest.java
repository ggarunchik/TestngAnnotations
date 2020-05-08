package testng.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import testng.Retry;

public class DescriptionTest extends BaseCalculatorTest {

    @Test(description = "Verify that div function works")
    public void verifyDivFunction() {
        double div = calculator.div(10, 5);
        Assert.assertEquals(div, 2);
    }
}
