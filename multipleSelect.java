package tutorialselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class multipleSelect {
    WebDriver driver;
    String baseURL;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseURL = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.get(baseURL);
    }

    @Test
    public void multipleSelects() throws InterruptedException {
        WebElement element = driver.findElement(By.id("multiple-select-example"));
        Select selelement = new Select(element);
        Thread.sleep(2000);

        selelement.selectByValue("orange");
        System.out.print("Selected the orange by value");
        Thread.sleep(2000);

        selelement.deselectByValue("orange");
        System.out.print("\nOrange value deselected");
        Thread.sleep(2000);

        selelement.selectByVisibleText("Peach");
        System.out.print("\nSelected Peach");
        Thread.sleep(2000);

        selelement.selectByIndex(0);
        System.out.print("\nApple is on index 0");
        Thread.sleep(2000);

        //This is to select All Options
        List<WebElement> selectedOptions = selelement.getAllSelectedOptions();
        for (WebElement option : selectedOptions){
            System.out.print("\nPrint all selected options: " + option.getText());

        Thread.sleep(2000);
        }

        selelement.deselectAll();
        Thread.sleep(2000);
        System.out.print("\nAll items deselected");
    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}