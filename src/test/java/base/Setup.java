package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import utils.Utils;

import java.io.IOException;
import java.time.Duration;

public class Setup {

    public WebDriver driver;

    @BeforeTest
    public void Setup(){
//      System.setProperty("webdriver.gecko.driver" , "./src/test/resources/geckodriver.exe");
//      FirefoxOptions options = new FirefoxOptions();
//      options.addArguments("--headed");
        driver = new EdgeDriver();
        driver.manage().window();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
    }

    @AfterMethod
    public void screenShot(ITestResult result) throws IOException {
        if (ITestResult.FAILURE == result.getStatus()) {
            try {
                Utils utils = new Utils();
                utils.takeScreenshot(driver);
            } catch (Exception exception) {
                System.out.println(exception.toString());
            }
        }
    }

/*  @AfterMethod
    public void screenShot(ITestResult result) throws IOException {
        if (ITestResult.SUCCESS == result.getStatus()){
            try {
                Utils utils = new Utils();
                utils.takeScreenshot(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
        else if  (ITestResult.FAILURE == result.getStatus()){
            try {
                Utils utils = new Utils();
                utils.takeScreenshot(driver);
            }
            catch (Exception exception){
                System.out.println(exception.toString());
            }
        }
    } */

    @AfterTest
    public void closeDriver()
    {
         driver.close();
    }
}
