package bbc1pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.util.List;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'section')]//li[contains(@class,'orb-nav')]//a")
    private List<WebElement> listOfSectionsButton;

    public WebElement getSectionButtonByIndex(int index) {
        return listOfSectionsButton.get(index);
    }

    public void clickOnSectionButtonByIndex(int index) {
        getSectionButtonByIndex(index).click();
    }

    public void openHomePage(String url) {
        driver.get(url);
    }
}
