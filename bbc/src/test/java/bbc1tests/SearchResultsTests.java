package bbc1tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchResultsTests extends BaseTest {

    private static final int INDEX_OF_SECTION = 0;
    private static final int INDEX_OF_HEADLINE = 0;
    private static final int INDEX_OF_NEWS_SECTION = 1;

    @Test
    public void checkThatHeadlineAreCorrect() {
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        getNewsPage().fillSearchInput(getNewsPage().getTextOfSectionByIndex(INDEX_OF_SECTION));
        Assert.assertEquals(getSearchResultsPage().getTextOfHeadlineByIndex(INDEX_OF_HEADLINE), "At The Edge of Asia");
    }
}
