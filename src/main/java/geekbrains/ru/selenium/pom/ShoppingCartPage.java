package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShoppingCartPage extends BasePage {

    public static final By PRODUCT_NAME = By.cssSelector("td > p >a");


    public ShoppingCartPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public String getProductName() {
        return driver.findElement(PRODUCT_NAME).getText();
    }

    public boolean isProductNamePresent() {return isElementPresent(PRODUCT_NAME);}

    public void goToItemPage() {
        if(isElementClicable(PRODUCT_NAME)) { click(PRODUCT_NAME);}
    }




}
