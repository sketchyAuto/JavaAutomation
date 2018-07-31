package Automate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class ScreenShots {
    WebDriver driver;
    String baseUrl;
    baseClass baseObject;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://www.expedia.com/#";
        baseObject = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void screenShots() throws InterruptedException {
        driver.get(baseUrl);
        driver.findElement(By.id("tab-flight-tab-hp")).click();
        Thread.sleep(3000);

        WebElement flyingFrom = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
        WebElement flyingTo = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        WebElement departDate = driver.findElement(By.id("flight-departing-hp-flight"));
        WebElement retrunDate = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));


        baseObject.enterText(By.id("air-city-departure"),"EWR");
        baseObject.enterText(By.id("air-city-arrival"),"EWR");



        //S


    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }
}