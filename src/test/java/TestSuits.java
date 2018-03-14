import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.sql.Driver;

public class TestSuits extends BaseTest{
    RagisterPage ragisterPage=new RagisterPage();
    HomePage homePage=new HomePage();
    WhishListOnHTC whishListOnHTC=new WhishListOnHTC();
    AddToCart addToCart=new AddToCart();
    Utils utils=new Utils();

    String registerComfirmExpectedMSG="Your registration completed";
    String productToSearch="Laptop";

    @Test
    public void userCanSeeProductReveiwIsSuccessfullyAdded(){
        homePage.navigateToRegisterPage();
        ragisterPage.ragisterUser();
        ragisterPage.submitAndVerifyTheReview();


    }
    @Test
    public void userShouldAbleToSendEmailToFriendAndSeeTheMessageSuccessfully(){
        homePage.navigateToRegisterPage();
        ragisterPage.ragisterUser();
        ragisterPage.sendEmailToFriend();
        utils.asserEquals(By.className("result"),"Your message has been sent.");
    }

    @Test
    public void userShouldAbleToClearTheProductListAndVerifyTheErrorMassageSuccessfully(){
        homePage.compareTheProduct();
        homePage.ClearTheListOfProductComparing();
        utils.asserEquals(By.className("no-data"),"You have no items to compare.");
        //System.out.println("correct the program");

    }

    @Test
    public void userShouldAbleToCompareTheProductSuccessfully(){
        homePage.compareTheProduct();
        utils.asserEquals(By.xpath("//h1"),"Compare products");
        //System.out.println("This is true ");
    }

    @Test
    public void userShouldAbleToSeeAppleICamAddInShoppingCart(){
        addToCart.addToCardItem();
//        utils.asserEquals(By.name("updatecart"),"Update shopping cart");
        //utils.asserEquals(By.cssSelector("span.sku-number"),"APPLE_CAM");

    }

    @Test
    public void userShouldVisibleAllTheRedErrorMassageOnRagisterPageWhithoutInsertTheData(){
        homePage.navigateToRegisterPage();
        ragisterPage.ragisterWithoutEnterTheData();
        utils.asserEquals(By.xpath("//span[2]/span"),"First name is required.");
        utils.asserEquals(By.xpath("//div[3]/span[2]/span"),"Last name is required.");
        utils.asserEquals(By.xpath("//div[5]/span[2]/span"),"Email is required.");
        utils.asserEquals(By.xpath("//div[4]/div[2]/div/span[2]/span"),"Password is required.");
        utils.asserEquals(By.xpath("//div[4]/div[2]/div[2]/span[2]/span"),"Password is required.");
        }

    @Test
    public void userShouldDoClickOnWhishlistSucessfully(){

        whishListOnHTC.clickOnWishListHTC_Android();
        System.out.println(driver.findElement(By.cssSelector("p.content")).getText());
        //Assert.assertTrue(driver.findElement(By.cssSelector("p.content")).getText().contains("The product has been added to your wishlist"));
        utils.assertTrue(By.cssSelector("p.content"),"The product has been added to your wishlist");
    }
    @Test
    public void userShouldBeLogOutSuccessfully(){
        homePage.navigateToRegisterPage();
        ragisterPage.ragisterUser();
        ragisterPage.logOut();
        String actualLOginButtenText=driver.findElement(By.className("ico-login")).getText();
        System.out.println(actualLOginButtenText);
        Assert.assertEquals(actualLOginButtenText,"Log in");
    }
    @Test
    public void userShouldBeAbleToSearchProductSuccessfully(){

        homePage.searchProduct(productToSearch);
        String expectedUrlAfterSearch = "http://demo.nopcommerce.com/search?q="+"product name";

        String actualUrl=driver.getCurrentUrl();

        Assert.assertEquals(actualUrl,expectedUrlAfterSearch);
//        Assert.assertTrue(searchedUrl.contains("laptop1"));
    }
    @Test
    public void userShouldBeAbleToRegisterSuccessfully(){
        homePage.navigateToRegisterPage();
        ragisterPage.ragisterUser();
        String acualMsg=driver.findElement(By.cssSelector("div.result")).getText();
        Assert.assertEquals(acualMsg,registerComfirmExpectedMSG);
    }

}

