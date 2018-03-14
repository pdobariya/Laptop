import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Utils extends BasePage {


    public static void clickElement(By by){
driver.findElement(by).click();
    }
    public static void enterText(By by, String text){
       // driver.findElement(by).clear();
        driver.findElement(by).sendKeys(text);
    }
    public  String randomDate()
    {
        DateFormat format=new SimpleDateFormat("ddMMMyyHHmmss");
        return  format.format(new Date());
    }
    public  static void waitForElementVIsible(By by, int time){

        WebDriverWait wait =new WebDriverWait(driver,time);
        wait.until(ExpectedConditions.visibilityOfElementLocated(by));
    }
    public void assertTrue(By by,String gettext){
        Assert.assertTrue(driver.findElement(by).getText().contains(gettext));

    }
    public void asserEquals(By actual,String expected){
        Assert.assertEquals(driver.findElement(actual).getText(),expected);

    }
}
