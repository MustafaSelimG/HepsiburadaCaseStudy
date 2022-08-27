package pages;

import helpers.Helper;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utils.Driver;

public class ProductPage {
    public ProductPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "reviewsTabTrigger")
    public WebElement reviewsTabsBtn;

    @FindBy(css = ".hermes-ProductRate-module-iigXxhEaE3_4WHSctvzs")
    public WebElement noCommentTitle;


    public void openReviewsTab() {
        Helper.switchLastTab();
        Helper.scrollToElement(reviewsTabsBtn);
        reviewsTabsBtn.click();
    }

    public void givePlusPointToTheReviewNumber(String commentNumber) {
        String reviewPlusPointXpath = "(//div[@class='hermes-ReviewCard-module-PbSfiSWIgfswGGBaOrw7'])" + "[" + commentNumber + "]";
        if (Helper.isDisplayedByXpath(reviewPlusPointXpath)) {
            Helper.scrollToElementByXpath(reviewPlusPointXpath);
            Helper.clickByXpath(reviewPlusPointXpath);

            assertCommentVoteFeedbackIsShown(commentNumber);
        } else {
            Assert.assertEquals("Henüz değerlendirme yok", noCommentTitle.getText());
        }
    }

    public void assertCommentVoteFeedbackIsShown(String commentNumber) {
        String voteFeedbackXpath = "(//span[@class='hermes-ReviewCard-module-eFtSSTU4lYZLCnzHtzca'])" + "[" + commentNumber + "]";
        Assert.assertEquals("Teşekkür Ederiz.", Helper.getTextByXpath(voteFeedbackXpath));
    }
}
