package screen;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CalcScreen {

    AndroidDriver driver;

    @FindBy(id = "com.google.android.calculator:id/op_add")
    WebElement btnPlus;
    @FindBy(id = "com.google.android.calculator:id/op_sub")
    WebElement btnSubtraction;
    @FindBy(id = "com.google.android.calculator:id/op_mul")
    WebElement btnMultiply;
    @FindBy(id = "com.google.android.calculator:id/op_div")
    WebElement btnDivision;
    @FindBy(id = "com.google.android.calculator:id/clr")
    public WebElement btnClear;
    @FindBy(id = "com.google.android.calculator:id/eq")
    WebElement btnEqual;
    @FindBy(id = "com.google.android.calculator:id/collapse_expand")
    WebElement btnExpand;
    @FindBy(id = "com.google.android.calculator:id/const_pi")
    WebElement btnPi;
    @FindBy(id = "com.google.android.calculator:id/op_pow")
    WebElement btnPower;
    @FindBy(id = "com.google.android.calculator:id/result_final")
    WebElement txtResult;

    public CalcScreen(AndroidDriver driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver), this);
    }

    public int doSum(int num1, int num2) {
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num1)).click();
        btnPlus.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num2)).click();
        btnEqual.click();
        String sum = txtResult.getText();
        return Integer.parseInt(sum);
    }

    public int doSubtraction(int num1, int num2) {
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num1)).click();
        btnSubtraction.click();
        driver.findElement(By.id("com.google.android.calculator:id/digit_" + num2)).click();
        btnEqual.click();
        String sub = txtResult.getText();
        return Integer.parseInt(sub);
    }

    public int doEquation(String equation) {
        equation = equation.replace("pi", "r"); // Normalize "pi" to π
        char[] chars = equation.toCharArray();

        for (char ch : chars) {
            if (Character.isDigit(ch)) {
                driver.findElement(By.id("com.google.android.calculator:id/digit_" + ch)).click();
            } else if (ch == '+') {
                btnPlus.click();
            } else if (ch == '-') {
                btnSubtraction.click();
            } else if (ch == '*') {
                btnMultiply.click();
            } else if (ch == '/') {
                btnDivision.click();
            } else if (ch == '^') {
                btnPower.click();
            } else if (ch == 'r') {
                btnPi.click();
            }
        }

        btnEqual.click();
        String resultText = txtResult.getText();
        double resultDouble = Double.parseDouble(resultText); // Handles decimals like 100.53
        return (int) Math.floor(resultDouble); // Cast to int as per your return type
    }

}