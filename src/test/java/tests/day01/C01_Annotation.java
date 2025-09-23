package tests.day01;

import org.testng.annotations.*;

public class C01_Annotation {


    /*
@BeforeSuite-@AfterSuite : Runs before/after all tests in this package. Executes only once.
@BeforeTest-@AfterTest : Runs before/after all test methods. Executes only once.
@BeforeClass-@AfterClass : Runs before/after all test methods in a test class. Executes only once.
@BeforeGroups-@AfterGroups : Runs before/after any specific test group. Executes only once.
@BeforeMethod-@AfterMethod : Runs before/after each test method.
 */


    @BeforeSuite
    void beforeSuite(){
        System.out.println("@BeforeSuite");
    }



    @AfterSuite
    void afterSuite(){
        System.out.println(" @AfterSuite");

    }

    @BeforeTest
    void before(){
        System.out.println(" @BeforeTest");
    }


    @AfterTest
    void aftertest(){
        System.out.println("@AfterTest");
    }

    @BeforeClass
    void beforclass(){
        System.out.println("@BeforeClass");
    }


    @AfterClass
    void afterclass(){
        System.out.println("@afterclass");
    }



    @BeforeMethod
    void beformethod(){
        System.out.println("@BeforeMethod");
    }

@AfterMethod
void aftermethod(){
    System.out.println("@AfterMethod");
}







    @Test
    public void test1() {
        System.out.println("Test1");
    }


    @Test
    public void test2() {
        System.out.println("Test2");
    }


    @Test
    public void test3() {
        System.out.println("Test3");
    }


    @Test
    public void test4() {
        System.out.println("Test4");
    }

    @Test
    public void test5() {
        System.out.println("Test5");
    }

    /*
        @BeforeSuite
        @BeforeTest
        @BeforeClass
        @BeforeMethod
        @Test
        @AfterMethod
        @AfterClass
        @AfterTest
        @AfterSuite
     */







}
