package tutorialselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class hiddenOrDisplayed {

    private WebDriver driver;
    private String baseURL1;
    private String baseURL2;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
        baseURL1 = "https://learn.letskodeit.com/p/practice";
        baseURL2 = "https://www.expedia.co.uk";

    }

    @Test
    public void hiddenDisplayed() throws InterruptedException {
        driver.get(baseURL1);
        WebElement textBox = driver.findElement(By.id("displayed-text"));
        System.out.println("Text Box is Displayed: "+ textBox.isDisplayed());
        Thread.sleep(1000);

        //Click on Hide button
        WebElement hiddenButton = driver.findElement(By.id("hide-textbox"));
        hiddenButton.click();
        System.out.println("Is the Tetxbox displayed after clicking on Hide button: " + textBox.isDisplayed());
        Thread.sleep(2000);

        //Click on Show button
        WebElement showtextbox = driver.findElement(By.id("show-textbox"));
        showtextbox.click();
        System.out.println("Is the textbox displayed after clicking on Show button?: " + showtextbox.isDisplayed());
        Thread.sleep(1000);

    }

    @Test
    public void expediatest() throws InterruptedException {
        driver.get(baseURL2);

        //Gets the dropdown boxes
        WebElement dropdownvalues = driver.findElement(By.xpath("//select[@id='package-1-children-hp-package']"));
        Select selChildrenDropDown = new Select(dropdownvalues);
        Thread.sleep(1000);


        //This selects the using the index. if index is 0 the output will be false
        System.out.print("Children Selected is 1\n");
        selChildrenDropDown.selectByIndex(1);
        Thread.sleep(2000);

        //This test will fail as the hidden field is not in the DOM and not hidden. Only appears when the user select 1 or more and not 0
        WebElement childrenDropdown = driver.findElement(By.id("package-1-age-select-1-hp-package"));
        System.out.println("Child Age textbox Available?: " + childrenDropdown.isDisplayed());
        Thread.sleep(1000);

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}