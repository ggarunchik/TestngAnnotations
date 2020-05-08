package testng.tests;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderTest extends BaseCalculatorTest {

    @DataProvider(name = "SumData")
    public Object[][] dataForSum() {
        return new Object[][]{
                {3, 5, 8},
                {1, 2, 3}
        };
    }

    @Test(dataProvider = "SumData")
    public void verifySumFunction(double a, double b, double expectedSum) {
        double sum = calculator.sum(a, b);
        Assert.assertEquals(sum, expectedSum);
    }
}
