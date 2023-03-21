package testrunner;

import base.Setup;
import io.qameta.allure.Allure;
import org.checkerframework.checker.units.qual.A;
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
        loginPage.doLoginWithValidCredentialsForOrderProcess();
        String text = orderPage.addBikeLightInCart();
        Assert.assertEquals(text , "1");
        Thread.sleep(2000);
    }

    @Test(priority = 2 , description = "Add fleece jacket in cart")
    public void addFleeceJacketInCart() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String badgeCount = orderPage.addSauceLabFleeceJacket();
//        String getRemoveTxt = orderPage.getGetRemoveButtonTextValue();
//        System.out.println(badgeCount + getRemoveTxt);
        Assert.assertEquals(badgeCount , "2");
        Thread.sleep(1500);
        Allure.description("Fleece jacket added in cart");
    }

    @Test(priority = 3 , description = "Remove fleece jacket from cart")
    public void removeFleeceJacket() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String badgeCount = orderPage.removeSauceLabsFleeceJacket();
        Assert.assertEquals(badgeCount , "1");
        Allure.description("Fleece jacket removed");
    }

    @Test(priority = 4 , description = "Add bolt TShirt in cart")
    public void addBoltTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String badgeCount = orderPage.addSauceLabsBoltTShirtInCart();
        Assert.assertEquals(badgeCount, "2");
        Allure.description("Bolt T-shirt added");
    }

    @Test(priority = 5 , description = "Remove bolt TShirt from cart")
    public void removeBoltTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.removeBoltTShirt();
        Assert.assertEquals(shoppingBadgeCount , "1");
        Allure.description("Bolt T-Shirt removed");
    }

    @Test(priority = 6 , description = "Click on back to product button for continue shopping")
    public void clickOnBackToProductForContinueShopping() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String productListTitlePageText = orderPage.clickOnBackToProductButtonForAddProductInCart();
        Assert.assertEquals(productListTitlePageText , "Products");
        Allure.description("Click on back to product button for view products");
    }

    @Test(priority = 7 , description = "Add red TShirt in cart")
    public void addRedTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.addRedTShirtInCart();
        Assert.assertEquals(shoppingBadgeCount , "2");
        Allure.description("Red T_Shirt added");
    }

    @Test(priority = 8 , description = "Remove red TShirt form cart")
    public void removeRedTShirt() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.removeRedTShirt();
        Assert.assertEquals(shoppingBadgeCount , "1");
        Allure.description("Red T_Shirt removed");
    }

    @Test(priority = 9 , description = "Continue shopping")
    public void clickForCheckoutButContinueShopping() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String productListTitlePageText = orderPage.clickOnProductListButtonForCheckOutButClickOnContinueShopping();
        Assert.assertEquals(productListTitlePageText , "Products");
        Allure.description("Click on shopping cart list and continue shopping process");
    }

    @Test(priority = 10 , description = "Add Backpack in cart")
    public void addBackpack() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.addBackpackInCart();
        Assert.assertEquals(shoppingBadgeCount , "2");
        Allure.description("Backpack added");
    }

    @Test(priority = 11 , description = "Again want to checkout and proceed to payment")
    public void againWantToCheckout() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String textAfterClickOnCheckout = orderPage.againProceedToCheckoutAndProceedToPayment();
        Assert.assertEquals(textAfterClickOnCheckout , "Checkout: Your Information");
        Allure.description("Again click on shopping cart list and button checkout");
    }

    @Test(priority = 12 , description = "Error message if user want to continue to checkout without fill First Name")
    public void clickOnButtonContinueWithoutFillFirstName() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String errorText = orderPage.clickOnContinueButtonWithoutFillFirstName();
        Assert.assertEquals(errorText , "Error: First Name is required");
        Allure.description("Click on continue button for proceed to payment without fill First Name");
    }

    @Test(priority = 13 , description = "Error message if user want to continue to checkout without fill Last Name")
    public void clickOnButtonContinueWithoutFillLastName() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String errorText = orderPage.clickOnContinueButtonWithoutFillLastName();
        Assert.assertEquals(errorText , "Error: Last Name is required");
        Allure.description("Click on continue button for proceed to payment without fill  Last Name");
    }

    @Test(priority = 14 , description = "Error message if user want to continue without fill Postal Code")
    public void clickOnContinueButtonWithoutFillPostalCode() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String errorText = orderPage.clickOnContinueButtonWithoutFillPostalCode();
        Assert.assertEquals(errorText , "Error: Postal Code is required");
        Allure.description("Click on continue button for proceed to payment without fill  Postal Code");
    }

    @Test(priority = 15 , description = "Fill all the credentials but not click on continue button")
    public void fillAllTheCredentialsButNotClickOnContinueButton() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String checkoutOverviewActualText = orderPage.fillAllTheCredentialsButDoNotClickOnContinueButton();
        Assert.assertEquals(checkoutOverviewActualText , "Checkout: Overview");
        Allure.description("Fill all the credentials but don't click on continue button");
    }

    @Test(priority = 16 , description = "Back to product list page")
    public void clickOnCancelButtonInBackToProductListForAddProduct() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String productListPageActualText = orderPage.clickOnCancelBackAndBackToProductListForAddProduct();
        Assert.assertEquals(productListPageActualText , "Products");
        Allure.description("Back to product list for view and add product");
    }

    @Test(priority = 17 , description = "Back to product and click on product sorting")
    public void backToProductListAndClickONProductSortingButton() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String productSortingFieldTextAfterClickOnLowToHigh = orderPage.clickONProductSortingButtonAndSortProduct();
        Assert.assertEquals(productSortingFieldTextAfterClickOnLowToHigh , "Price (low to high)");
        Allure.description("Click on product sorting");
    }

    @Test(priority = 18 , description = "Add OneSie in cart")
    public void addOneSieInCart() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String shoppingBadgeCount = orderPage.addSauceLabsOnesieInCart();
        Assert.assertEquals(shoppingBadgeCount , "3");
        Allure.description("Onesie added ");
    }

    @Test(priority = 19 , description = "Finally click on checkout button for proceed to payment")
    public void finallyClickCheckoutForProceedToPayment() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String textAfterClickOnCheckOutButton = orderPage.clickOnCartListAndCheckoutButtonForCheckOut();
        Assert.assertEquals(textAfterClickOnCheckOutButton , "Checkout: Your Information");
        Allure.description("Finally click on checkout button for proceed to payment");
    }

    @Test(priority = 20 , description = "Fill all the credentials and click on continue button")
    public void finallyFillAllTheCredentialsAndClickOnContinueForProceedToPayment() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String totalPaymentInfoText = orderPage.finallyFillAllTheCredentialsAndClickOnContinueForProceedToPayment();
        Assert.assertEquals(totalPaymentInfoText , "Total: $51.81");
        Allure.description("Finally fill all the credentials and proceed to payment");
    }

    @Test(priority = 21 , description = "Confirm order greetings message")
    public void orderConfirmationMessage() throws InterruptedException {
        orderPage = new OrderPage(driver);
        String orderConfirmationText = orderPage.clickOnFinishButtonAndCompleteTheProcess();
        Assert.assertEquals(orderConfirmationText , "Thank you for your order!");
        Allure.description("Greeting message for order confirmation");
    }
}
