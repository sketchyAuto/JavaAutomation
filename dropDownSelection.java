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

public class dropDownSelection {
    WebDriver driver;
    String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = ("http://automationpractice.com/index.php?id_category=3&controller=category");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }

    @Test
    public void dropDownTest() throws Exception{
        WebElement dropdownvalues = driver.findElement(By.id("selectProductSort"));
        Select selDropDown = new Select(dropdownvalues);
        Thread.sleep(2000);


        //This selects the using the value of the text
        System.out.print("Price Lower first\n");
        selDropDown.selectByValue("position:asc");
        Thread.sleep(5000);

        //THis select the dropdown text using the index value
        System.out.print("A - Z \n");
        selDropDown.selectByIndex(3);
        Thread.sleep(5000);

        //This Selects a dropdown text using the text visible to the user
        System.out.print("Highest First\n");
        selDropDown.selectByVisibleText("Price: Highest first");
        Thread.sleep(5000);



        //Prints all the List Options available
        System.out.print("Prints all the lists: \n");
        List<WebElement> options = selDropDown.getOptions();
        int size = options.size();
        for (int i=0; i<size; i++){
            String optionName = options.get(i).getText();
            System.out.print(optionName +"\n");
        }
    }


    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}