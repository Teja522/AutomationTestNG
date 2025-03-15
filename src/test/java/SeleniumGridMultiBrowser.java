import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class SeleniumGridMultiBrowser {
    public static void main(String[] args) throws MalformedURLException {
        // Define Hub URL
        String hubURL = "http://192.168.0.105:4444"; // Update if needed

        // List of browsers to test
        String[] browsers = { "MicrosoftEdge","chrome","firefox"};

        for (String browser : browsers) {
            // Set browser capabilities
            DesiredCapabilities capabilities = new DesiredCapabilities();
            capabilities.setBrowserName(browser);

            // Initialize RemoteWebDriver
            WebDriver driver = new RemoteWebDriver(new URL(hubURL), capabilities);

            // Run test
            driver.get("https://www.google.com");
            System.out.println("Browser: " + browser + " | Page Title: " + driver.getTitle());

            // Close browser
            driver.quit();
        }
    }
}
