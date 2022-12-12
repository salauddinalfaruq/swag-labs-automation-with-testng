package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OrderPage {

    @FindBy(id = "id=add-to-cart-sauce-labs-bike-light")
    WebElement addToCartButtonForBikeLight;
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Fleece Jacket']")
    WebElement sauceLabsFourthItemJacket;
    @FindBy(xpath = "//div[normalize-space()='Sauce Labs Bolt T-Shirt']")
    WebElement itemHeaderForBoltTShirt;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-bolt-t-shirt']")
    WebElement addToCartButtonForBoltTShirtAfterClickItemHeader;
    @FindBy(id="add-to-cart-test.allthethings()-t-shirt-(red)")
    WebElement addToCartButtonForRedTShirt;
    @FindBy(id = "remove-test.allthethings()-t-shirt-(red)")
    WebElement redTShirtRemoveButton;
    @FindBy(className = "shopping_cart_link")
    WebElement shoppingCartListButton;
    @FindBy(xpath = "//button[@id='remove-sauce-labs-bolt-t-shirt']")
    WebElement boltTShirtRemoveButtonFromList;
    @FindBy(name = "continue-shopping")
    WebElement continueShoppingButton;
    @FindBy(xpath = "//button[@id='add-to-cart-sauce-labs-backpack']")
    WebElement addToCartForBackpack;
    @FindBy(id = "checkout")
    WebElement buttonCheckout;
    @FindBy(name = "firstName")
    WebElement firstName;
    @FindBy(name = "lastName")
    WebElement lastNameForConfirmation;
    @FindBy(name = "postalCode")
    WebElement postalCodeForConfirmation;
}
