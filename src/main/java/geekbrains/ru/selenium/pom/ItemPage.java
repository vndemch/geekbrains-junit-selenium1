package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ItemPage extends BasePage {

    public static final By ITEM_PAGE_SUBTITLE = By.cssSelector(".page-product-heading");
    public static final By ADD_TO_CART_BUTTON = By.name("Submit");
    public static final By SELECTED_ITEM_NAME = By.cssSelector(".pb-center-column > h1");
    public static final By SHOPPING_CART_LINK = By.cssSelector(".btn.btn-default.button.button-medium");


    public static final By CLOSE_NOTE = By.cssSelector(".cross");

    public ItemPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isItemPagePresent () {
        return isElementPresent(ITEM_PAGE_SUBTITLE);
    }

    public String getItemPageSubtitleText () {
        return driver.findElement(ITEM_PAGE_SUBTITLE).getText();
    }

    public void addToCard() {
        click(ADD_TO_CART_BUTTON);
    }

    public String getSelectedItemName() {
        return driver.findElement(SELECTED_ITEM_NAME).getText();
    }

    public boolean isShopButtonPresent() {return isElementPresent(SHOPPING_CART_LINK);}


    public void goToCart() {
        if(isElementClicable(SHOPPING_CART_LINK)) { click(SHOPPING_CART_LINK); }
    }


}
