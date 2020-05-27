package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MainPage extends BasePage {

    public static final String HOME_URL = "http://automationpractice.com";
    private static final By SIGN_IN_BTN = By.cssSelector(".login");

    public MainPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public void toHome() {
        driver.get(HOME_URL);
    }

    public void goToSignIn() {
        click(SIGN_IN_BTN);
    }

}
