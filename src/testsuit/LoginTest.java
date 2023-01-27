/*1. userShouldNavigateToLoginPageSuccessfully

        * click on the ‘Login’ link
        * Verify the text ‘Welcome, Please Sign

        In!’
        2. userShouldLoginSuccessfullyWithValidCredentials

        * click on the ‘Login’ link
        * Enter valid username
        * Enter valid password
        * Click on ‘LOGIN’ button
        * Verify the ‘Log out’ text is display

        3. verifyTheErrorMessage

        * click on the ‘Login’ link
        * Enter invalid username
        * Enter invalid password
        * Click on Login button
        * Verify the error message ‘Login was unsuccessful.
        Please correct the errors and try again. No customer account found’*/






package testsuit;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class LoginTest extends BaseTest {
    String baseurl ="https://demo.nopcommerce.com/";

        @Before
        public void setup(){openBrowser(baseurl);}
       @Test
    public void login(){
           //click on login link
           WebElement loginInLink=driver.findElement(By.xpath("//a[@class='ico-login']"));
           loginInLink.click();
           //verify welcome message
           WebElement welcomeMsg=driver.findElement(By.xpath("//h1[contains(text(),'Welcome, Please Sign In!')]"));
           String actualText=welcomeMsg.getText();
           String expectedText="Welcome, Please Sign In!";
           Assert.assertEquals(expectedText,actualText);


       }
    @Test
    public void userShouldLoginSuccessFullyWithValidCredentials(){
        //click on login link
        WebElement loginInLink= driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginInLink.click();

        //enter email id in to email field
        WebElement emailIdField=driver.findElement(By.xpath("//input[@class='email']"));
        emailIdField.sendKeys("jiten@gmail.com");

        //enter password into password field
        WebElement passwordField=driver.findElement(By.xpath("//input[@class='password']"));
        passwordField.sendKeys("123456");

        //click on login button
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        WebElement logOutLink=driver.findElement(By.xpath("//a[@class='ico-logout']"));
        String actualText=logOutLink.getText();
        String expectedText="Log out";
        Assert.assertEquals(expectedText,actualText);
}
    @Test
    public void verifyTheErrorMessage(){
        //click on login link
        WebElement loginInLink= driver.findElement(By.xpath("//a[@class='ico-login']"));
        loginInLink.click();

        //enter email id in to email field
        WebElement emailIdField=driver.findElement(By.xpath("//input[@class='email']"));
        emailIdField.sendKeys("jiten1@gmail.com");

        //enter password into password field
        WebElement passwordField=driver.findElement(By.xpath("//input[@class='password']"));
        passwordField.sendKeys("123456@");

        //click on login button
        WebElement loginButton=driver.findElement(By.xpath("//button[contains(text(),'Log in')]"));
        loginButton.click();

        WebElement ErrorMessage =driver.findElement(By.xpath("//div[@class='message-error validation-summary-errors']"));
        String actualText=ErrorMessage.getText();
    }
}



