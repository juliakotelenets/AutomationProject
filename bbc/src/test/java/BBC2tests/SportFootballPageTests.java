package BBC2tests;

import BBC1tests.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SportFootballPageTests extends BaseTest {

    @Test
    public void checkThatTeamsNamesAndScoresAreCorrectFirst(){
        getHomePage().clickOnSectionButtonByIndex(2);
        getSportPage().clickOnSportSectionButtonByIndex(1);
        getSportFootballPage().clickOnFootballSectionsButtonByIndex(1);
        getSportPage().waitVisibilityOfElement(getSportFootballPage().getSearchInput());
        getSportFootballPage().fillSearchInputByChampionship("Scottish Championship");
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfMonthsYears());
        getSportFootballPage().waitElementToBeClickable(getSportFootballPage().getMonthYearByIndex(11));
        getSportFootballPage().clickOnMonthYear(11);
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        Assert.assertTrue(getSportFootballPage().verifyThatDisplayedCorrect(getSportFootballPage().getTeamsPairString(
                getSportFootballPage().getPairOfTeamsByIndex(1)),
                "Kilmarnock", "1", "Greenock Morton", "1"));
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        getSportFootballPage().clickOnPairOfTeamsByIndex(1);
        Assert.assertTrue(getTeamsPairPage().verifyThatNamesAndScoresDisplayedCorrect(getTeamsPairPage().getTeamsNamesString(
                getTeamsPairPage().getTeamByIndex(0)),
                "Kilmarnock", "1", "Greenock Morton", "1" ));
    }

    @Test
    public void checkThatTeamsNamesAndScoresAreCorrectSecond(){
        getHomePage().clickOnSectionButtonByIndex(2);
        getSportPage().clickOnSportSectionButtonByIndex(1);
        getSportFootballPage().clickOnFootballSectionsButtonByIndex(1);
        getSportPage().waitVisibilityOfElement(getSportFootballPage().getSearchInput());
        getSportFootballPage().fillSearchInputByChampionship("Scottish Championship");
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfMonthsYears());
        getSportFootballPage().waitElementToBeClickable(getSportFootballPage().getMonthYearByIndex(0));
        getSportFootballPage().clickOnMonthYear(0);
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        Assert.assertTrue(getSportFootballPage().verifyThatDisplayedCorrect(getSportFootballPage().getTeamsPairString(
                getSportFootballPage().getPairOfTeamsByIndex(5)),
                "Raith Rovers", "0", "Heart of Midlothian", "4"));
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        getSportFootballPage().clickOnPairOfTeamsByIndex(5);
        Assert.assertTrue(getTeamsPairPage().verifyThatNamesAndScoresDisplayedCorrect(getTeamsPairPage().getTeamsNamesString(
                getTeamsPairPage().getTeamByIndex(0)),
                "Raith Rovers", "0", "Heart of Midlothian", "4" ));
    }

    @Test
    public void checkThatTeamsNamesAndScoresAreCorrectThird(){
        getHomePage().clickOnSectionButtonByIndex(2);
        getSportPage().clickOnSportSectionButtonByIndex(1);
        getSportFootballPage().clickOnFootballSectionsButtonByIndex(1);
        getSportPage().waitVisibilityOfElement(getSportFootballPage().getSearchInput());
        getSportFootballPage().fillSearchInputByChampionship("Euro Under-21 Championship");
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfMonthsYears());
        getSportFootballPage().waitElementToBeClickable(getSportFootballPage().getMonthYearByIndex(5));
        getSportFootballPage().clickOnMonthYear(5);
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        Assert.assertTrue(getSportFootballPage().verifyThatDisplayedCorrect(getSportFootballPage().getTeamsPairString(
                getSportFootballPage().getPairOfTeamsByIndex(1)),
                "Spain U21", "0", "Portugal U21", "1"));
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        getSportFootballPage().clickOnPairOfTeamsByIndex(1);
        Assert.assertTrue(getTeamsPairPage().verifyThatNamesAndScoresDisplayedCorrect(getTeamsPairPage().getTeamsNamesString(
                getTeamsPairPage().getTeamByIndex(0)),
                "Spain U21", "0", "Portugal U21", "1" ));
    }

    @Test
    public void checkThatTeamsNamesAndScoresAreCorrectFourth(){
        getHomePage().clickOnSectionButtonByIndex(2);
        getSportPage().clickOnSportSectionButtonByIndex(1);
        getSportFootballPage().clickOnFootballSectionsButtonByIndex(1);
        getSportPage().waitVisibilityOfElement(getSportFootballPage().getSearchInput());
        getSportFootballPage().fillSearchInputByChampionship("Euro Under-21 Championship");
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfMonthsYears());
        getSportFootballPage().waitElementToBeClickable(getSportFootballPage().getMonthYearByIndex(2));
        getSportFootballPage().clickOnMonthYear(2);
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        Assert.assertTrue(getSportFootballPage().verifyThatDisplayedCorrect(getSportFootballPage().getTeamsPairString(
                getSportFootballPage().getPairOfTeamsByIndex(11)),
                "Portugal U21", "2", "England U21", "0"));
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        getSportFootballPage().clickOnPairOfTeamsByIndex(11);
        Assert.assertTrue(getTeamsPairPage().verifyThatNamesAndScoresDisplayedCorrect(getTeamsPairPage().getTeamsNamesString(
                getTeamsPairPage().getTeamByIndex(0)),
                "Portugal U21", "2", "England U21", "0" ));
    }

    @Test
    public void checkThatTeamsNamesAndScoresAreCorrectFifth(){
        getHomePage().clickOnSectionButtonByIndex(2);
        getSportPage().clickOnSportSectionButtonByIndex(1);
        getSportFootballPage().clickOnFootballSectionsButtonByIndex(1);
        getSportPage().waitVisibilityOfElement(getSportFootballPage().getSearchInput());
        getSportFootballPage().fillSearchInputByChampionship("Scottish Championship");
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfMonthsYears());
        getSportFootballPage().waitElementToBeClickable(getSportFootballPage().getMonthYearByIndex(0));
        getSportFootballPage().clickOnMonthYear(0);
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        Assert.assertTrue(getSportFootballPage().verifyThatDisplayedCorrect(getSportFootballPage().getTeamsPairString(
                getSportFootballPage().getPairOfTeamsByIndex(7)),
                "Heart of Midlothian", "2", "Raith Rovers", "3"));
        getSportFootballPage().waitVisibilityListOfElements(getSportFootballPage().getListOfTeams());
        getSportFootballPage().clickOnPairOfTeamsByIndex(7);
        Assert.assertTrue(getTeamsPairPage().verifyThatNamesAndScoresDisplayedCorrect(getTeamsPairPage().getTeamsNamesString(
                getTeamsPairPage().getTeamByIndex(0)),
                "Heart of Midlothian", "2", "Raith Rovers", "3" ));
    }
}
