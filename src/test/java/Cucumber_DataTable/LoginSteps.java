package Cucumber_DataTable;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;
import java.util.Map;

public class LoginSteps {
    WebDriver driver;


    @Given("User is on the login page")
    public void user_is_on_the_login_page() {

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/broken_images");
        System.out.println("Driver Launched Successfully");
    }


    @When("User Checks Broken Images")
    public void userChecksBrokenImages() throws IOException {
        List<WebElement> ImgLinks = driver.findElements(By.tagName("img"));
        System.out.println("Total Images Count : " + ImgLinks.size());
        int count = 0;
        for (WebElement link : ImgLinks) {
            String Imgurl = link.getAttribute("src");

            URL urls = new URL(Imgurl);
            HttpURLConnection conn = (HttpURLConnection) urls.openConnection();

            conn.connect();
            int responseCode = conn.getResponseCode();
            if (responseCode >= 400) {
                System.out.println("Image Is Broken " + Imgurl);
                count++;
            }

        }
    }

    @Then("User should be logged in successfully")
    public void user_should_be_logged_in_successfully() {
        System.out.println("Driver Closed Successfully");
        driver.quit();
    }
}
