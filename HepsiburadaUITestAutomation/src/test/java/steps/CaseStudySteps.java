package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CaseStudySteps {
    @Given("verify that homepage is open")
    public void verifyThatHomepageIsOpen() {
    }

    @When("I search for {string}")
    public void ıSearchFor(String searchKey) {
    }

    @And("I click on product number {int} in the search result page")
    public void ıClickOnProductNumberInTheSearchResultPage(int productNumber) {
    }

    @And("I navigate to the comments tab")
    public void ıNavigateToTheCommentsTab() {
    }

    @And("I give plus point to the comment number {int}")
    public void ıGivePlusPointToTheCommentNumber(int commentNumber) {
    }

    @Then("assert that title is seen")
    public void assertThatTitleIsSeen() {
    }
}
