package geekbrains.ru.selenium;

import io.github.bonigarcia.wdm.WebDriverManager;
import geekbrains.ru.selenium.pom.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;

public abstract class BaseUITest {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected MainPage mainpage;
    protected SignInPage signinpage;
    protected RegistrationPage registrationPage;
    protected AccountPage accountPage;
    protected ItemPage itemPage;
    protected ShoppingCartPage shoppingCartPage;
    protected AddressesPage addressesPage;
    protected ShippingPage shippingPage;
    protected PaymentPage paymentPage;
    protected OrderSummaryPage orderSummaryPage;
    protected OrderConfirmedPage orderConfirmedPage;

    @BeforeClass
    @Parameters({"browser"})
    public void init(@Optional(value = "chrome") String browser) {

        switch (browser) {
            case "chrome":
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
            case "firefox":
                WebDriverManager.firefoxdriver().setup();
                driver = new FirefoxDriver();
                break;
            default:
                WebDriverManager.chromedriver().setup();
                driver = new ChromeDriver();
                break;
        }
        wait = new WebDriverWait(driver, 50);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");

        mainpage = new MainPage(driver,wait);
        signinpage = new SignInPage(driver,wait);
        registrationPage = new RegistrationPage(driver,wait);
        accountPage = new AccountPage(driver,wait);
        itemPage = new ItemPage(driver,wait);
        shoppingCartPage = new ShoppingCartPage(driver,wait);
        addressesPage = new AddressesPage(driver,wait);
        shippingPage = new ShippingPage(driver,wait);
        paymentPage = new PaymentPage(driver,wait);
        orderSummaryPage = new OrderSummaryPage(driver,wait);
        orderConfirmedPage = new OrderConfirmedPage(driver,wait);
    }

    @AfterClass
    public void shutdown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
