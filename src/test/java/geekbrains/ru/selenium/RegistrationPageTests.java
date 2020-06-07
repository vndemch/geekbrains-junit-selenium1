package geekbrains.ru.selenium;

//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;

public class RegistrationPageTests extends BaseUITest {
/*

    @ParameterizedTest
    @MethodSource(value = "regDataGen")
    public void regPageTest(String[] arr) {
        mainpage.toHome();
        mainpage.goToSignIn();
        signinpage.generateNewRandomEmailAccountAndGoToRegistration(5);
        assertTrue(registrationPage.isRegistrationPageFormPresent());
        assertEquals("YOUR PERSONAL INFORMATION", registrationPage.getRegistrationPageFormText().toUpperCase());
        registrationPage.RegistrationFormFill(arr);
        assertTrue(accountPage.isAccountPageHeaderPresent());
        assertEquals("MY ACCOUNT", accountPage.getAccountPageHeaderText());
    }

    public static Stream<Arguments> regDataGen() {
        String[] firstnames = {"John","David","Bob","Max","Alex"};
        String[] lastnames = {"Red","Black","White","Green","Yellow"};

        List<Arguments> out = new ArrayList<>();
        for (int i = 0; i < 1; i++) {
            // Пришлось использовать такую обертку (Arguments.of((Object)).
            // Иначе массив строк выдавал ошибку
            out.add(Arguments.of((Object) new String[] {
            getRandomArrayItem(firstnames),
            getRandomArrayItem(lastnames),
            generateNumSequence(5),
            "qwerty",
            "qwerty",
            "1",
            generateNumSequence(5),
            generateNumSequence(10)}
            ));
        }
        return out.stream();
    }

    public static String generateNumSequence (int numLength) {
        StringBuilder numBuilder = new StringBuilder();
        for (int i = 0; i < numLength; i++) {
            numBuilder.append((char)(48 + (int)(Math.random() * 10)));
        }
        return numBuilder.toString();
    }

    public static String getRandomArrayItem(String[] arr) {
        return arr[(int)(Math.random()*(arr.length))];
    }
*/
}
