import Util.ConfigReader;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class SampleTest1 {
    WebDriver driver;


    @Test
    public void openGoogle() {

        System.out.println(ConfigReader.getProperty("browser"));

    }


}
