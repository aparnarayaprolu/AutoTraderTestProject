package StepDefinitions;

import PageObjects.HomePage;
import io.cucumber.java.en.Then;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageStepDef extends HomePage {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(driver,30);
    HomePage homePage = new HomePage();

    @Then("^validate homepage has \"([^\"]*)\"$")
    public void validateHomepageHas(String elementToValidate) throws Exception {
        String eleXpath = "//button[@title=\"Browse by Make\"]";
        checkElementPresent(eleXpath);

    }

    public void checkElementPresent(String eleXpath) throws Exception
    {
        WebElement element;
        try {
            element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(eleXpath)));
            //Assert.assertEquals(element.isDisplayed(), true);
            System.out.println("element with xpath: " + eleXpath + " found");

        }catch(Exception ex)
        {
            throw ex;
        }
    }

}
