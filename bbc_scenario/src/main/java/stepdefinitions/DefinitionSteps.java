package stepdefinitions;

import bbc1pages.HomePage;
import bbc1pages.NewsCoronavirusPage;
import bbc1pages.NewsPage;
import bbc1pages.SearchResultsPage;
import bbc2pages.SportFootballPage;
import bbc2pages.SportPage;
import bbc2pages.TeamsPairPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import manager.PageFactoryManager;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.List;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class DefinitionSteps {

    WebDriver driver;
    HomePage homePage;
    NewsPage newsPage;
    NewsCoronavirusPage newsCoronavirusPage;
    SearchResultsPage searchResultsPage;
    PageFactoryManager pageFactoryManager;
    SportFootballPage sportFootballPage;
    SportPage sportPage;
    TeamsPairPage teamsPairPage;

    @Before
    public void testsSetUp() {
        chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        pageFactoryManager = new PageFactoryManager(driver);
    }

    @After
    public void tearDown() {
        driver.quit();
    }

    @And("User opens {string} page")
    public void openPage(final String url) {
        homePage = pageFactoryManager.getHomePage();
        homePage.openHomePage(url);
    }

    @And("User clicks on {int} section button")
    public void userClickOnSectionButton(int index) {
        homePage.clickOnSectionButtonByIndex(index);
    }

    @And("User waiting for the news page to load")
    public void userWaitingNewsPageLoad() {
        newsPage = pageFactoryManager.getNewsPage();
        newsPage.waitForPageLoadComplete();
    }

    @And("User checks that the title matches the {string} one")
    public void userChecksTitleMatchesTheExpectedOne(String headline) {
        Assert.assertEquals(newsPage.getTheTextOfHeadline(), headline);
    }

    @And("User checks that secondary news title contains specified values {string}")
    public void userChecksThatSecondaryNewsTitleContainsSpecifiedValuesExpectedValues(List<String> expectedTitles) {
        newsPage.waitVisibilityOfListElements(newsPage.getTheArticles());
        Assert.assertEquals(expectedTitles, newsPage.getTheArticles());
    }

    @And("User checks that article titles matches the expected")
    public void checkSecondaryArticleTitles() {
        List<String> articles = new ArrayList<>();
        articles.add("Tonga tsunami: Before and after eruption");
        articles.add("Nobody told me drinks event broke rules - Johnson");
        articles.add("Saudis warned of jail time for posting rumours");
        articles.add("'World's most valuable house' - which no one wanted to buy");
        articles.add("AT&T agrees another 5G delay at US airports");
        articles.add("Irish police arrest man over Ashling Murphy killing");
        articles.add("Microsoft plans to buy Activision Blizzard");
        articles.add("Buffy director Whedon denies misconduct claims");
        articles.add("Two teens held in UK over Texas siege released");
        articles.add("Skier investigated over collision with British girl");
        articles.add("Youngest ever president elected by EU Parliament");
        articles.add("Beijing Olympics athletes told to use burner phones");
        articles.add("Hong Kong to cull 2,000 hamsters over Covid case");
        Assert.assertEquals(newsPage.getTheTextOfArticles(), articles);
    }

    @And("User clicks on news {int} section")
    public void userClicksOnNewsSection(int index) {
        newsPage.clickOnNewsSectionButtonByIndex(index);
    }

    @And("User waiting for the news coronavirus page to load")
    public void userWaitingNewsCoronavirusPage() {
        newsCoronavirusPage = pageFactoryManager.getNewsCoronavirusPage();
        newsCoronavirusPage.waitForPageLoadComplete();
    }

    @And("User clicks on coronavirus story button")
    public void userClicksOnCoronavirusStoryButton() {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getCoronavirusStoryButton());
        newsCoronavirusPage.clickToCoronavirusStory();
    }

    @And("User clicks on questions form")
    public void userClicksOnQuestionsForm() {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getClosePopupButton());
        newsCoronavirusPage.clickOnClosePopupButton();
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getQuestionsPageButton());
        newsCoronavirusPage.clickToQuestionsButton();
    }

    @And("User fills the questions field with {string}")
    public void userFillsQuestionsField(String questions) {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getQuestionField());
        newsCoronavirusPage.fillQuestionField(questions);
    }

    @And("User fills the name field with {string}")
    public void userFillsNameField(String name) {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getNameField());
        newsCoronavirusPage.fillNameField(name);
    }

    @And("User fills the email field with {string}")
    public void userFillsEmailField(String email) {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getEmailField());
        newsCoronavirusPage.fillEmailField(email);
    }

    @And("User fills the phone number field with {string}")
    public void userFillsPhoneNumberField(String number) {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getPhoneNumberField());
        newsCoronavirusPage.fillNumberField(number);
    }

    @And("User agree with conditions")
    public void userAgreeWithConditions() {
        newsCoronavirusPage.waitForPageLoadComplete();
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getCheckbox());
        newsCoronavirusPage.clickToCheckbox();
    }

    @And("User clicks on submit button")
    public void userClicksOnSubmitButton() {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getSubmitButton());
        newsCoronavirusPage.clickToSubmitButton();
    }

    @And("User checks that error message is displayed")
    public void userChecksErrorMessageIsDisplayed() {
        newsCoronavirusPage.waitVisibilityOfElement(newsCoronavirusPage.getErrorMessage());
        Assert.assertTrue(newsCoronavirusPage.isErrorMessageDisplayed());
    }

    @And("User checks that error message is displayed without agreement")
    public void userChecksErrorMessageWithoutAgreement() {
        Assert.assertFalse(newsCoronavirusPage.isCheckboxSelected());
    }

    @And("User clicks on sport {int} section")
    public void userClicksOnFootballSection(int index) {
        sportPage.clickOnSportSectionButtonByIndex(index);
    }

    @And("User waiting for the sport page to load")
    public void userWaitForSportPageLoad() {
        sportPage = pageFactoryManager.getSportPage();
        sportPage.waitForPageLoadComplete();
    }

    @And("User waiting for the sport football page to load")
    public void userWaitForSportFootballPage() {
        sportFootballPage = pageFactoryManager.getSportFootballPage();
        sportFootballPage.waitForPageLoadComplete();
    }

    @And("User clicks on sport football {int} section")
    public void userClicksOnScoresAndFixture(int index) {
        sportFootballPage.clickOnFootballSectionsButtonByIndex(index);
    }

    @And("User finds the {string}")
    public void userFindsTheChampionship(String championship) {
        sportFootballPage.waitVisibilityOfElement(sportFootballPage.getSearchField());
        sportFootballPage.fillSearchInputByChampionship(championship);
    }

    @And("User clicks on month by {int}")
    public void userClicksOnMonthByIndex(int index) {
        sportFootballPage.waitVisibilityOfListElements(sportFootballPage.getListOfMonthsYears());
        sportFootballPage.clickOnMonthYear(index);
    }

    @And("User checks that expected {string}, {string}, {string}, {string} of {int} team equals with actual")
    public void userChecksThatNamesAndScoresOfTeamsAreCorrect(String firstTeam, String firstTeamScore, String secondTeam, String secondTeamScore, int index) {
        sportFootballPage.waitVisibilityOfListElements(sportFootballPage.getListOfTeams());
        Assert.assertTrue(sportFootballPage.verifyThatDisplayedCorrect(sportFootballPage.getTeamsPairString(sportFootballPage.getPairOfTeamsByIndex(index)),
                firstTeam, firstTeamScore, secondTeam, secondTeamScore));
    }

    @And("User clicks on teams by {int}")
    public void userClicksOnTeams(int index) {
        sportFootballPage.waitVisibilityOfListElements(sportFootballPage.getListOfTeams());
        sportFootballPage.clickOnPairOfTeamsByIndex(index);
    }

    @And("User waiting for the team pair page to load")
    public void userWaitForTeamPairPage() {
        teamsPairPage = pageFactoryManager.getTeamsPairPage();
        teamsPairPage.waitForPageLoadComplete();
    }

    @And("User checks that expected {string}, {string}, {string}, {string} of {int} team equals with actual on team page")
    public void userChecksThatTeamsNamesScoresAreCorrectOnTeamPage(String firstTeam, String firstTeamScore, String secondTeam, String secondTeamScore, int index) {
        Assert.assertTrue(teamsPairPage.verifyThatNamesAndScoresDisplayedCorrect(teamsPairPage.getTeamsNamesString(teamsPairPage.getTeamByIndex(index)),
                firstTeam, firstTeamScore, secondTeam, secondTeamScore));
    }

    @And("User copies {int} category text of headline and paste it in search bar")
    public void userCopiesCategoryTextOfHeadline(int index) {
        newsPage.fillSearchInput(newsPage.getTextOfSectionByIndex(index));
    }

    @And("User waiting for the search results page to load")
    public void userWaitForSearchResultsPage() {
        searchResultsPage = pageFactoryManager.getSearchResultsPage();
        searchResultsPage.waitForPageLoadComplete();
    }

    @And("User checks that {int} article coincides {string}")
    public void userChecksThatArticleCoincidesExpected(int index, String article) {
        Assert.assertEquals(searchResultsPage.getTextOfHeadlineByIndex(index), article);
    }
}
