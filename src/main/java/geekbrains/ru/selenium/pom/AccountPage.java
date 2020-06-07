package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AccountPage extends BasePage {
    private static final By ACCOUNTPAGEHEADER = By.cssSelector(".page-heading");


    public AccountPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isAccountPageHeaderPresent () {
        return isElementPresent(ACCOUNTPAGEHEADER);
    }

    public String getAccountPageHeaderText () {
        return driver.findElement(ACCOUNTPAGEHEADER).getText();
    }


}
