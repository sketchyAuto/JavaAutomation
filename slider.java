package ActionsClass;

import Automate.baseClass;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.*;

public class slider {
    WebDriver driver;
    String baseUrl;
    baseClass baseObject;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://jqueryui.com/slider/";
        baseObject = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
    }

    @Test
    public void testSliderActions() throws InterruptedException {
        driver.get(baseUrl);
        driver.switchTo().frame(0);
        Thread.sleep(3000);
        WebElement element = driver.findElement(By.xpath("//div[@id='slider']"));
        Actions action = new Actions(driver);
        action.dragAndDropBy(element, 50,0).perform();


    }
    @After
    public void tearDown() throws Exception {
        Thread.sleep(3000);
        driver.quit();
    }
}