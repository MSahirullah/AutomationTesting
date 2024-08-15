package LoadUrl;

//Browser Automation

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoadUrl {

    //WebDriver Global Variable
    WebDriver driver;

    @BeforeMethod
    public void initializeBrowser() {
        // Create a browser instance
        driver = new ChromeDriver();

        //Load a URL in the browser
        driver.get("https://odel.lk/");
    }

    // Perform a task
    @Test
    public void test_one(){
        System.out.println("This is test one");
    }

    // Close the browser
    @AfterMethod
    public void closeBrowser(){
        driver.close();
    }
}

