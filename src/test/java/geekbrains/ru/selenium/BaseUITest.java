package geekbrains.ru.selenium;

//import io.github.bonigarcia.wdm.WebDriverManager;
import geekbrains.ru.selenium.pom.*;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BaseUITest {

    protected WebDriver driver;
    protected WebDriverWait wait,wait15;
    protected MainPage mainpage;
    protected SignInPage signinpage;
    protected RegistrationPage registrationPage;
    protected AccountPage accountPage;
    protected ItemPage itemPage;
    protected ShoppingCartPage shoppingCartPage;

    @BeforeEach
    public void init() {
//        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com");

        mainpage = new MainPage(driver,wait);
        signinpage = new SignInPage(driver,wait);
        registrationPage = new RegistrationPage(driver,wait);
        accountPage = new AccountPage(driver,wait);
        itemPage = new ItemPage(driver,wait);
        shoppingCartPage = new ShoppingCartPage(driver,wait);
    }

    @AfterEach
    public void shutdown() {
        driver.quit();
    }
}
