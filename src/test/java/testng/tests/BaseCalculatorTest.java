package testng.tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Listeners;
import testng.Calculator;

public class BaseCalculatorTest {

    Calculator calculator;

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("New Calculator creation");
        calculator = new Calculator();
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Closing calculator");
    }
}
