package steps;

import helpers.HttpHelper;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.restassured.response.Response;
import org.apache.http.HttpStatus;
import org.junit.Assert;

import java.io.File;

public class CaseStudySteps {
    String basePath = "/gen/clients";
    Response response;

    @Given("send get request with language for clients library")
    public void sendGetRequestWithLanguageForClientsLibrary() {
        String path = basePath + "/java";

        response = HttpHelper.getRequest(path);
    }

    @Given("send post request with language for clients library")
    public void sendPostRequestWithLanguageForClientsLibrary() {
        String path = basePath + "/java";

        File jsonData = new File("src/main/java/jsonFiles/java.json");

        response = HttpHelper.postRequestFile(path, jsonData);
    }

    @And("assert status code")
    public void assertStatusCode() {
        Assert.assertEquals(HttpStatus.SC_OK, response.statusCode());
    }
}
