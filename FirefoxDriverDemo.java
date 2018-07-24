package tutorialselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class FirefoxDriverDemo {

    public static void main(String[] args) throws InterruptedException {

//Firefox
        WebDriver driver;
        System.setProperty("webdriver.gecko.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/geckodriver");
        driver = new FirefoxDriver(); //Brings up an instance of firefox browser
        String baseURL = "http://automationpractice.com";// brings up the URL

        //CHROME
        //WebDriver driver;
        //System.setProperty("webdriver.chrome.driver","/home/emmanuel.asmah@samba.sheffield.thefloow.com/Documents/Automation/Selenium/chromedriver");
        //driver = new ChromeDriver();
        //String baseURL = "http://automationpractice.com/index.php";
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get(baseURL);



        driver.findElement(By.id("search_query_top")).sendKeys("dress");
        driver.findElement(By.name("submit_search")).click();
        Thread.sleep(2000);

        driver.close();


    }

}
