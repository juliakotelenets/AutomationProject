package BBC1pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[contains(@class,'section')]//li[contains(@class,'orb-nav')]//a")
    private List<WebElement> listOfSectionButton;

    public WebElement getSectionButtonByIndex(int index){return listOfSectionButton.get(index);}

    public void clickOnSectionButtonByIndex(int index){getSectionButtonByIndex(index).click();}
}
