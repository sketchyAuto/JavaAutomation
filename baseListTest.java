package Automate;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;
import Automate.baseClass;

public class baseListTest {
    WebDriver driver;
    String baseUrl;
    private baseClass baseObject;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        baseObject = new baseClass(driver);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
    }

    @Test
    public void listTest(){

        driver.get(baseUrl);
        //Finding if element is Present
        boolean results = baseObject.isElementPresent("name","id");
        System.out.println("Is Element Present: "+ results);
        //Negative
        boolean results1 = baseObject.isElementPresent("name-on-present","id");
        System.out.println("Is Element Present: "+ results1);

        //Finding by List
        List <WebElement> elementLists = baseObject.getElementLists("//input[@type='text']","xpath");
        int size = elementLists.size();
        System.out.println("Size of the list is: " + size);

    }

    @After
    public void tearDown() throws Exception {
        driver.close();

    }
}