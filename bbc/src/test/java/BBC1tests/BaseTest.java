package BBC1tests;

import BBC1pages.HomePage;
import BBC1pages.NewsCoronavirusPage;
import BBC1pages.NewsPage;
import BBC1pages.SearchResultsPage;
import BBC2pages.SportFootballPage;
import BBC2pages.SportPage;
import BBC2pages.TeamsPairPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static io.github.bonigarcia.wdm.WebDriverManager.chromedriver;

public class BaseTest {

    private WebDriver driver;
    private static final String BBC_URL = "https://www.bbc.com";

    @BeforeTest
    public void profileSetUp(){
        chromedriver().setup();
    }

    @BeforeMethod
    public void testsSetUp(){
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(BBC_URL);
    }

    @AfterMethod
    public void tearDown(){
        driver.quit();
    }

    public WebDriver getDriver(){
        return driver;
    }

    public HomePage getHomePage(){
        return new HomePage(getDriver());
    }

    public NewsPage getNewsPage(){
        return new NewsPage(getDriver());
    }

    public NewsCoronavirusPage getNewsCoronavirusPage(){return new NewsCoronavirusPage(getDriver());}

    public SearchResultsPage getSearchResultsPage(){ return new SearchResultsPage(getDriver()); }

    public SportPage getSportPage(){return new SportPage(getDriver());}

    public SportFootballPage getSportFootballPage(){return new SportFootballPage(getDriver());}

    public TeamsPairPage getTeamsPairPage(){return new TeamsPairPage(getDriver());}
}

