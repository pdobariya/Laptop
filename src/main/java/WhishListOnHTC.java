import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class WhishListOnHTC extends Utils {
   public void clickOnWishListHTC_Android(){
        driver.getCurrentUrl().contains("http://demo.nopcommerce.com/");
        clickElement(By.xpath("(//input[@value='Add to wishlist'])[3]"));
       System.out.println("hey");
       waitForElementVIsible(By.cssSelector("p.content"),10);
    }
}
