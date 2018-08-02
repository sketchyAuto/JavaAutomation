package Automate;

import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.*;
import org.openqa.selenium.firefox.FirefoxDriver;


import java.io.File;
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

        /*
        WebElement flyingFrom = driver.findElement(By.xpath("//input[@id='flight-origin-hp-flight']"));
        WebElement flyingTo = driver.findElement(By.xpath("//input[@id='flight-destination-hp-flight']"));
        WebElement departDate = driver.findElement(By.id("flight-departing-hp-flight"));
        WebElement retrunDate = driver.findElement(By.xpath("//input[@id='flight-returning-hp-flight']"));
        */



        baseObject.enterText(By.id("flight-destination-hp-flight"),"New York, NY (JFK-John F. Kennedy Intl.)");
        baseObject.enterText(By.id("flight-origin-hp-flight"),"New York, NY (JFK-John F. Kennedy Intl.)");
        baseObject.enterText(By.id("flight-departing-hp-flight"),"08/01/2018");
        baseObject.enterText(By.xpath("//input[@id='flight-returning-hp-flight']"),"08/01/2018");
        //baseObject.enterText(By.id("gcw-flights-form-hp-fligh"),"").click();
        baseObject.getElement("//form[@id='gcw-flights-form-hp-flight']//button[@type='submit']","xpath").click();
        Thread.sleep(3000);

    }

    public static String getRandomString(int length) {
        StringBuilder fName = new StringBuilder();
        String characters = "abcdefghijklmnopqrstuwwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        for (int i = 0; i < length; i++) {
            int index = (int) Math.random() * characters.length();
            fName.append(characters.charAt(index));
        }
        return fName.toString();
    }


    @After
    public void tearDown() throws Exception {
        String fileName = getRandomString(5)+ ".png";
        String directory = "/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Factor1/ScreenShot/";
        File sourceFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(sourceFile, new File(directory + fileName));
        driver.close();
    }
}