package geekbrains.ru.selenium.pom;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {
    public String[] firstnames = {"John","David","Bob","Max","Alex"};
    public String[] lastnames = {"Red","Black","White","Green","Yellow"};

    WebDriver driver;
    WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void type(String text, By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        WebElement element = driver.findElement(by);
        element.clear();
        element.sendKeys(text);
    }

    public void click(By by) {
        wait.until(ExpectedConditions.presenceOfElementLocated(by));
        driver.findElement(by).click();
    }

    public boolean isElementPresent(By by) {
        try {
            wait.until(ExpectedConditions.presenceOfElementLocated(by));
            driver.findElement(by);
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }

    public void waitABit(int sec) {
        try {
            Thread.sleep(sec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public boolean isElementClicable(By by) {
        try {
            wait.until(ExpectedConditions.elementToBeClickable(by));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }
    public boolean isElementVisible(By by) {
        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(by));
            return true;
        } catch (NoSuchElementException e) {
            return false;
        }
    }


}
