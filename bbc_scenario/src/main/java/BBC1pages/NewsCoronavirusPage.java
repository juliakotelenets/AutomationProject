package BBC1pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NewsCoronavirusPage extends BasePage {

    public NewsCoronavirusPage(WebDriver driver) { super(driver); }

    @FindBy(xpath = "//li[contains(@class,'secondary-menuitem-container')]")
    private WebElement coronavirusStoryButton;

    @FindBy(xpath = "//a[@href='/news/52143212']")
    private WebElement questionsPageButton;

    @FindBy(xpath = "//textarea[contains(@placeholder,'answer')]")
    private WebElement questionField;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement nameField;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    private WebElement emailField;

    @FindBy(xpath = "//input[@placeholder='Contact number']")
    private WebElement phoneNumberField;

    @FindBy(xpath = "//button[text()='Submit']")
    private WebElement submitButton;

    @FindBy(xpath = "//input[@type='checkbox']")
    private WebElement checkbox;

    @FindBy(xpath = "//div[@class='input-error-message']")
    private WebElement errorMessage;

    public void clickToCoronavirusStory(){
        coronavirusStoryButton.click();
    }

    public WebElement getCoronavirusStoryButton(){return coronavirusStoryButton;}

    public void clickToQuestionsButton(){
        questionsPageButton.click();
    }

    public WebElement getQuestionsPageButton(){return questionsPageButton;}

    public void clickToCheckbox() { checkbox.click(); }

    public WebElement getCheckbox(){return checkbox;}

    public void clickToSubmitButton() { submitButton.click(); }

    public WebElement getSubmitButton(){return submitButton;}

    public boolean isCheckboxSelected(){return checkbox.isSelected();}

    public void fillQuestionField(String questions){ questionField.sendKeys(questions);}

    public WebElement getQuestionField(){return questionField;}

    public void fillNameField(String name){ nameField.sendKeys(name);}

    public WebElement getNameField(){return nameField;}

    public void fillNumberField(String phone_number){ phoneNumberField.sendKeys(phone_number);}

    public WebElement getPhoneNumberField(){return phoneNumberField;}

    public void fillEmailField(String email){ emailField.sendKeys(email);}

    public WebElement getEmailField(){return emailField;}

    public boolean isErrorMessageDisplayed(){return errorMessage.isDisplayed();}

    public WebElement getErrorMessage(){return errorMessage;}
}
