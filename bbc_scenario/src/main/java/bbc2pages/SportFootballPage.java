package bbc2pages;

import utils.BasePage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class SportFootballPage extends BasePage {

    public SportFootballPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@name='search']")
    private WebElement searchField;

    @FindBy(xpath = "//li[contains(@class,'list')]//div[contains(@class,'fixture')]")
    private List<WebElement> listOfTeams;

    @FindBy(xpath = "//div[contains(@class,'timeline__lists')]//a[contains(@href,'/scores-fixtures/')]")
    private List<WebElement> listOfMonthsYears;

    @FindBy(xpath = "//a[contains(@class,'secondary')]")
    private List<WebElement> listOfFootballSectionsButton;

    public WebElement getFootballSectionsButtonByIndex(int index) {
        return listOfFootballSectionsButton.get(index);
    }

    public void clickOnFootballSectionsButtonByIndex(int index) {
        getFootballSectionsButtonByIndex(index).click();
    }

    public void fillSearchInputByChampionship(String championship) {
        searchField.sendKeys(championship, Keys.ARROW_DOWN, Keys.ENTER);
    }

    public WebElement getSearchField() {
        return searchField;
    }

    public List<WebElement> getListOfTeams() {
        return listOfTeams;
    }

    public WebElement getPairOfTeamsByIndex(int index) {
        return listOfTeams.get(index);
    }

    public void clickOnPairOfTeamsByIndex(int index) {
        getPairOfTeamsByIndex(index).click();
    }

    public List<String> getTeamsPairString(WebElement teams) {
        return Arrays.asList(teams.getText().split("\n"));
    }

    public boolean verifyThatDisplayedCorrect(List<String> teamPairs, String firstTeam, String firstTeamScores,
                                              String secondTeam, String secondTeamScores) {
        boolean result = false;
        if (teamPairs.get(0).equals(firstTeam) && teamPairs.get(1).equals(firstTeamScores) &&
                teamPairs.get(2).equals(secondTeam) && teamPairs.get(3).equals(secondTeamScores)) {
            result = true;
        }
        return result;
    }

    public List<WebElement> getListOfMonthsYears() {
        return listOfMonthsYears;
    }

    public WebElement getMonthYearByIndex(int index) {
        return listOfMonthsYears.get(index);
    }

    public void clickOnMonthYear(int index) {
        getMonthYearByIndex(index).click();
    }
}
