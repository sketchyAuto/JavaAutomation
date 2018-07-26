package Automate;

import com.google.common.annotations.VisibleForTesting;
import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import Automate.baseClass;


import static java.lang.Thread.sleep;
import static org.junit.Assert.*;

public class baseTest {

    private WebDriver driver;
    private String baseUrl;
    private baseClass bc;

    @org.junit.Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        bc = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void test1()throws InterruptedException {
        driver.get(baseUrl);
        //Find a single elements
        WebElement element = bc.getElement("name","id");
        element.sendKeys("Tested");
        Thread.sleep(2000);
    }

    @org.junit.After
    public void tearDown() throws Exception {
        driver.quit();
    }
}