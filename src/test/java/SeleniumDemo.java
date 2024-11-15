import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class SeleniumDemo {
    public static void main(String[] args) {
        // Set the path to the WebDriver executable
        System.setProperty("webdriver.edge.driver", "C:/Users/pawad/Downloads/edgedriver_win64/msedgedriver.exe");
//System.setProperty()-System.setProperty() is crucial for informing
// the Java application about the location of external resources,


        WebDriver driver = new EdgeDriver();
        // Navigate to a web page
        driver.get("https://www.flipkart.com");

        // Find an element (for example, a button or input field)
        WebElement element = driver.findElement(By.xpath("//input[@type='text']")); // Example: finding an input field by name

        // Interact with the element
        element.sendKeys("Mobile"); // Type text into the input field
        element.click();
        //WebElement element1 = driver.findElement(By.xpath("//a[contains(@href,'viewcart')]"));
        //WebElement login= driver.findElement(By.xpath("//button[@class='QqFHMw aEsfVh _7Pd1Fp']/span"));
        //login.sendKeys("mobile");
        WebElement dropdown = driver.findElement(By.xpath("//input[@class='cPHDOP col-12-12']"));
        Select select = new Select(dropdown);

    }
}
