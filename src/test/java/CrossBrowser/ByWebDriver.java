package CrossBrowser;

import Util.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ByWebDriver {

    public static void main(String []args)
    {
        String browser= ConfigReader.getProperty("browser");

        WebDriver driver = null;

        // Initialize browser driver based on input
        if (browser.equalsIgnoreCase("chrome")) {
           WebDriverManager.chromedriver().setup();
            driver = new ChromeDriver();
        } else if (browser.equalsIgnoreCase("firefox")) {

        } else if (browser.equalsIgnoreCase("edge")) {
            WebDriverManager.edgedriver().setup();
            driver = new EdgeDriver();
        } else {
            System.out.println("Invalid browser selection!");
            System.exit(0);
        }

        // Open a website and perform a basic test
        driver.get("https://www.google.co.in/");
        System.out.println("Page Title: " + driver.getTitle());

        // Close the browser
        driver.quit();

    }

}
