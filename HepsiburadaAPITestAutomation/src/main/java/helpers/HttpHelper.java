package helpers;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.io.File;

import static io.restassured.RestAssured.given;

public class HttpHelper {
    public static Response getRequest(String path) {
        return given().
                contentType(ContentType.JSON).
                get(path).
                then().
                extract().response();
    }

    public static Response postRequest(String path, String requestBody) {
        return given().
                contentType(ContentType.JSON).
                body(requestBody).
                when().
                post(path).
                then().
                extract().response();
    }

    public static Response postRequestFile(String path, File requestBody) {
        return given().
                contentType(ContentType.JSON).
                body(requestBody).
                post(path).
                then().
                extract().response();
    }
}
