package Utilities;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class waitTypesTest {
    WebDriver driver;
    String baseUrl;
    WaitTypes waitType = new WaitTypes(driver);

    @Before
        public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://letskodeit.teachable.com/pages/practice";
        waitType = new WaitTypes(driver);
        driver.manage().window().maximize();
    }

    @Test
        public void test1() throws Exception{
        driver.get(baseUrl);
        //Find an elements
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        loginLink.click();

        WebElement emailField = waitType.waitForElement(By.id("user_email"), 3);
        emailField.sendKeys("test");

        waitType.clickWhenReady(By.name("commit"), 3);
    }

    @After
        public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();

    }
}