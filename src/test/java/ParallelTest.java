import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import pageclasses.BaseClass;
import java.net.MalformedURLException;
import static org.junit.Assert.assertTrue;


public class ParallelTest {
    private WebDriver driver;

    @Before
    public void setup() throws MalformedURLException {
        // Manually set the browser to use (You can modify this logic to accept the browser type dynamically)
        String browser = "chrome"; // Default to Chrome, you can change this or make it dynamic
        driver = BaseClass.setUp(browser);
    }

    @Test
    public void testGoogleTitle() {
        driver.get("https://www.google.com");
        assertTrue(driver.getTitle().contains("Google"));
        System.out.println("Test passed on: " + Thread.currentThread().getName());
    }

    @Test
    public void testBingTitle() {
        driver.get("https://www.bing.com");
        assertTrue(driver.getTitle().contains("Bing"));
        System.out.println("Test passed on: " + Thread.currentThread().getName());
    }
}
