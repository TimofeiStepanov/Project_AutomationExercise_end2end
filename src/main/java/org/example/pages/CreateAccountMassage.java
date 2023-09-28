package org.example.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class CreateAccountMassage {
    final WebDriver driver;

    public CreateAccountMassage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-qa='account-created']")
    WebElement accCreateH2Text;
    @FindBy(xpath = "//*[@data-qa='continue-button']")
    WebElement continueButton;
    @FindBy(xpath = "//*[@id='google_esf']")
    WebElement adFrame;

    public void accCreateConfirm(){
       continueButton.click();
        if(adFrame.isEnabled()) {
            driver.navigate().refresh();
            continueButton.click();
        }

    }

    public String accCreateMassageTextget(){
        return accCreateH2Text.getText();

    }
}
