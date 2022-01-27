package bbc1pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.BasePage;

import java.util.ArrayList;
import java.util.List;

public class NewsPage extends BasePage {

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[contains(@class,'sections')]//li[contains(@class,'menuitem-container')]")
    private List<WebElement> listOfNewsSectionsButton;

    @FindBy(xpath = "//div[contains(@class,'primary__story')]//h3")
    private WebElement headlineOfNews;

    @FindBy(xpath = "//div[@class='gel-wrap gs-u-pt+']//h3[contains(@class,'gel-pica-bold')]")
    private List<WebElement> listOfArticlesOfNews;

    @FindBy(xpath = "//input[contains(@id,'search')]")
    private WebElement searchInputField;

    @FindBy(xpath = "//a[contains(@class,'section-link')]//span")
    private List<WebElement> listOfSectionsTitle;

    public WebElement getSectionByIndex(int index) {
        return listOfSectionsTitle.get(index);
    }

    public String getTextOfSectionByIndex(int index) {
        return getSectionByIndex(index).getText();
    }

    public WebElement getNewsSectionButtonByIndex(int index) {
        return listOfNewsSectionsButton.get(index);
    }

    public void clickOnNewsSectionButtonByIndex(int index) {
        getNewsSectionButtonByIndex(index).click();
    }

    public void fillSearchInput(String text) {
        searchInputField.sendKeys(text, Keys.ENTER);
    }

    public String getTheTextOfHeadline() {
        return headlineOfNews.getText();
    }

    public List<WebElement> getTheArticles() {
        return listOfArticlesOfNews;
    }

    public List<String> getTheTextOfArticles() {
        List<String> list = new ArrayList<>();
        for (WebElement webElement : getTheArticles()) {
            if (webElement.isDisplayed()) {
                String text = webElement.getText();
                list.add(text);
            }
        }
        return list;
    }
}
