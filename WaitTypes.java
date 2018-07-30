package Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitTypes {
    WebDriver driver;

    //Constructor for the Wait Types
    public WaitTypes(WebDriver driver){
        this.driver = driver;
    }

    public WebElement waitForElement(By locator, int timeout){
        WebElement element = null;
        try{
            System.out.println("Waiting for max: " + timeout + " seconds for element to be available");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("Element appeared on the web page");

        } catch (Exception e){
            System.out.println(("Element not appearing on the web page."));
        }
        return element;
    }

    public void clickWhenReady(By locator, int timeout){

        try{
            WebElement element = null;
            System.out.println("Waiting for max: " + timeout + " seconds for element to be clickable");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            System.out.println("Element Clicked");
            element.click();

        } catch (Exception e){
            System.out.println(("Element not appearing on the web page."));
        }

    }


}
