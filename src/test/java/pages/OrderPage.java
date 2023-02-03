package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

    public String getRemoveButtonTextValue;
    public String badgeCounter;
    @FindBy(id = "add-to-cart-sauce-labs-bike-light")
    WebElement addToCartButtonForBikeLight;
    @FindBy(id = "add-to-cart-sauce-labs-fleece-jacket")
    WebElement addToCartButtonForFleeceJacket;
    @FindBy(name = "remove-sauce-labs-fleece-jacket")
    WebElement removeButtonForSauceLabsFleeceJacket;
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    WebElement itemHeaderForBoltTShirt;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addToCartButtonForBoltTShirtAfterClickItemHeader;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement boltTShirtRemoveButtonFromList;
    @FindBy(id = "back-to-products")
    WebElement backToProductButtonAfterClickOnItemHeader;
    @FindBy(id= "add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement addToCartButtonForRedTShirt;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement redTShirtRemoveButton;
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCartListButton;
    @FindBy(className = "shopping_cart_badge")
    WebElement shoppingBadge;
    @FindBy(name = "continue-shopping")
    WebElement continueShoppingButton;
    @FindBy(className = "title")
    WebElement backOnProductPageTitle;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartForBackpack;
    @FindBy(id = "checkout")
    WebElement buttonCheckout;
    @FindBy(className = "title")
    WebElement headerDataForProceedToCheckoutAfterClickOnCheckoutButton;
    @FindBy(name = "firstName")
    WebElement firstName;
    @FindBy(name = "lastName")
    WebElement lastNameForConfirmation;
    @FindBy(name = "postalCode")
    WebElement postalCodeForConfirmation;
    @FindBy(id = "continue")
    WebElement buttonContinue;
    @FindBy(id = "cancel")
    WebElement buttonCancel;
    @FindBy(xpath = "//div[@class='summary_total_label']")
    WebElement totalPaymentInformation;
    @FindBy(id = "finish")
    WebElement finishButton;
    @FindBy(id = "cancel")
    WebElement buttonCancelAfterDisplayTotalPaymentInformation;
    @FindBy(className = "complete-header")
    WebElement orderConfirmationMessage;
    @FindBy(name = "back-to-products")
    WebElement backToHomeButton;

    WebDriver driver;
    public OrderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver , this);
    }

    public String addBikeLightInCart() throws InterruptedException {
        addToCartButtonForBikeLight.click();
        Thread.sleep(1500);
        shoppingBadge.isDisplayed();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        Thread.sleep(1500);
        return shoppingBadgeCount;
    }

    public String addSauceLabFourthItemJacketInCart() throws InterruptedException {
        Thread.sleep(1500);
        addToCartButtonForFleeceJacket.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        Thread.sleep(1500);
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
    }

    public String removeSauceLabsFleeceJacket() throws InterruptedException {
        Thread.sleep(1500);
        removeButtonForSauceLabsFleeceJacket.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        Thread.sleep(1500);
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
    }

    public String addSauceLabsBoltTShirtInCart() throws InterruptedException {
        Thread.sleep(1500);
        itemHeaderForBoltTShirt.click();
        Thread.sleep(1500);
        addToCartButtonForBoltTShirtAfterClickItemHeader.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        Thread.sleep(1500);
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
   }

   public String removeBoltTShirt() throws InterruptedException {
        Thread.sleep(1500);
        boltTShirtRemoveButtonFromList.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
   }

   public String clickOnBackToProductButtonForAddProductInCart() throws InterruptedException {
        Thread.sleep(1500);
        backToProductButtonAfterClickOnItemHeader.click();
        Thread.sleep(1500);
        String productPageTitle = backOnProductPageTitle.getText();
        Thread.sleep(1500);
        System.out.println(productPageTitle);
        return productPageTitle;
   }

   public String addRedTShirtInCart() throws InterruptedException {
        Thread.sleep(1500);
        addToCartButtonForRedTShirt.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
   }

   public String removeRedTShirt() throws InterruptedException {
        Thread.sleep(1500);
        redTShirtRemoveButton.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        Thread.sleep(1500);
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
   }

   public String clickOnProductListButtonForCheckOutButContinueShopping() throws InterruptedException {
        Thread.sleep(1500);
        shoppingCartListButton.click();
        Thread.sleep(1500);
        continueShoppingButton.click();
        Thread.sleep(1500);
        String productPageTitle = backOnProductPageTitle.getText();
        Thread.sleep(1500);
        System.out.println(productPageTitle);
        return productPageTitle;
   }

   public String addBackpackInCart() throws InterruptedException {
        Thread.sleep(1500);
        addToCartForBackpack.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
   }

   public String againProceedToCheckoutAndProceedToPayment() throws InterruptedException {
        Thread.sleep(1500);
        shoppingCartListButton.click();
        Thread.sleep(1500);
        buttonCheckout.click();
        Thread.sleep(1500);
        String headerTextAfterClickOnCheckoutButton = headerDataForProceedToCheckoutAfterClickOnCheckoutButton.getText();
        System.out.println(headerTextAfterClickOnCheckoutButton);
        return headerTextAfterClickOnCheckoutButton;
   }
}
