import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageclasses.BaseClass;

import java.time.Duration;

class ElementNotFoundException extends Exception {
    // Constructor for the custom exception
    public ElementNotFoundException(String message) {
        super(message);  // Pass the message to the parent Exception class
    }
}

public class RetryLogic extends BaseClass {


    public WebElement findElementWithRetry(By locator) throws ElementNotFoundException {
        int attempts = 0;
        while (attempts < 3) {
            try {
               //Add explicity wait
                WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
                WebElement element= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@class='_1XjE3T']/span")));
                return element;
            } catch (NoSuchElementException | TimeoutException e) {
                attempts++;
                if (attempts == 3) {
                    throw new ElementNotFoundException("Element not found after 3 attempts");
                }
            }
        }
        return null; // This will never be reached due to exception throwing on 3rd failure
    }


}