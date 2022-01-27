package bbc1tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class NewsCoronavirusPageTests extends BaseTest {

    private static final String QUESTION = "How to subscribe to BBC news?";
    private static final String NAME = "Sara";
    private static final String CONTACT_NUMBER = "+380664583256";
    private static final String EMAIL = "lalala@gmail.com";
    private static final int INDEX_OF_NEWS_SECTION = 1;
    private static final int INDEX_OF_CORONAVIRUS_SECTION = 1;

    @Test
    public void checkSubmitQuestionsWithEmptyEmailField() {
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        getNewsPage().clickOnNewsSectionButtonByIndex(INDEX_OF_CORONAVIRUS_SECTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCoronavirusStoryButton());
        getNewsCoronavirusPage().clickToCoronavirusStory();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionsPageButton());
        getNewsCoronavirusPage().clickToQuestionsButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getClosePopupButton());
        getNewsCoronavirusPage().clickOnClosePopupButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionField());
        getNewsCoronavirusPage().fillQuestionField(QUESTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getNameField());
        getNewsCoronavirusPage().fillNameField(NAME);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getPhoneNumberField());
        getNewsCoronavirusPage().fillNumberField(CONTACT_NUMBER);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCheckbox());
        getNewsCoronavirusPage().clickToCheckbox();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getSubmitButton());
        getNewsCoronavirusPage().clickToSubmitButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getErrorMessage());
        Assert.assertTrue(getNewsCoronavirusPage().isErrorMessageDisplayed());
    }

    @Test
    public void checkSubmitQuestionsWithoutAcceptTerms() {
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        getNewsPage().clickOnNewsSectionButtonByIndex(INDEX_OF_CORONAVIRUS_SECTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCoronavirusStoryButton());
        getNewsCoronavirusPage().clickToCoronavirusStory();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionsPageButton());
        getNewsCoronavirusPage().clickToQuestionsButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getClosePopupButton());
        getNewsCoronavirusPage().clickOnClosePopupButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionField());
        getNewsCoronavirusPage().fillQuestionField(QUESTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getNameField());
        getNewsCoronavirusPage().fillNameField(NAME);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getEmailField());
        getNewsCoronavirusPage().fillEmailField(EMAIL);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getPhoneNumberField());
        getNewsCoronavirusPage().fillNumberField(CONTACT_NUMBER);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getSubmitButton());
        getNewsCoronavirusPage().clickToSubmitButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCheckbox());
        Assert.assertFalse(getNewsCoronavirusPage().isCheckboxSelected());
    }

    @Test
    public void checkSubmitQuestionsWithEmptyNameField() {
        getHomePage().clickOnSectionButtonByIndex(INDEX_OF_NEWS_SECTION);
        getNewsPage().clickOnNewsSectionButtonByIndex(INDEX_OF_CORONAVIRUS_SECTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCoronavirusStoryButton());
        getNewsCoronavirusPage().clickToCoronavirusStory();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionsPageButton());
        getNewsCoronavirusPage().clickToQuestionsButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getClosePopupButton());
        getNewsCoronavirusPage().clickOnClosePopupButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getQuestionField());
        getNewsCoronavirusPage().fillQuestionField(QUESTION);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getEmailField());
        getNewsCoronavirusPage().fillEmailField(EMAIL);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getPhoneNumberField());
        getNewsCoronavirusPage().fillNumberField(CONTACT_NUMBER);
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getCheckbox());
        getNewsCoronavirusPage().clickToCheckbox();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getSubmitButton());
        getNewsCoronavirusPage().clickToSubmitButton();
        getNewsCoronavirusPage().waitVisibilityOfElement(getNewsCoronavirusPage().getErrorMessage());
        Assert.assertTrue(getNewsCoronavirusPage().isErrorMessageDisplayed());
    }
}
