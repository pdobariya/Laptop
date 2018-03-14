import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

public class HomePage extends Utils {

    public void navigateToRegisterPage(){

        clickElement(By.linkText("Register"));
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    public void userOnRagisteredPage(){
        driver.get("http://demo.nopcommerce.com/registerresult/1");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public void searchProduct(String productName){

        clickElement(By.id("small-searchterms"));
        enterText(By.id("small-searchterms"),productName);
        clickElement(By.xpath("//input[@value='Search']"));
    }
    public void compareTheProduct(){
      clickElement(By.cssSelector("input.button-2.add-to-compare-list-button"));
      clickElement(By.cssSelector("input.button-2.add-to-compare-list-button"));
      clickElement(By.linkText("product comparison"));


    }
    public void ClearTheListOfProductComparing(){
        clickElement(By.className("clear-list"));

    }

}
