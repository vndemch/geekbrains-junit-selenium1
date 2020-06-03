package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ShippingPage extends BasePage {

    private static final By SHIPPING_PAGE_HEADER = By.cssSelector(".page-heading");
    private static final By ACCEPT_CHK = By.cssSelector("#cgv");
    public static final By CONTINUE_CHECKOUT = By.name("processCarrier");

    public ShippingPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isShippingPagePresent () {
        return isElementPresent(SHIPPING_PAGE_HEADER);
    }

    public String getShippingPageHeader () {
        return driver.findElement(SHIPPING_PAGE_HEADER).getText();
    }

    public void acceptChkOn() {
        WebElement chkbox = driver.findElement(ACCEPT_CHK);
        if (!chkbox.isSelected()) {
            chkbox.click();
        }
    }

    public void continueCheckoutFromShipping() {
        click(CONTINUE_CHECKOUT);
    }
}
