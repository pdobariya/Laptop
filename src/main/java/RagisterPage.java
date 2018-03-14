import org.apache.http.util.Asserts;
import org.openqa.selenium.By;
import org.testng.Assert;

public class RagisterPage extends Utils   {


public void ragisterUser (){
    String email= "angel"+randomDate()+"patel@gmail.com";
   System.out.println(email);

    clickElement(By.id("gender-female"));
    enterText(By.id("FirstName"),"angel");
    enterText(By.id("LastName"),"patel");
    //waitForElementVIsible(By.id("thanks"),20);
    enterText(By.id("Email"),email);
    enterText(By.id("Company"),"Unique Testing");
    enterText(By.id("Password"),"patel1234");
    enterText(By.id("ConfirmPassword"),"patel1234");
    clickElement(By.id("register-button"));

}
public void logOut(){
    clickElement(By.linkText("Log out"));

}
public void ragisterWithoutEnterTheData(){
    clickElement(By.xpath("//input[@id='register-button']"));
}
public void sendEmailToFriend(){
    clickElement(By.name("register-continue"));
    clickElement(By.linkText("Apple MacBook Pro 13-inch"));
    clickElement(By.xpath("//input[@value='Email a friend']"));
    enterText(By.id("FriendEmail"),"poojapatel12@gmail.com");
    enterText(By.id("PersonalMessage"),"Hello pooja , Please check this item ");
    clickElement(By.name("send-email"));
}
public void submitAndVerifyTheReview(){
    clickElement(By.name("register-continue"));
    clickElement(By.linkText("Apple MacBook Pro 13-inch"));
    clickElement(By.linkText("Add your review"));
    enterText(By.id("AddProductReview_Title"),"Mac Book");
    enterText(By.id("AddProductReview_ReviewText"),"hello, This Item Is Amazing And I Am so Happy To Buy It");
    clickElement(By.id("addproductrating_4"));
    clickElement(By.name("add-review"));





}
}







//"ddMMMyyHHmmss"