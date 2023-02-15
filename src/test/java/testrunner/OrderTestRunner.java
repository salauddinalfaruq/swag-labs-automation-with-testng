package testrunner;

import base.Setup;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.OrderPage;

public class OrderTestRunner extends Setup {

    OrderPage orderPage;
    LoginPage loginPage;

    @Test(priority = 1 , description = "Add bike lights in cart")
    public void addBikeLightInCart() throws InterruptedException {
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
        orderPage = new OrderPage(driver);
        loginPage.doLoginWithValidCredentials();
        String text = orderPage.addBikeLightInCart();
        Assert.assertEquals(text , "1");
        Thread.sleep(2000);
    }

    @Test(priority = 2 , description = "Add fleece jacket in cart")
    public void addFourthItemJacketINCart() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String badgeCount = orderPage.addSauceLabFourthItemJacketInCart();
//        String getRemoveTxt = orderPage.getGetRemoveButtonTextValue();
//        System.out.println(badgeCount + getRemoveTxt);
       Assert.assertEquals(badgeCount , "2");
       Thread.sleep(2000);
    }

    @Test(priority = 3 , description = "Remove fleece jacket from cart")
    public void removeFleeceJacket() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String badgeCount = orderPage.removeSauceLabsFleeceJacket();
        Assert.assertEquals(badgeCount , "1");
    }

    @Test(priority = 4 , description = "Add bolt TShirt in cart")
    public void addBoltTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String badgeCount = orderPage.addSauceLabsBoltTShirtInCart();
        Assert.assertEquals(badgeCount, "2");
    }

    @Test(priority = 5 , description = "Remove bolt TShirt from cart")
    public void removeBoltTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.removeBoltTShirt();
        Assert.assertEquals(shoppingBadgeCount , "1");
    }

    @Test(priority = 6 , description = "Click on back to product button for continue shopping")
    public void clickOnBackToProductForContinueShopping() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String productListTitlePageText = orderPage.clickOnBackToProductButtonForAddProductInCart();
        Assert.assertEquals(productListTitlePageText , "PRODUCTS");
    }

    @Test(priority = 7 , description = "Add red TShirt in cart")
    public void addRedTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.addRedTShirtInCart();
        Assert.assertEquals(shoppingBadgeCount , "2");
    }

    @Test(priority = 8 , description = "Remove red TShirt form cart")
    public void removeRedTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.removeRedTShirt();
        Assert.assertEquals(shoppingBadgeCount , "1");
    }

    @Test(priority = 9 , description = "Continue shopping")
    public void clickForCheckoutButContinueShopping() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String productListTitlePageText = orderPage.clickOnProductListButtonForCheckOutButClickOnContinueShopping();
        Assert.assertEquals(productListTitlePageText , "PRODUCTS");
    }

    @Test(priority = 10 , description = "Add Backpack in cart")
    public void addBackpack() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.addBackpackInCart();
        Assert.assertEquals(shoppingBadgeCount , "2");
    }

    @Test(priority = 11 , description = "Again want to checkout and proceed to payment")
    public void againWantToCheckout() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String textAfterClickOnCheckout = orderPage.againProceedToCheckoutAndProceedToPayment();
        Assert.assertEquals(textAfterClickOnCheckout , "CHECKOUT: YOUR INFORMATION");
    }

    @Test(priority = 12 , description = "Error message if user want to continue to checkout without fill First Name")
    public void clickOnButtonContinueWithoutFillFirstName() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String errorText = orderPage.clickOnContinueButtonWithoutFillFirstName();
        Assert.assertEquals(errorText , "Error: First Name is required");
    }

    @Test(priority = 13 , description = "Error message if user want to continue to checkout without fill Last Name")
    public void clickOnButtonContinueWithoutFillLastName() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String errorText = orderPage.clickOnContinueButtonWithoutFillLastName();
        Assert.assertEquals(errorText , "Error: Last Name is required");
    }

    @Test(priority = 14 , description = "Error message if user want to continue without fill Postal Code")
    public void clickOnContinueButtonWithoutFillPostalCode1() throws InterruptedException {
//        driver.get("https://www.saucedemo.com/");
        orderPage = new OrderPage(driver);
        String errorText = orderPage.clickOnContinueButtonWithoutFillPostalCode();
    }
}
