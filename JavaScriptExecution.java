package Automate;

import org.bouncycastle.jcajce.provider.drbg.DRBG;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class JavaScriptExecution {
    WebDriver driver;
    //String baseUrl;
    private JavascriptExecutor js;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(000,TimeUnit.SECONDS);

    }

    @Test
    public void testJavaScriptExecution() throws InterruptedException {
        //JavaScript to find an Element and SendKeya
        js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
        Thread.sleep(3000);
        WebElement textBox = (WebElement) js.executeScript("return document.getElementById('name');");
        textBox.sendKeys("test");
        Thread.sleep(3000);
    }

    @Test
    public void testJavaScriptWindowSize() throws InterruptedException {
        //JavaScript Window size
        js.executeScript("window.location = 'https://learn.letskodeit.com/p/practice';");
        Thread.sleep(3000);
        //Size of Window
        long height = (Long) js.executeScript("return window.innerHeight;");
        long width = (Long) js.executeScript("return window.innerWidth;");


        System.out.println("Height is: "+ height);
        System.out.println("Weight is: "+ width);

    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.close();
    }
}