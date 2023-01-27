/*1. userShouldNavigateToRegisterPageSuccessfully

* click on the ‘Register’ link
* Verify the text ‘Register’

2. userShouldRegisterAccountSuccessfully

* click on the ‘Register’ link
* Select gender radio button
* Enter First name
* Enter Last name
* Select Day Month and Year
* Enter Email address
* Enter Password
* Enter Confirm password
* Click on REGISTER button

* Verify the text 'Your registration completed’*/
package testsuit;

import browserfactory.BaseTest;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class RegisterTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }

    @Test
    public void RegisterLink() {
        WebElement RegisterLink = driver.findElement(By.xpath("//a[@class='ico-register']"));
        RegisterLink.click();


            WebElement RegisterText = driver.findElement(By.xpath("//div[@class='page-title']//h1"));
            String actualText = RegisterText.getText();
            String expectedText = "Register";
            assertEquals(expectedText, actualText);
        }
        @Test
        public void RegisterAccount () {
            WebElement RegisterAccount = driver.findElement(By.xpath("//a[@class='ico-register']"));
            RegisterAccount.click();

            WebElement genderradio=driver.findElement(By.xpath("//input[@id='gender-male']"));
            genderradio.click();

            WebElement name=driver.findElement(By.xpath("//input[@name='FirstName']"));
            name.sendKeys("jit");

            WebElement lastname=driver.findElement(By.xpath("//input[@name='LastName']"));
            lastname.sendKeys("pat");

            WebElement email=driver.findElement(By.xpath("//input[@name='Email']"));
            email.sendKeys("jiten4@gmail.com");

            WebElement password=driver.findElement(By.xpath("//input[@id='Password']"));
            password.sendKeys("123456");

            WebElement ConfirmPassword=driver.findElement(By.xpath("//input[@name='ConfirmPassword']"));
            ConfirmPassword.sendKeys("123456");

            WebElement RegisterButton=driver.findElement(By.xpath("//button[@name='register-button']"));
            RegisterButton.click();

            WebElement RegistrationCompleted=driver.findElement(By.xpath("//div[@class='result']"));
            String actualText = RegistrationCompleted.getText();
            String expectedText = "Registration completed";
            Assert.assertEquals(expectedText,actualText);


        }
    }
