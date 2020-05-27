package geekbrains.ru.selenium;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MainTest extends BaseUITest {

    @Test
    public void mainPageTest() {
        mainpage.toHome();
        mainpage.goToSignIn();
        assertTrue(signinpage.isSignInPageHeaderPresent());
        assertEquals("authentication", signinpage.getSignInPageHeaderText().toLowerCase());
    }
}
