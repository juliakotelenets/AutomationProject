package BBC2pages;

import BBC1pages.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SportPage extends BasePage {

    public SportPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//a[contains(@class,'sport-navigation')]")
    private List<WebElement> listOfSectionsOfSport;

    public WebElement getSportSectionButtonByIndex(int index){return listOfSectionsOfSport.get(index);}

    public void clickOnSportSectionButtonByIndex(int index){getSportSectionButtonByIndex(index).click();}
}
