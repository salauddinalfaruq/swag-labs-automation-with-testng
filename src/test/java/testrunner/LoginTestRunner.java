package testrunner;

import base.Setup;
import io.qameta.allure.Allure;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends Setup {

    LoginPage loginPage;

    @Test(priority = 7 , description = "Login with valid username and password")
    public void loginWithValidCredentials() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonFound = loginPage.doLoginWithValidCredentials();
        Assert.assertEquals(isMenuButtonFound , true);
        loginPage.buttonLogout.click();
        Allure.description("User can login with valid credentials");
    }

    @Test(priority = 4 , description = "Login with locked out user")
    public void doLoginWithLockedOutUser() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonDisplayed = loginPage.doLoginWithLockedOutUser();
        Assert.assertEquals(isMenuButtonDisplayed , true);
        Allure.description("User can not login with locked out credentials");
    }

    @Test(priority = 6 , description = "Login with problem user")
    public void doLoginWithProblemUser() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonDisplayed = loginPage.doLoginWithProblemUser();
        Assert.assertEquals(isMenuButtonDisplayed , true);
        loginPage.buttonMenu.click();
        Thread.sleep(1500);
        loginPage.buttonLogout.click();
        Thread.sleep(1500);
        Allure.description("Problem user can login but face problem in use the portal");
    }

    @Test(priority = 5 , description = "Login with performance glitch user")
    public void doLoginWithPerformanceGlitchUser() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonDisplayed = loginPage.doLoginWithPerformanceGlitchUser();
        Assert.assertEquals(isMenuButtonDisplayed , true);
        loginPage.buttonMenu.click();
        Thread.sleep(1500);
        loginPage.buttonLogout.click();
        Thread.sleep(1500);
        Allure.description("The user can login, but performance in using the website could be downgraded");
    }

    @Test(priority = 1 , description = "Login with valid username and invalid password")
    public void doLoginWithValidUserNameAndInvalidPassword() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isErrorMessageFound = loginPage.doLoginWithValidUsernameAndInvalidPassword();
        Assert.assertEquals(isErrorMessageFound , true);
        Allure.description("User can't login with valid username and invalid password");
    }

    @Test(priority = 2 , description = "Login with invalid username and valid password")
    public void doLoginWithInvalidUsernameAndValidPassword() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isErrorMessageFound = loginPage.doLoginWithInvalidUsernameAndValidPassword();
        Assert.assertEquals(isErrorMessageFound , true);
        Thread.sleep(1500);
        Allure.description("User can't login with invalid username and valid password");
    }

    @Test(priority = 3 , description = "Login with invalid username and invalid password")
    public void doLoginWithInvalidUsernameAndInvalidPassword() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isErrorMessageFound = loginPage.doLoginWithInvalidUsernameAndInvalidPassword();
        Assert.assertEquals(isErrorMessageFound , true);
        Thread.sleep(2000);
        Allure.description("User can't login with invalid username and invalid password");
    }
}
