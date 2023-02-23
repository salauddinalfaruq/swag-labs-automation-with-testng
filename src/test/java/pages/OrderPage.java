package pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderPage {

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
    WebElement firstNameForProceedToPayment;
    @FindBy(name = "lastName")
    WebElement lastNameForProceedToPayment;
    @FindBy(name = "postalCode")
    WebElement postalCodeForProceedToPayment;
    @FindBy(id = "continue")
    WebElement buttonContinue;
    @FindBy(xpath = "//div[@class='error-message-container error']")
    WebElement errorMessageIfUserWantToContinueCheckoutWithoutFillCredentials;
    @FindBy(xpath = "//span[@class='title']")
    WebElement checkoutOverview;
    @FindBy(id = "cancel")
    WebElement cancelButtonInCheckoutOverview;
    @FindBy(className = "product_sort_container")
    WebElement productSortContainerField;
    @FindBy(xpath = "//option[@value='lohi']")
    WebElement productSortingLowToHighButton;
    @FindBy(id = "add-to-cart-sauce-labs-onesie")
    WebElement onesieAddToCArtButton;
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

    Actions actions;

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

   public String clickOnProductListButtonForCheckOutButClickOnContinueShopping() throws InterruptedException {
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

   public String clickOnContinueButtonWithoutFillFirstName() throws InterruptedException {
        Thread.sleep(1500);
        buttonContinue.click();
        Thread.sleep(1500);
        String errorTextForCheckoutWithoutFillFirstName = errorMessageIfUserWantToContinueCheckoutWithoutFillCredentials.getText();
        System.out.println(errorTextForCheckoutWithoutFillFirstName);
        return errorTextForCheckoutWithoutFillFirstName;
   }

   public String clickOnContinueButtonWithoutFillLastName() throws InterruptedException {
        Thread.sleep(1500);
        firstNameForProceedToPayment.sendKeys("Mafiul");
        Thread.sleep(1500);
        buttonContinue.click();
        Thread.sleep(1500);
        String errorTextForCheckoutWithoutFillLastName = errorMessageIfUserWantToContinueCheckoutWithoutFillCredentials.getText();
        System.out.println(errorTextForCheckoutWithoutFillLastName);
        return errorTextForCheckoutWithoutFillLastName;
   }

   public String clickOnContinueButtonWithoutFillPostalCode() throws InterruptedException {
       Thread.sleep(1500);
       actions = new Actions(driver);
       actions.moveToElement(firstNameForProceedToPayment).doubleClick().click().
               keyDown(Keys.BACK_SPACE).
               keyUp(Keys.BACK_SPACE).perform();
       Thread.sleep(1500);
       firstNameForProceedToPayment.sendKeys("Muntasir");
       Thread.sleep(1500);
       lastNameForProceedToPayment.sendKeys("Abir");
       Thread.sleep(1500);
       buttonContinue.click();
       Thread.sleep(1500);
       String errorTextForCheckOutWithoutFillPostalCode = errorMessageIfUserWantToContinueCheckoutWithoutFillCredentials.getText();
       System.out.println(errorTextForCheckOutWithoutFillPostalCode);
       return errorTextForCheckOutWithoutFillPostalCode;
   }

   public String fillAllTheCredentialsButDoNotClickOnContinueButton() throws InterruptedException {
        Thread.sleep(1500);
        actions = new Actions(driver);
        actions.moveToElement(firstNameForProceedToPayment).doubleClick().click().
               keyDown(Keys.BACK_SPACE).
               keyUp(Keys.BACK_SPACE).perform();
        Thread.sleep(1500);
        actions.moveToElement(lastNameForProceedToPayment).doubleClick().click().
               keyDown(Keys.BACK_SPACE).
               keyUp(Keys.BACK_SPACE).perform();
        Thread.sleep(1500);
        firstNameForProceedToPayment.sendKeys("Shahriar");
        Thread.sleep(1500);
        lastNameForProceedToPayment.sendKeys("Sadi");
        Thread.sleep(1500);
        postalCodeForProceedToPayment.sendKeys("1207");
        Thread.sleep(1500);
        buttonContinue.click();
        Thread.sleep(1500);
        String checkoutOverviewText = checkoutOverview.getText();
        System.out.println(checkoutOverviewText);
        Thread.sleep(1500);
        return checkoutOverviewText;
   }

   public String clickOnCancelBackAndBackToProductListForAddProduct() throws InterruptedException {
        Thread.sleep(1500);
        cancelButtonInCheckoutOverview.click();
        Thread.sleep(1500);
        String productTitlePageText = backOnProductPageTitle.getText();
        System.out.println(productTitlePageText);
        return productTitlePageText;
   }

   public String clickONProductSortingButtonAndSortProduct() throws InterruptedException {
        Thread.sleep(1500);
        productSortContainerField.click();
        Thread.sleep(1500);
        productSortingLowToHighButton.click();
        Thread.sleep(1500);
        String productSortingFieldText = productSortingLowToHighButton.getText();
        System.out.println(productSortingFieldText);
        return productSortingFieldText;
   }

   public String addSauceLabsOnesieInCart() throws InterruptedException {
        Thread.sleep(1500);
        onesieAddToCArtButton.click();
        Thread.sleep(1500);
        String shoppingBadgeCount = shoppingBadge.getText();
        Thread.sleep(1500);
        System.out.println(shoppingBadgeCount);
        return shoppingBadgeCount;
   }
}
