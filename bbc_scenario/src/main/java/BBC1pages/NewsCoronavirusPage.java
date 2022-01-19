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
    private WebElement questionInput;

    @FindBy(xpath = "//input[@placeholder='Name']")
    private WebElement nameInput;

    @FindBy(xpath = "//input[@placeholder='Email address']")
    private WebElement emailInput;

    @FindBy(xpath = "//input[@placeholder='Contact number']")
    private WebElement numberInput;

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

    public void fillQuestionField(String questions){ questionInput.sendKeys(questions);}

    public WebElement getQuestionInput(){return questionInput;}

    public void fillNameField(String name){nameInput.sendKeys(name);}

    public WebElement getNameInput(){return nameInput;}

    public void fillNumberField(String phone_number){numberInput.sendKeys(phone_number);}

    public WebElement getNumberInput(){return numberInput;}

    public void fillEmailField(String email){emailInput.sendKeys(email);}

    public WebElement getEmailInput(){return emailInput;}

    public boolean isErrorMessageDisplayed(){return errorMessage.isDisplayed();}

    public WebElement getErrorMessage(){return errorMessage;}
}
