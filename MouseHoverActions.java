package ActionsClass;

import Automate.baseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class MouseHoverActions {
    WebDriver driver;
    String baseUrl;
    baseClass baseObject;
    private JavascriptExecutor js;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        baseObject = new baseClass(driver);
        js = (JavascriptExecutor) driver;
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
    }

    @Test
    public void testMouseHoverActions () throws InterruptedException {
        driver.get(baseUrl);
        js.executeScript("window.scrollBy(0, 600)");
        Thread.sleep(3000);
        baseObject.getElement("mousehover","id");
        Actions action = new Actions(driver);
        action.moveToElement(baseObject.getElement("mousehover","id")).perform();
        Thread.sleep(2000);
        baseObject.getElement("//div[@class='mouse-hover-content']//a[text()='Top']","xpath").click();
        //action.moveToElement(baseObject.getElement("//div[@class='mouse-hover-content']//a[text()='Top']","xpath")).click().perform();



    }

    @After
    public void tearDown () throws Exception {
        Thread.sleep(2000);
        driver.quit();

    }
}
