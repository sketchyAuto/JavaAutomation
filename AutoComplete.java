package Automate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;
import Automate.baseClass;

import static org.junit.Assert.*;

public class AutoComplete{
    WebDriver driver;
    String baseUrl;
    private baseClass baseObject;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://www.southwest.com/";
        baseObject = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }
    @Test
    public void testAutoComplete(){
        driver.get(baseUrl);

        baseObject.enterText(By.id("air-city-departure"),"EWR");
        baseObject.enterText(By.id("air-city-arrival"),"EWR");

    }

    @After
    public void tearDown() throws Exception {
        driver.quit();
    }

}