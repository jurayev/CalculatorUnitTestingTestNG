package com.epam.unittesting.tests;

import com.epam.unittesting.tests.testUtils.CalculatorTestDataProvider;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SubDoubleCalculatorTest extends BaseTest {

    @Test(dataProvider = "subDouble", dataProviderClass = CalculatorTestDataProvider.class)
    public void subDoubleTest(double a, double b, double expected){
        double result = calc.sub(a, b);
        System.out.println("subtraction: " + a + " - " + b + " = " + result);
        Assert.assertEquals(result, expected, "Invalid result of subtraction: ");
    }
}
