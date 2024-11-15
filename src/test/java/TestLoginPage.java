import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageclasses.BaseClass;

import java.time.Duration;
import java.util.NoSuchElementException;


public class TestLoginPage {

    private WebDriver driver;
    BaseClass baseclass = new BaseClass();
    private String edge;

    @Before
    public void setUp() {
        BaseClass baseClass = new BaseClass();
        baseClass.setUp(edge); // Initialize WebDriver
    }

    @Test
    public void testLoginWithEmail() {
        WebElement login = driver.findElement(By.xpath("//img[@class='-dOa_b L_FVxe']"));
        login.click();
        WebElement email = driver.findElement(By.xpath("//input[@class='r4vIwl BV+Dqf']"));
        email.sendKeys("shwetasarap12010@gmail.com");
        WebElement requestOtp = driver.findElement(By.xpath("//button[@class='QqFHMw twnTnD _7Pd1Fp']"));

        requestOtp.click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
        // Wait until the alert is present
        wait.until(ExpectedConditions.alertIsPresent());
        Alert alert = driver.switchTo().alert();

        String actual = alert.getText();
        String expected = "Verification code sent to shwetasarap12010@gmail.com";
        if (actual.equals(expected)) {
            System.out.println("Email verified");
        } else {
            System.out.println("Alert message is NOT as expected.");
        }
    }

    @Test
    public void testLoginWithRetry() {

        try {
            RetryLogic retryLogic = new RetryLogic();
            WebElement element = retryLogic.findElementWithRetry(By.xpath("//*[@class='_1XjE3T']/span"));
            System.out.println("Element found: " + element.getText());
        } catch (ElementNotFoundException e) {
            System.out.println("Exception: " + e.getMessage());
        } finally {
            baseclass.tearDown();
        }
    }

    @Test
    public void testNoninteractiveElement() {
        driver.get("https://www.flipkart.com/search?q=Samsung%20Galaxy%20S21%20Ultra%205G%20%28Phantom%20Black%2C%20256%20GB&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=off&as=off"); // Use the actual URL of a Flipkart product

        //Fluent wait
        Wait<WebDriver> wait= new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(10))
                .ignoring(NoSuchElementException.class);
        WebElement noninteractiveelement=  wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='Y9obZf']")));

        String text = noninteractiveelement.getText();
        System.out.println("Text is" + text);
    }


    @Test
    public void testNoninteractiveElementAttribute() {
        driver.get("https://www.flipkart.com"); // Use the actual URL of a Flipkart product

        // Wait for the page to load (can be replaced with WebDriverWait for better handling)
        try {
            Thread.sleep(5000); // Sleep for 5 seconds (not recommended for production)
            WebElement noninteractiveelement = driver.findElement(By.xpath("//input[@name='marketplace']"));
            String text = noninteractiveelement.getAttribute("value");
            System.out.println("Text is " + text);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }


    @Test
    public void testUsingConfig() {
        Utilities configReader = new Utilities();

        String baseUrl = configReader.getProperty("base.url");
        String username = configReader.getProperty("username");
        String password = configReader.getProperty("password");
        int timeout = Integer.parseInt(configReader.getProperty("timeout"));

        // Use the properties in your test
        System.out.println("Base URL: " + baseUrl);
        System.out.println("Username: " + username);
        // Perform your test logic here
    }


    }









