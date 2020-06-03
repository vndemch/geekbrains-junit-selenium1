package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AddressesPage extends BasePage{

    private static final By ADDR_CHECKOUT_BUTTOR = By.name("processAddress");

    public AddressesPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void continueCheckoutWithAddress () {
        click(ADDR_CHECKOUT_BUTTOR);
    }
}
