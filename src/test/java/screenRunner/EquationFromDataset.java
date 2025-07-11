package screenRunner;

import config.EquationDataSet;
import config.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screen.CalcScreen;
public class EquationFromDataset extends Setup{
    @Test(dataProvider = "CSV-Dataset", dataProviderClass = EquationDataSet.class)
    public void runEquationTest(String expression, String expectedValue) throws InterruptedException {
        CalcScreen calcScreen =new CalcScreen(driver); // assume you have clear() method in CalcScreen
        int actual = (int) calcScreen.doEquation(expression);
        int expected = Integer.parseInt(expectedValue);
        System.out.println("Expression: " + expression + " = " + actual + " (Expected: " + expected + ")");
        Assert.assertEquals(actual, expected);
    }

}