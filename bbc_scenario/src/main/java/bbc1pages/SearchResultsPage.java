package bbc1pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.util.List;

public class SearchResultsPage extends BasePage {

    public SearchResultsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//a[contains(@class,'PromoLink')]")
    private List<WebElement> listOfHeadlines;

    public WebElement getHeadlineByIndex(int index) {
        return listOfHeadlines.get(index);
    }

    public String getTextOfHeadlineByIndex(int index) {
        return getHeadlineByIndex(index).getText();
    }
}
