import org.openqa.selenium.By;
import org.testng.Assert;

public class AddToCart extends Utils{
    public void addToCardItem(){
        clickElement(By.xpath("//a[contains(text(),'Electronics')]"));
        clickElement(By.linkText("Camera & photo"));
        System.out.println("patel");
        String prodcutSelected=driver.findElement(By.xpath("//div[2]/div/div[2]/h2/a")).getText();
        clickElement(By.xpath("(//input[@value='Add to cart'])[2]"));
        asserEquals(By.className("content"),"The product has been added to your shopping cart");
//        clickElement(By.className("close"));
        System.out.println("oye");
        waitForElementVIsible(By.linkText("shopping cart"),10);
        clickElement(By.linkText("shopping cart"));
        waitForElementVIsible(By.cssSelector("a.product-name"),10);

        String productInBasket=driver.findElement(By.cssSelector("a.product-name")).getText();

        Assert.assertEquals(productInBasket,prodcutSelected);


        //waitForElementVIsible(By.xpath("//form[@id='shopping-cart-form']/div/table/tbody/tr/td[2]/span"),20);
        //clickElement(By.xpath("//form[@id='shopping-cart-form']/div/table/tbody/tr/td[2]/span"));

        System.out.println("poonam");
        //
        //"The product has been added to your shopping cart"

    }
}
