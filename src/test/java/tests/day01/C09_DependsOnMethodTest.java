package tests.day01;

import org.testng.annotations.Test;
import utilities.TestBase;

public class C09_DependsOnMethodTest  extends TestBase {


    @Test
    public void feceboktest() {

     driver.get("https://facebook.com");

    }

    @Test(dependsOnMethods = "feceboktest")
    public void googel() {
        driver.get("https://google.com");
    }


    @Test(dependsOnMethods = {"googel","feceboktest"})
    public void amazon() {
        driver.get("https://amazon.com");
    }
}
