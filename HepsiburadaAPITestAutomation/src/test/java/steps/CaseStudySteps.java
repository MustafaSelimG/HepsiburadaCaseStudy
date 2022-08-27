package steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;

public class CaseStudySteps {
    String URI = "/gen/clients";
    Response response;

    @Given("send get request with language for clients library")
    public void sendGetRequestWithLanguageForClientsLibrary() {
    }

    @And("assert status code")
    public void assertStatusCode() {
    }

    @Given("send post request with language for clients library")
    public void sendPostRequestWithLanguageForClientsLibrary() {
    }
}
