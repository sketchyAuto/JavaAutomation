package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class RadioButtonAndCheckboxes {
    WebDriver driver;


    String baseUrl;

    @org.junit.Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseUrl);
    }


    @org.junit.Test
    public void test() throws InterruptedException{
        //Selecting a Radio Button
        WebElement bmwRadiobtn = driver.findElement(By.id("bmwradio"));
        bmwRadiobtn.click();
        Thread.sleep(2000);

        WebElement benzRadioBtn = driver.findElement(By.id("benzradio"));
        benzRadioBtn.click();
        Thread.sleep(2000);

        //Selecting a checkbox
        WebElement bmwCheckBox = driver.findElement(By.id("bmwcheck"));
        bmwCheckBox.click();

        WebElement benzCheckBox = driver.findElement(By.id("benzcheck"));
        benzCheckBox.click();
        Thread.sleep(2000);

        //Checking if a radiobutton is Selected
        System.out.print("Bmw Radio is seleted: "+bmwRadiobtn.isSelected());
        System.out.print("\nBenz Radio is selected: "+ benzRadioBtn.isSelected());
        System.out.print("\nBmw checkbox is selected: "+ bmwCheckBox.isSelected());
        System.out.print("\nBenz checkbox is selected: " + benzCheckBox.isSelected());

    }

    @org.junit.After
    public void tearDown() throws Exception {
        driver.close();

    }
}