//import com.aventstack.extentreports.*;
//import com.aventstack.extentreports.reporter.ExtentSparkReporter;
//import com.aventstack.extentreports.reporter.configuration.Theme;
//import io.github.bonigarcia.wdm.WebDriverManager;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//import org.testng.annotations.*;
//
//public class ExtentReportExample {
//    ExtentReports extent;
//    ExtentTest test;
//    WebDriver driver;
//
//    @BeforeSuite
//    public void setupReport() {
//        ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-report.html");
//        // Customizing Report
//        sparkReporter.config().setDocumentTitle("Automation Test Report");
//        sparkReporter.config().setReportName("Custom Selenium Report");
//        sparkReporter.config().setTheme(Theme.DARK);  // Options: DARK, STANDARD
//        extent = new ExtentReports();
//        extent.attachReporter(sparkReporter);
//    }
//
//    @BeforeTest
//    public void setup() {
//        WebDriverManager.chromedriver().setup();
//         driver = new ChromeDriver();
//        driver.manage().window().maximize();
//    }
//
//    @Test
//    public void testGoogleTitle() {
//        test = extent.createTest("Google Title Test");
//        driver.get("https://www.google.com");
//        String title = driver.getTitle();
//        test.info("Page title is: " + title);
//        Assert.assertEquals(title, "Google");
//        test.pass("Title validation passed");
//    }
//
//    @AfterTest
//    public void teardown() {
//        driver.quit();
//    }
//
//    @AfterSuite
//    public void generateReport() {
//        extent.flush(); // Generates the final report
//    }
//}
