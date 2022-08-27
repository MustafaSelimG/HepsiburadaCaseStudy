package helpers;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import utils.Driver;

import java.util.Set;

public class Helper {
    private static final WebDriver driver = Driver.get();

    public static void clickElementById(String id) {
        driver.findElement(By.id(id)).click();
    }

    public static void switchLastTab() {
        String originTab = Driver.get().getWindowHandle();
        Set<String> allTabs = Driver.get().getWindowHandles();

        for (String tab : allTabs) {
            if (!originTab.equals(tab)) {
                Driver.get().switchTo().window(tab);
            }
        }
    }

    public static void scrollToElement(WebElement element) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public static void scrollToElementByXpath(String xpath) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", driver.findElement(By.xpath(xpath)));
    }

    public static void clickByXpath(String xpath) {
        driver.findElement(By.xpath(xpath)).click();
    }

    public static String getTextByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath)).getText();
    }

    public static boolean isDisplayedByXpath(String xpath) {
        return driver.findElement(By.xpath(xpath)).isDisplayed();
    }
}
