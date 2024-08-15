package testng_annotation;

import org.testng.annotations.*;

public class Annotations {

    //defualt is 0 - 0 has the highest priority
    // if defined priority and undefined one is performed first, bcz it has 0

    @Test
    public void test_two(){
        System.out.println("Test Two");
    }

    @Test(dependsOnMethods = "test_two")
    public void test_four(){
        System.out.println("Test Four");
    }

    @Test(priority = 1)
    public void test_three(){
        System.out.println("Test Three");
    }

    @Test(priority = 2, dependsOnMethods = "test_four")
    public void test_one(){
        System.out.println("Test One");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("Before Method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("After Method");
    }

    @BeforeTest
    public void beforeTest(){
        System.out.println("Before Test");
    }

    @AfterTest
    public void afterTest(){
        System.out.println("After Test");
    }

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("Before Suite");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("After Suite");
    }

    @BeforeClass
    public void beforeClass(){
        System.out.println("Before Class");
    }

    @AfterClass
    public void afterClass(){
        System.out.println("After Class");
    }
}
