package stepDefinitions;

import enums.Endpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import requests.CreateProductsImplements;

import static io.restassured.RestAssured.given;

public class createProductsStepDefinitions {

    private Response response;
    private CreateProductsImplements productRequest;

    @Given("that I prepare a POST request for a {string} scenario")
    public void preparePostRequest(String scenarioType) {
        switch (scenarioType) {
            case "positive":
                productRequest = CreateProductsImplements.positiveScenario();
                break;
            case "negative with invalid title":
                productRequest = CreateProductsImplements.negativeScenarioInvalidTitle();
                break;
            case "negative with invalid price":
                productRequest = CreateProductsImplements.negativeScenarioInvalidPrice();
                break;
            default:
                throw new IllegalArgumentException("Unknown scenario type: " + scenarioType);
        }
    }

    @When("I send the POST request to create a product")
    public void sendPostRequest() {
        response = given()
                .contentType(ContentType.JSON)
                .body(productRequest)
                .log().uri()
                .log().body()
                .when()
                .post(Endpoints.PRODUCTS.getPath())
                .then()
                .log().all()
                .extract()
                .response();
    }

    @When("I use the right body request")
    public void whenIUseTheRightBodyRequest() {
        // Contract already in @Given step
    }

    @Then("it gives me the status code 200")
    public void thenItGivesMeTheStatusCode200() {
        response.then().statusCode(200);
    }
}
