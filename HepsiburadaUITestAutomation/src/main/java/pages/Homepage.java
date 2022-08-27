package pages;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class Homepage {
    public Homepage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = ".sf-voltran-body.voltran-body.full.Herousel_505")
    public WebElement homepageSlider;

    @FindBy(css = ".desktopOldAutosuggestTheme-input")
    public WebElement searchBar;

    public void verifyHomepageSlider() {
        Assert.assertTrue(homepageSlider.isDisplayed());
    }

    public void searchFor(String searchKey) {
        searchBar.click();
        searchBar.sendKeys(searchKey, Keys.ENTER);
    }
}
