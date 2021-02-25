package PageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
    WebDriver driver;
    @FindBy(how= How.XPATH, using = "//button[@title=\"Browse by Make\"]")
    private WebElement BrowseByMake;

    @FindBy(how= How.XPATH, using = "//button[@title=\"Browse by Make\"]")
    private WebElement BrowseByStyle;

    @FindBy(how= How.XPATH, using = "//a[@data-qaid=\"adv_srch\"]")
    private WebElement AdvancedSearch;

    @FindBy(how= How.XPATH, using = "//button[@id=\"search\"]")
    private WebElement Search;

    @FindBy(how= How.XPATH, using =  "//select[@id=\"makeCode\"]")
    private WebElement Make;

    @FindBy(how= How.XPATH, using = "//select[@id=\"ModelCode\"]")
    private WebElement Model;

    public HomePage(){}

    public HomePage(WebDriver driver)
    {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

}
