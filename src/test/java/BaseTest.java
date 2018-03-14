import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class BaseTest extends BasePage {
    @BeforeMethod
    public void openBrowser(){
        System.setProperty("webdriver.gecko.driver","src\\main\\resources\\BrowserDriver\\geckodriver.exe");
        driver = new FirefoxDriver();
       // driver.manage().window().maximize() ;
        driver.get("http://demo.nopcommerce.com/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
     //  driver.findElement(By.linkText("Register")).click();
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }

}
