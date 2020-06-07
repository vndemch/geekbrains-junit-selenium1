package geekbrains.ru.selenium;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MainTest extends BaseUITest {

    @Test
    public void mainPageTest() {
        mainpage.toHome();
        mainpage.goToSignIn();
        Assert.assertTrue(signinpage.isSignInPageHeaderPresent());
        Assert.assertEquals("authentication", signinpage.getSignInPageHeaderText().toLowerCase());
    }
}
