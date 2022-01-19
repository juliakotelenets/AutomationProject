package BBC1pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;
import java.util.stream.Collectors;

public class NewsPage extends BasePage {

    public NewsPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//ul[contains(@class,'sections')]//li[contains(@class,'menuitem-container')]")
    private List<WebElement> listOfNewsSectionsButton;

    @FindBy(xpath = "//div[contains(@class,'primary__story')]//h3")
    private WebElement headlineOfNews;

    @FindBy(xpath = "//div[@class='gel-wrap gs-u-pt+']//h3[contains(@class,'gel-pica-bold')]")
    private List<WebElement> articlesOfNews;

    @FindBy(xpath = "//input[contains(@id,'search')]")
    private WebElement searchInputString;

    @FindBy(xpath = "//a[contains(@class,'section-link')]//span")
    private List<WebElement> listOfSectionTitle;

    public WebElement getSectionByIndex(int index){return listOfSectionTitle.get(index);}

    public String getTextOfSectionByIndex(int index){return getSectionByIndex(index).getText();}

    public WebElement getNewsSectionButtonByIndex(int index){return listOfNewsSectionsButton.get(index);}

    public void clickOnNewsSectionButtonByIndex(int index){getNewsSectionButtonByIndex(index).click();}

    public void fillSearchInput(String text){searchInputString.sendKeys(text, Keys.ENTER);}

    public String getTheTextOfHeadline(){return headlineOfNews.getText(); }

    public List<WebElement> getTheArticles(){return articlesOfNews;}

    public List<String> getTheTextOfArticles(){
        return getTheArticles().stream().filter(WebElement::isDisplayed).map(WebElement::getText).collect(
                Collectors.toList());
    }
}
