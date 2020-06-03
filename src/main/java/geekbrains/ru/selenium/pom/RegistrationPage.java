package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class RegistrationPage extends BasePage {
    private static final By REGISTRATION_PAGE_FORM = By.cssSelector("#account-creation_form");
    private static final By REGISTRATION_PAGE_FORM_SUBTITLE = By.cssSelector(".page-subheading");
    private static final By FIRST_NAME = By.cssSelector("#customer_firstname");
    private static final By LAST_NAME = By.cssSelector("#customer_lastname");
    private static final By PASSWORD = By.cssSelector("#passwd");
    private static final By ADDRESS = By.cssSelector("#address1");
    private static final By CITY = By.cssSelector("#city");
    private static final By STATE = By.cssSelector("#id_state");
    private static final By ZIP = By.cssSelector("#postcode");
    private static final By MOBILE = By.cssSelector("#phone_mobile");
    private static final By SUBMIT_BTN = By.cssSelector("#submitAccount");



    public RegistrationPage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    public boolean isRegistrationPageFormPresent () {
        return isElementPresent(REGISTRATION_PAGE_FORM);
    }

    public String getRegistrationPageFormText () {
        return driver.findElement(REGISTRATION_PAGE_FORM_SUBTITLE).getText();
    }

    public void RegistrationFormFill (String[] data) {
        type(data[0],FIRST_NAME);
        type(data[1],LAST_NAME);
        type(data[2],PASSWORD);
        type(data[3],ADDRESS);
        type(data[4],CITY);
        Select select = new Select(driver.findElement(STATE));
        select.selectByIndex(Integer.parseInt(data[5]));
        type(data[6],ZIP);
        type(data[7],MOBILE);
        click(SUBMIT_BTN);
    }
}
