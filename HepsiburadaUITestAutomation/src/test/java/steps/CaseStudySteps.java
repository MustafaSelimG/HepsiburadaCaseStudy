package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.Homepage;
import pages.ProductPage;
import pages.SearchResultPage;

public class CaseStudySteps {
    Homepage homepage = new Homepage();
    SearchResultPage searchResultPage = new SearchResultPage();
    ProductPage productPage = new ProductPage();

    @Given("verify that homepage is open")
    public void verifyThatHomepageIsOpen() {
        homepage.verifyHomepageSlider();
    }

    @When("I search for {string}")
    public void ıSearchFor(String searchKey) {
        homepage.searchFor(searchKey);
    }

    @And("I click on product number {string} in the search result page")
    public void ıClickOnProductNumberInTheSearchResultPage(String productNumber) {
        searchResultPage.clickForProductNumber(productNumber);
    }

    @And("I navigate to the comments tab")
    public void ıNavigateToTheCommentsTab() {
        productPage.openReviewsTab();
    }

    @Then("I give plus point to the comment number {string} and assert if a comment exist")
    public void ıGivePlusPointToTheCommentNumberAndAssertIfACommentExist(String commentNumber) {
        productPage.givePlusPointToTheReviewNumber(commentNumber);
    }

}
