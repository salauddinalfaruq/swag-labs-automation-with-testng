package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    @FindBy(id = "user-name")
    WebElement textUsername;
    @FindBy(id = "password")
    WebElement textPassword;
    @FindBy(id = "login-button")
    WebElement loginButton;
    @FindBy(css = "[data-test=error]")
    WebElement errorMessageForAllInvalidUser;
    @FindBy(id = "react-burger-menu-btn")
    public WebElement buttonMenu;
    @FindBy(id = "logout_sidebar_link")
    public WebElement buttonLogout;
    @FindBy(id = "remove-sauce-labs-bike-light")
    WebElement removeButton;

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }
    public void doLoginWithValidCredentials() throws InterruptedException {
        textUsername.sendKeys("standard_user");
        Thread.sleep(1500);
        textPassword.sendKeys("secret_sauce");
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
//        buttonMenu.click();
//        return buttonMenu.isDisplayed();
    }
    public boolean doLoginWithLockedOutUser(){
        textUsername.sendKeys("locked_out_user");
        textPassword.sendKeys("secret_sauce");
        loginButton.click();
        return errorMessageForAllInvalidUser.isDisplayed();
    }
    public boolean doLoginWithProblemUser(){
        textUsername.sendKeys("problem_user");
        textPassword.sendKeys("secret_sauce");
        loginButton.click();
        return buttonMenu.isDisplayed();
    }
    public boolean doLoginWithPerformanceGlitchUser(){
        textUsername.sendKeys("performance_glitch_user");
        textPassword.sendKeys("secret_sauce");
        loginButton.click();
        return buttonMenu.isDisplayed();
    }
    public boolean doLoginWithValidUsernameAndInvalidPassword() {
        textUsername.sendKeys("standard_user");
        textPassword.sendKeys("sauce");
        loginButton.click();
        return errorMessageForAllInvalidUser.isDisplayed();
    }
    public boolean doLoginWithInvalidUsernameAndValidPassword(){
        textUsername.sendKeys("salauddin");
        textPassword.sendKeys("secret_sauce");
        loginButton.click();
        return errorMessageForAllInvalidUser.isDisplayed();
    }
    public boolean doLoginWithInvalidUsernameAndInvalidPassword(){
        textUsername.sendKeys("salauddin");
        textPassword.sendKeys("sauce");
        loginButton.click();
        return errorMessageForAllInvalidUser.isDisplayed();
    }
}
