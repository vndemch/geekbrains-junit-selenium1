package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckoutOrder extends BasePage {
    private static final By ADDR_CHECKOUT_BUTTOR = By.name("processAddress");

    private static final By SHIPPING_PAGE_HEADER = By.cssSelector(".page-heading");
    private static final By ACCEPT_CHK = By.cssSelector("#cgv");
    public static final By CONTINUE_CHECKOUT = By.name("processCarrier");

    private static final By PAYMENTPAGEHEADER = By.cssSelector(".page-heading");
    private static final By PAY_BY_BANK_WIRE = By.cssSelector(".bankwire");
    private static final By PAY_BY_CHECK = By.cssSelector(".cheque");

    private static final By CONFIRM_ORDER = new By.ByXPath("//*[@id=\"cart_navigation\"]/button"); //By.cssSelector(".button.btn.btn-default.button-medium");

    private static final By ORDER_CONFIRMED_PAGE_HEADER = By.cssSelector(".page-heading");

    public CheckoutOrder(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void continueCheckoutWithAddress () {
        click(ADDR_CHECKOUT_BUTTOR);
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

    public void payByBankWire() {
        click(PAY_BY_BANK_WIRE);
    }

    public void confirmOrder() {
        if(isElementClicable(CONFIRM_ORDER)) { click(CONFIRM_ORDER); }
    }

    public boolean isOrderConfirmationHeaderPresent() {
        return isElementPresent(ORDER_CONFIRMED_PAGE_HEADER);
    }

    public String getOrderConfirmationHeaderText() {
        return driver.findElement(ORDER_CONFIRMED_PAGE_HEADER).getText();
    }


}
