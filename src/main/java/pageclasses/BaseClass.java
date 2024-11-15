package pageclasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class BaseClass {


    public static WebDriver driver;

    public static EdgeDriver setUp(String browser) {
        if (browser.equalsIgnoreCase("edge")) {
            return new EdgeDriver();
        }

        System.setProperty("webdriver.edge.driver", "C:/Users/pawad/Downloads/edgedriver_win64/msedgedriver.exe");
        driver = new EdgeDriver();

        driver.get("https://www.amazon.com");
        return null;
    }

    public void tearDown() {
        driver.close();
    }
}
