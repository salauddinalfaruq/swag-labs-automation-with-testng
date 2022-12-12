package testrunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;

public class LoginTestRunner extends Setup {

    LoginPage loginPage;

    @Test(priority = 7)
    public void loginWithValidCredentials() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonFound = loginPage.doLoginWithValidCredentials();
        Assert.assertEquals(isMenuButtonFound , true);
        Thread.sleep(2000);
        loginPage.buttonLogout.click();
    }
    @Test(priority = 4)
    public void doLoginWithLockedOutUser() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonDisplayed = loginPage.doLoginWithLockedOutUser();
        Assert.assertEquals(isMenuButtonDisplayed , true);
        Thread.sleep(2000);
    }
    @Test(priority = 6)
    public void doLoginWithProblemUser() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonDisplayed = loginPage.doLoginWithProblemUser();
        Assert.assertEquals(isMenuButtonDisplayed , true);
        loginPage.buttonMenu.click();
        Thread.sleep(2000);
        loginPage.buttonLogout.click();
        Thread.sleep(2000);
    }
    @Test(priority = 5)
    public void doLoginWithPerformanceGlitchUser() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isMenuButtonDisplayed = loginPage.doLoginWithPerformanceGlitchUser();
        Assert.assertEquals(isMenuButtonDisplayed , true);
        loginPage.buttonMenu.click();
        Thread.sleep(3000);
        loginPage.buttonLogout.click();
        Thread.sleep(2000);
    }
    @Test(priority = 1)
    public void doLoginWithValidUserNameAndInvalidPassword() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isErrorMessageFound = loginPage.doLoginWithValidUsernameAndInvalidPassword();
        Assert.assertEquals(isErrorMessageFound , true);
        Thread.sleep(2000);
    }
    @Test(priority = 2)
    public void doLoginWithInvalidUsernameAndValidPassword() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isErrorMessageFound = loginPage.doLoginWithInvalidUsernameAndValidPassword();
        Assert.assertEquals(isErrorMessageFound , true);
        Thread.sleep(2000);
    }
    @Test(priority = 3)
    public void doLoginWithInvalidUsernameAndInvalidPassword() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        boolean isErrorMessageFound = loginPage.doLoginWithInvalidUsernameAndInvalidPassword();
        Assert.assertEquals(isErrorMessageFound , true);
        Thread.sleep(2000);
    }
}
