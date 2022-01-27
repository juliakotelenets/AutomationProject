package bbc2pages;

import utils.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Arrays;
import java.util.List;

public class TeamsPairPage extends BasePage {

    public TeamsPairPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//article[contains(@class,'fixture')]//div[contains(@class,'fixture')]")
    private List<WebElement> listOfTeams;

    public WebElement getTeamByIndex(int index) {
        return listOfTeams.get(index);
    }

    public List<String> getTeamsNamesString(WebElement teams) {
        return Arrays.asList(teams.getText().split("\n"));
    }

    public boolean verifyThatNamesAndScoresDisplayedCorrect(List<String> teams, String firstTeam, String firstTeamScore,
                                                            String secondTeam, String secondTeamScore) {
        boolean result = false;
        if (teams.get(0).equals(firstTeam) && teams.get(1).equals(firstTeamScore) && teams.get(2).equals(secondTeam) &&
                teams.get(3).equals(secondTeamScore)) {
            result = true;
        }
        return result;
    }
}
