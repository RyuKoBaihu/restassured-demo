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

    @Given("that I made a POST request on products")
    public void givenThatIMadeAPostRequestOnProducts() {

        CreateProductsImplements createProductsImplements = new CreateProductsImplements();
        System.out.println("Request sent");
        response = given()
                .contentType(ContentType.JSON)
                .body(createProductsImplements)
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
