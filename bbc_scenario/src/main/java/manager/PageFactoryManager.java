package manager;

import bbc1pages.HomePage;
import bbc1pages.NewsCoronavirusPage;
import bbc1pages.NewsPage;
import bbc1pages.SearchResultsPage;
import bbc2pages.SportFootballPage;
import bbc2pages.SportPage;
import bbc2pages.TeamsPairPage;
import org.openqa.selenium.WebDriver;

public class PageFactoryManager {

    WebDriver driver;

    public PageFactoryManager(WebDriver driver) {
        this.driver = driver;
    }

    public HomePage getHomePage() {
        return new HomePage(driver);
    }

    public NewsCoronavirusPage getNewsCoronavirusPage() {
        return new NewsCoronavirusPage(driver);
    }

    public NewsPage getNewsPage() {
        return new NewsPage(driver);
    }

    public SearchResultsPage getSearchResultsPage() {
        return new SearchResultsPage(driver);
    }

    public SportPage getSportPage() {
        return new SportPage(driver);
    }

    public SportFootballPage getSportFootballPage() {
        return new SportFootballPage(driver);
    }

    public TeamsPairPage getTeamsPairPage() {
        return new TeamsPairPage(driver);
    }
}
