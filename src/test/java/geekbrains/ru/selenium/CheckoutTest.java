package geekbrains.ru.selenium;


import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CheckoutTest extends BaseUITest{

    @Test(dataProvider = "testData")
    public void accPageTest(String[] arr) {
        mainpage.toHome();
        mainpage.goToSignIn();
        signinpage.generateNewRandomEmailAccountAndGoToRegistration(5);
//        Assert.assertTrue(registrationPage.isRegistrationPageFormPresent());
//        Assert.assertEquals("YOUR PERSONAL INFORMATION", registrationPage.getRegistrationPageFormText().toUpperCase());
        registrationPage.RegistrationFormFill(arr);
        mainpage.toHome();
        mainpage.goToItem();
        Assert.assertTrue(itemPage.isItemPagePresent());
        Assert.assertEquals(itemPage.getItemPageSubtitleText().toUpperCase(), "DATA SHEET");
        String itemToBuy = itemPage.getSelectedItemName();
        itemPage.addToCard();
        Assert.assertTrue(itemPage.isShopButtonPresent());
        itemPage.goToCart();
        Assert.assertTrue(shoppingCartPage.isProductNamePresent());
        Assert.assertEquals(itemToBuy.toLowerCase(), shoppingCartPage.getProductName().toLowerCase());
        shoppingCartPage.startCheckout();
        addressesPage.continueCheckoutWithAddress();
        Assert.assertTrue(shippingPage.isShippingPagePresent());
        Assert.assertEquals(shippingPage.getShippingPageHeader().toUpperCase(),"SHIPPING");
        shippingPage.acceptChkOn();
        shippingPage.continueCheckoutFromShipping();
        paymentPage.payByBankWire();
        orderSummaryPage.confirmOrder();
        Assert.assertTrue(orderConfirmedPage.isOrderConfirmationHeaderPresent());
        Assert.assertEquals(orderConfirmedPage.getOrderConfirmationHeaderText().toUpperCase(),"ORDER CONFIRMATION");
    }

    @DataProvider(name = "testData")
    public Object[][] regDataGenNG() {
        String[] firstnames = {"John","David","Bob","Max","Alex"};
        String[] lastnames = {"Red","Black","White","Green","Yellow"};

        return new Object[][] {
                new String[] {
                        getRandomArrayItem(firstnames),
                        getRandomArrayItem(lastnames),
                        generateNumSequence(5),
                        "qwerty",
                        "qwerty",
                        "Alabama",
                        generateNumSequence(5),
                        generateNumSequence(10)
                }
        };
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

}
