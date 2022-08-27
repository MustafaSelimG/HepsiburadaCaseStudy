package pages;

import helpers.Helper;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class SearchResultPage {
    public SearchResultPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    public void clickForProductNumber(String productNumber) {
        String id = "i" + ((Integer.parseInt(productNumber)) - 1);
        Helper.clickElementById(id);
    }
}
