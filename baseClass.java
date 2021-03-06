package Automate;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.ArrayList;
import java.util.List;

public class baseClass {
    WebDriver driver;

    //Create a constructor
    public baseClass(WebDriver driver) {
        this.driver = driver;
    }

    //For Finding an an Element
    public WebElement getElement(String locator, String type) {
        type = type.toLowerCase();
        if (type.equals("id")) {
            System.out.println("Element found with: " + locator);
            return this.driver.findElement(By.id(locator));
        } else if (type.equals("xpath")) {
            System.out.println("Element found with: " + locator);
            return this.driver.findElement(By.xpath(locator));
        } else {
            System.out.println("Locator type is not supported");
            return null;
        }
    }

    //For finding List of Element
    public List<WebElement> getElementLists(String locator, String type) {
        type = type.toLowerCase();
        List<WebElement> elementList = new ArrayList<WebElement>();

        if (type.equals("id")) {
            elementList = this.driver.findElements(By.id(locator));
        } else if (type.equals("xpath")) {

            elementList = this.driver.findElements(By.xpath(locator));
        }
        else if (type.equals("name")) {

            elementList = this.driver.findElements(By.name(locator));
        }
        else {
            System.out.println("Locator type is not supported");
        }

        if (elementList.isEmpty()) {
            System.out.println("Element not found with: " + type + ":" + locator);
        } else {
            System.out.println(("Element found with: " + type + ": " + locator));
        }
        return elementList;

    }

    //Finding if an Element is present or not
    public boolean isElementPresent(String locator, String type) {
        List<WebElement> elementList = getElementLists(locator, type);
        int size = elementList.size();
        if (size > 0) {
            return true;
        } else {
            return false;
        }

    }

    public WebElement waitForElement(By locator, int timeout) {
        WebElement element = null;
        try {
            System.out.println("Waiting for max: " + timeout + " seconds for element to be available");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
            System.out.println("Element appeared on the web page");

        } catch (Exception e) {
            System.out.println(("Element not appearing on the web page."));
        }
        return element;
    }

    public void clickWhenReady(By locator, int timeout) {

        try {
            WebElement element = null;
            System.out.println("Waiting for max: " + timeout + " seconds for element to be clickable");

            WebDriverWait wait = new WebDriverWait(driver, 3);
            element = wait.until(ExpectedConditions.elementToBeClickable(locator));
            System.out.println("Element Clicked");
            element.click();

        } catch (Exception e) {
            System.out.println(("Element not appearing on the web page."));
        }

    }

    public void enterText(By locator, String text){
        WebElement element = driver.findElement(locator);
        element.sendKeys(text);

    }

}
