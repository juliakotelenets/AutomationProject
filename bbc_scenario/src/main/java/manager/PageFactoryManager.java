package manager;

import BBC1pages.HomePage;
import BBC1pages.NewsCoronavirusPage;
import BBC1pages.NewsPage;
import BBC1pages.SearchResultsPage;
import BBC2pages.SportFootballPage;
import BBC2pages.SportPage;
import BBC2pages.TeamsPairPage;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) { this.driver = driver; }

    public HomePage getHomePage() { return new HomePage(driver); }

    public NewsCoronavirusPage getNewsCoronavirusPage(){return new NewsCoronavirusPage(driver);}

    public NewsPage getNewsPage(){return new NewsPage(driver);}

    public SearchResultsPage getSearchResultsPage(){return new SearchResultsPage(driver);}

    public SportPage getSportPage(){return new SportPage(driver);}

    public SportFootballPage getSportFootballPage(){return new SportFootballPage(driver);}

    public TeamsPairPage getTeamsPairPage(){return new TeamsPairPage(driver);}
}
