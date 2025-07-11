package screenRunner;

import config.Setup;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;
import screen.CalcScreen;

public class CalcTestRunner extends Setup {
    @Test(priority = 1, description = "Perform the addition of two numbers.")
    public void doSum() {
        CalcScreen calcScreen = new CalcScreen(driver);
        int actualResult = calcScreen.doSum(6,9);
        System.out.println(actualResult);
        int expectedResult = 15;
        Assert.assertEquals(actualResult, expectedResult);
    }
   @Test(priority = 2, description = "Perform subtraction between two numbers")
    public void doSubtraction() {
        CalcScreen calcScreen = new CalcScreen(driver);
        int actualResult = calcScreen.doSubtraction(9,1);
        System.out.println(actualResult);
        int expectedResult = 8;
        Assert.assertEquals(actualResult, expectedResult);
    }

    @Test(priority = 3, description = "Solve a linear equation")
    public void doEquation() throws InterruptedException {
        CalcScreen calcScreen=new CalcScreen(driver);
        int actualResult = calcScreen.doEquation("100/10*5-10+60");
        System.out.println(actualResult);
        int expectedResult = 100;
        Assert.assertEquals(actualResult, expectedResult);
    }
    @AfterMethod
    public void clearScreen(){
        CalcScreen calcScreen=new CalcScreen(driver);
        calcScreen.btnClear.click();
    }
}
