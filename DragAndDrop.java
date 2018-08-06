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

public class DragAndDrop {
    WebDriver driver;
    String baseUrl;
    baseClass baseObject;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver", "/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://jqueryui.com/droppable/";
        baseObject = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
    }

    @Test
    public void testdragAndDrop() throws InterruptedException {
        driver.get(baseUrl);
        Thread.sleep(2000);
        driver.switchTo().frame(0);

        //WebElement fromElement = driver.findElement(By.id("draggable"));
        WebElement toElement = driver.findElement(By.id("droppable"));

        Actions action = new Actions(driver);

        //Drag and Drop, build and perform
        //action.dragAndDrop(fromElement,toElement).build().perform();

        //2. way: Click and hold, move to element, release, build and perform
        //action.clickAndHold(fromElement).moveToElement(toElement).release().build().perform();

        WebElement fromElement1 =  baseObject.getElement("draggable","id");
        WebElement toElement1 =  baseObject.getElement("droppable","id");
        action.clickAndHold(fromElement1).moveToElement(toElement1).release().build().perform();
        
    }

    @After
    public void tearDown() throws Exception {
        Thread.sleep(2000);
        driver.quit();
    }
}