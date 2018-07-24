package tutorialselenium;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class listOfRadioElements {
    WebDriver driver;
    private String baseUrl;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver();
        baseUrl = "https://learn.letskodeit.com/p/practice";
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(2000,TimeUnit.SECONDS);
        driver.get(baseUrl);
    }
    @Test
    public void listOfElements() throws Exception{
        //Finds all the WebElements
        boolean isChecked = false;
        List<WebElement> radioButtons = driver.findElements(By.xpath("//input[@type='radio'and@name='cars']"));
        int size = radioButtons.size();

        //Prints the size of the radio button
        System.out.print("Size of radio button: " + size +"\n");
        //Goes through the list and click every button
        for (int i=0; i<size; i++){
            isChecked = radioButtons.get(i).isSelected();
            //This gets the list of name for the attribute using the attribute value
            System.out.print("The text is :" +radioButtons.get(i).getAttribute("value")+"\n");

            if (!isChecked){
                radioButtons.get(i).click();
                Thread.sleep(2000);
            }
        }

    }

    @After
    public void tearDown() throws Exception {
        driver.close();
    }
}
