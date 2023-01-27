package testsuit;/*1. userShouldNavigateToComputerPageSuccessfully

* click on the ‘Computers’ Tab
* Verify the text ‘Computers’

2. userShouldNavigateToElectronicsPageSuccessfully

* click on the ‘Electronics’ Tab
* Verify the text ‘Electronics’

3. userShouldNavigateToApparelPageSuccessfully

* click on the ‘Apparel’ Tab
* Verify the text ‘Apparel’

4.
userShouldNavigateToDigitalDownloadsPageSuccessfully
* click on the ‘Digital downloads’ Tab
* Verify the text ‘Digital downloads’
5. userShouldNavigateToBooksPageSuccessfully

* click on the ‘Books’ Tab
* Verify the text ‘Books’

6. userShouldNavigateToJewelryPageSuccessfully

* click on the ‘Jewelry’ Tab
* Verify the text ‘Jewelry’

7. userShouldNavigateToGiftCardsPageSuccessfully

* click on the ‘Gift Cards’ Tab
* Verify the text ‘Gift Cards’package testsuit;*/

import browserfactory.BaseTest;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import static org.junit.Assert.assertEquals;

public class TopMenuTest extends BaseTest {
    String baseurl = "https://demo.nopcommerce.com/";

    @Before
    public void setup() {
        openBrowser(baseurl);
    }
    @Test
    public void  userShouldNavigateToComputerPageSuccessfully(){
        //Click on the computer tab
        WebElement mobileLink =driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers ']"));
        mobileLink.click();

        //Verify the text Computers
        WebElement Computers=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Computers']"));
        String actualText=Computers.getText();
        String expectedText="Computers";
        assertEquals(expectedText,actualText);

    }

    @Test
    public void userShouldNavigateToElectronicsPageSuccessfully(){
        //click on Electronics tab
        WebElement ElectronicsLink =driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        ElectronicsLink.click();

        //Verify the text Electronics
        WebElement Electronics=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Electronics ']"));
        String actualText=Electronics.getText();
        String expectedText="Electronics";
        assertEquals(expectedText,actualText);

    }
    @Test
    public void userShouldNavigateToApparelPageSuccessfully(){
        //Click on Apparel tab
        WebElement apparelLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        apparelLink.click();

        //Verify the text Apparel
        WebElement Apparel=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Apparel ']"));
        String actualText=Apparel.getText();
        String expectedText="Apparel";
        assertEquals(expectedText,actualText);
    }

    @Test
    public void userShouldNavigateToBooksPageSuccessfully(){
        //click on the Books Tab
        WebElement BookLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        BookLink.click();

        //Verify the text Books
        WebElement Books=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Books ']"));
        String actualText=Books.getText();
        String expectedText="Books";
        assertEquals(expectedText,actualText);


    }

    @Test
    public void userShouldNavigateToJewelryPageSuccessfully(){
        //click on the Jewelry Tab
        WebElement jewelryLink=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        jewelryLink.click();

        //Verify the text Jewelry
        WebElement Jewelry=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Jewelry ']"));
        String actualText=Jewelry.getText();
        String expectedText="Jewelry";
        assertEquals(expectedText,actualText);


    }

    @Test
    public void userShouldNavigateToGiftCardsPageSuccessfully(){
        //click on the Gift Cards Tab
        WebElement giftCard=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        giftCard.click();

        WebElement gift=driver.findElement(By.xpath("//ul[@class='top-menu notmobile']//a[text()='Gift Cards ']"));
        String actualText=gift.getText();
        String expectedText="Gift Cards";
        assertEquals(expectedText,actualText);

    }


    @After
    public void teardown(){
        //closeBrowser();
    }



}
