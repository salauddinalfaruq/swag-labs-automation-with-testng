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

    WebDriver driver;
    public LoginPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    public boolean doLoginWithValidCredentials() throws InterruptedException {
        textUsername.sendKeys("standard_user");
        Thread.sleep(1500);
        textPassword.sendKeys("secret_sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
        buttonMenu.click();
        Thread.sleep(1500);
        return buttonMenu.isDisplayed();
    }

    public boolean doLoginWithLockedOutUser() throws InterruptedException {
        Thread.sleep(1500);
        textUsername.sendKeys("locked_out_user");
        Thread.sleep(1500);
        textPassword.sendKeys("secret_sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
        return errorMessageForAllInvalidUser.isDisplayed();
    }

    public boolean doLoginWithProblemUser() throws InterruptedException {
        Thread.sleep(1500);
        textUsername.sendKeys("problem_user");
        Thread.sleep(1500);
        textPassword.sendKeys("secret_sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
        return buttonMenu.isDisplayed();
    }

    public boolean doLoginWithPerformanceGlitchUser() throws InterruptedException {
        Thread.sleep(1500);
        textUsername.sendKeys("performance_glitch_user");
        Thread.sleep(1500);
        textPassword.sendKeys("secret_sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
        return buttonMenu.isDisplayed();
    }

    public boolean doLoginWithValidUsernameAndInvalidPassword() throws InterruptedException {
        Thread.sleep(1500);
        textUsername.sendKeys("standard_user");
        Thread.sleep(1500);
        textPassword.sendKeys("sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
        return errorMessageForAllInvalidUser.isDisplayed();
    }

    public boolean doLoginWithInvalidUsernameAndValidPassword() throws InterruptedException {
        Thread.sleep(1500);
        textUsername.sendKeys("salauddin");
        Thread.sleep(1500);
        textPassword.sendKeys("secret_sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
        return errorMessageForAllInvalidUser.isDisplayed();
    }

    public boolean doLoginWithInvalidUsernameAndInvalidPassword() throws InterruptedException {
        Thread.sleep(1500);
        textUsername.sendKeys("salauddin");
        Thread.sleep(1500);
        textPassword.sendKeys("sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
        return errorMessageForAllInvalidUser.isDisplayed();
    }

    public void doLoginWithValidCredentialsForOrderProcess() throws InterruptedException {
        Thread.sleep(1500);
        textUsername.sendKeys("standard_user");
        Thread.sleep(1500);
        textPassword.sendKeys("secret_sauce");
        Thread.sleep(1500);
        loginButton.click();
        Thread.sleep(1500);
    }
}
