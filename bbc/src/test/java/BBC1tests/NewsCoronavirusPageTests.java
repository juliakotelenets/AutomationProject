package BBC1tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsCoronavirusPageTests extends BaseTest {

    private static String QUESTION = "How to subscribe to BBC news?";
    private static String NAME = "Sara";
    private static String CONTACT_NUMBER = "+380664583256";
    private static String LOCATION = "Kyiv";
    private static String AGE = "20";
    private static String EMAIL = "lalala@gmail.com";
    private static int INDEX_OF_NEWS_SECTION = 1;
    private static int INDEX_OF_CORONAVIRUS_SECTION = 1;

    @Test
    public void checkSubmitQuestionsWithEmptyEmailField(){
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        getNewsPage().clickOnNewsSectionButtonByIndex(INDEX_OF_CORONAVIRUS_SECTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCoronavirusStoryButton());
        getNewsCoronavirusPage().clickToCoronavirusStory();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionsPageButton());
        getNewsCoronavirusPage().clickToQuestionsButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionInput());
        getNewsCoronavirusPage().fillQuestionField(QUESTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getNameInput());
        getNewsCoronavirusPage().fillNameField(NAME);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getNumberInput());
        getNewsCoronavirusPage().fillNumberField(CONTACT_NUMBER);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCheckbox());
        getNewsCoronavirusPage().clickToCheckbox();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getSubmitButton());
        getNewsCoronavirusPage().clickToSubmitButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getErrorMessage());
        Assert.assertTrue(getNewsCoronavirusPage().isErrorMessageDisplayed());
    }

    @Test
    public void checkSubmitQuestionsWithoutAcceptTerms(){
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        getNewsPage().clickOnNewsSectionButtonByIndex(INDEX_OF_CORONAVIRUS_SECTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCoronavirusStoryButton());
        getNewsCoronavirusPage().clickToCoronavirusStory();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionsPageButton());
        getNewsCoronavirusPage().clickToQuestionsButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionInput());
        getNewsCoronavirusPage().fillQuestionField(QUESTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getNameInput());
        getNewsCoronavirusPage().fillNameField(NAME);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getEmailInput());
        getNewsCoronavirusPage().fillEmailField(EMAIL);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getNumberInput());
        getNewsCoronavirusPage().fillNumberField(CONTACT_NUMBER);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getSubmitButton());
        getNewsCoronavirusPage().clickToSubmitButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCheckbox());
        Assert.assertFalse(getNewsCoronavirusPage().isCheckboxSelected());
    }

    @Test
    public void checkSubmitQuestionsWithEmptyNameField(){
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        getNewsPage().clickOnNewsSectionButtonByIndex(INDEX_OF_CORONAVIRUS_SECTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCoronavirusStoryButton());
        getNewsCoronavirusPage().clickToCoronavirusStory();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionsPageButton());
        getNewsCoronavirusPage().clickToQuestionsButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionInput());
        getNewsCoronavirusPage().fillQuestionField(QUESTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getEmailInput());
        getNewsCoronavirusPage().fillEmailField(EMAIL);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getNumberInput());
        getNewsCoronavirusPage().fillNumberField(CONTACT_NUMBER);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCheckbox());
        getNewsCoronavirusPage().clickToCheckbox();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getSubmitButton());
        getNewsCoronavirusPage().clickToSubmitButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getErrorMessage());
        Assert.assertTrue(getNewsCoronavirusPage().isErrorMessageDisplayed());
    }
}
