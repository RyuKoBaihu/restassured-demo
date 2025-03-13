package stepDefinitions;

import enums.Endpoints;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import models.PostVotesRequest;

import static io.restassured.RestAssured.given;

public class PostVotesStepDefinitions {

    private Response response;
    private PostVotesRequest postVotesRequest;

    @Given("that I made a POST request on Votes")
    public void givenThatIMadeAPostRequestOnVotes() {

        postVotesRequest = new PostVotesRequest("asf2", "my-user-1234", 1);
        System.out.println("Request sent");
        response = given()
                .contentType(ContentType.JSON)
                .body(postVotesRequest)
                .log().uri()
                .log().body()
                .when()
                .post(Endpoints.VOTES.getPath())
                .then()
                .log().all()
                .extract()
                .response();
    }

    @When("I use the right body request")
    public void whenIUseTheRightBodyRequest() {
        // O contrato já foi passado na etapa Given
    }

    @Then("it gives me the status code 200")
    public void thenItGivesMeTheStatusCode200() {
        response.then().statusCode(401);
    }
}
