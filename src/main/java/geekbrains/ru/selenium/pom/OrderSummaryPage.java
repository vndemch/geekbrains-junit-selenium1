package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class OrderSummaryPage extends BasePage{
    private static final By CONFIRM_ORDER = new By.ByXPath("//*[@id=\"cart_navigation\"]/button"); //By.cssSelector(".button.btn.btn-default.button-medium");

    public OrderSummaryPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void confirmOrder() {
        if(isElementClicable(CONFIRM_ORDER)) { click(CONFIRM_ORDER); }
    }
}
//*[@id="cart_navigation"]/button
