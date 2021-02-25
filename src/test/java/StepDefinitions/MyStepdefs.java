package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.github.bonigarcia.wdm.WebDriverManager;
import okio.Timeout;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.xml.sax.Locator;
//import org.openqa.selenium.chrome.*;

public class MyStepdefs {
    WebDriver driver;

    @Given("^user navigates to the url \"([^\"]*)\"$")
    public void user_navigates_to_url(String url)
    {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manu\\Software\\chromedriver.exe");
        driver = new ChromeDriver();
        //System.setProperty("webdriver.gecko.driver", "C:\\Users\\Manu\\Software\\geckodriver-v0.29.0-win64\\geckodriver.exe");
        //driver = new FirefoxDriver();
        driver.get(url);
        driver.manage().window().maximize();

//        WebDriverManager.chromedriver().bbrowserVersion("77.0.3865.40").setup();
//        ChromeOptions options = new ChromeOptions();
//        options.addArguments("start-maximized");
//        options.addArguments("enable-automation");
//        options.addArguments("--no-sandbox");
//        options.addArguments("--disable-infobars");
//        options.addArguments("--disable-dev-shm-usage");
//        options.addArguments("--disable-browser-side-navigation");
//        options.addArguments("--disable-gpu");
//        driver = new ChromeDriver(options);
//        driver.get("https://www.google.com/");
    }




//    public void waitForDelay(Locator locator, int timeout) throws Exception {
//        WebDriverWait wait = new WebDriverWait(driver, timeout);
//        WebElement ele;
//        try{
//            wait.until(ExpectedConditions.invisibilityOfElementLocated(by.));
//
//        }catch(Exception ex)
//        {
//            throw ex;
//        }
//    }
}
