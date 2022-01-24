package BBC1tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class NewsPageTests extends BaseTest {

    private static final int INDEX_OF_NEWS_SECTION = 1;

    @Test
    public void checkTheHeadlineArticle(){
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        Assert.assertEquals(getNewsPage().getTheTextOfHeadline(),"Tonga says tsunami was 'unprecedented disaster'");
    }

    @Test
    public void checkSecondaryArticleTitles(){
        List<String> articles = new ArrayList<String>();
        articles.add("Tonga tsunami: Before and after eruption");
        articles.add("Nobody told me drinks event broke rules - Johnson");
        articles.add("Saudis warned of jail time for posting rumours");
        articles.add("'World's most valuable house' - which no one wanted to buy");
        articles.add("Mobile firms agree another 5G delay at US airports");
        articles.add("Irish police arrest man over Ashling Murphy killing");
        articles.add("Microsoft plans to buy Activision Blizzard");
        articles.add("Buffy director Whedon denies misconduct claims");
        articles.add("UK teens held over Texas synagogue siege released");
        articles.add("Skier investigated over collision with British girl");
        articles.add("Youngest ever president elected by EU Parliament");
        articles.add("Beijing Olympics athletes told to use burner phones");
        articles.add("Hong Kong to cull 2,000 hamsters over Covid case");
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        Assert.assertEquals(getNewsPage().getTheTextOfArticles(),articles);
    }
}
