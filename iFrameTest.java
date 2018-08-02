package Automate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class iFrameTest {
    WebDriver driver;
    String baseUrl;
    baseClass baseObject;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";;
        baseObject = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void iFrameSwitch() throws InterruptedException {

        //Accessing the iFrame by id/or name
        driver.switchTo().frame("courses-iframe");
        //You can use iframe number by trying numbers from 0 until we find what iframe we want
        //--driver.switchTo().frame(0);
        baseObject.enterText(By.id("search-courses"),"Python");
        Thread.sleep(2000);
        driver.switchTo().defaultContent();
        baseObject.enterText(By.id("name"),"Test Successful");
    }
    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}