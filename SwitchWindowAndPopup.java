package Automate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class SwitchWindowAndPopup {
    WebDriver driver;
    String baseUrl;
    baseClass baseObject;


    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        baseObject = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void switchWindow() throws InterruptedException {
        //This is to get the first window in focus (handle)
        String parentHandle = driver.getWindowHandle();
        System.out.println("Parent Handle: "+ parentHandle);

        //Find Open Window button
        baseObject.getElement("openwindow","id").click();

        //Get all handles
        Set<String> handles = driver.getWindowHandles();
        for (String handle: handles){
            System.out.println(handle);
            //This switches the handle to the new window
            if(!handle.equals(parentHandle)){
                driver.switchTo().window(handle);
                Thread.sleep(3000);
                baseObject.enterText(By.id("search-courses"),"Python");
                driver.manage().window().maximize();
                Thread.sleep(3000);
                driver.close();
                break;
            }
        }
        //Switch back to Parent window
        driver.switchTo().window(parentHandle);
        baseObject.enterText(By.id("name"),"Thesis");
    }

    @Test
    public void testJavaScriptPopup() throws InterruptedException {
        baseObject.enterText(By.id("name"),"Emmanuel");
        baseObject.getElement("alertbtn","id").click();
        Thread.sleep(3000);
        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    @Test
    public void testJavaScriptPopup1() throws InterruptedException {
        baseObject.enterText(By.id("name"),"Emmanuel");
        baseObject.getElement("confirmbtn","id").click();
        Thread.sleep(3000);
        Alert  alert = driver.switchTo().alert();
        //alert.accept();
        alert.dismiss();
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}