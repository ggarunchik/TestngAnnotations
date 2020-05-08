package testng.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.util.Random;

public class ParametersTest extends BaseCalculatorTest {

    @Parameters({"a", "b", "expectedSum"})
    @Test(description = "Test for Parameters annotation")
    public void verifyMulFunction(double a, double b, double expectedSum) {
        double mul = calculator.mul(a, b);
        Assert.assertEquals(mul, expectedSum);
    }
}
