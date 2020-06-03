package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderConfirmedPage extends BasePage {

    private static final By ORDER_CONFIRMED_PAGE_HEADER = By.cssSelector(".page-heading");


    public OrderConfirmedPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isOrderConfirmationHeaderPresent() {
        return isElementPresent(ORDER_CONFIRMED_PAGE_HEADER);
    }

    public String getOrderConfirmationHeaderText() {
        return driver.findElement(ORDER_CONFIRMED_PAGE_HEADER).getText();
    }
}
