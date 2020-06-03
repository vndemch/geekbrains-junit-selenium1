package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PaymentPage extends BasePage {

    private static final By PAYMENTPAGEHEADER = By.cssSelector(".page-heading");
    private static final By PAY_BY_BANK_WIRE = By.cssSelector(".bankwire");
    private static final By PAY_BY_CHECK = By.cssSelector(".cheque");



    public PaymentPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void payByBankWire() {
        click(PAY_BY_BANK_WIRE);
    }
}
