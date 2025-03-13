package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        //dryRun = false,
        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        monochrome = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        //stepNotifications = true,
        tags = "@PostVotesRequest"
)
public class TestRunner {
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://api.thecatapi.com";
        RestAssured.useRelaxedHTTPSValidation();
    }
}
