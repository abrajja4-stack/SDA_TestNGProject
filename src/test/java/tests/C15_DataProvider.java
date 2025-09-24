package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import utilities.TestBase;

public class C15_DataProvider extends TestBase {

    @DataProvider
    public Object[][] getNames() {
        return new Object[][]{
                {"John"},
                {"Mary"},
                {"Tom"},
                {"Ken"}
        };
    }


    @Test(dataProvider = "getNames")
    void dataProviderTest01(String name) {
        System.out.println("Hello " + name + ". How are you?");
    }

    @Test(dataProvider = "Credentials")//Credentials data provider is in TestBase class. Since it is superclass of this class, we can use it.
    void dataProviderTest02(String username, String password) throws InterruptedException {
        System.out.println("Username: " + username + " || Password: " + password);
        driver.get("https://thinking-tester-contact-list.herokuapp.com/");
        driver.findElement(By.id("email")).sendKeys(username);
        driver.findElement(By.id("password")).sendKeys(password, Keys.ENTER);
        Thread.sleep(500);
        Assert.assertEquals(driver.findElement(By.id("error")).getText(), "Incorrect username or password");

    }}
