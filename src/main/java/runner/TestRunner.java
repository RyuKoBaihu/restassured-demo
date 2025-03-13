package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.restassured.RestAssured;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(

        features = {"src/test/resources/features"},
        glue = {"stepDefinitions"},
        monochrome = false,
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Create_Products"
)
public class TestRunner {
    @BeforeClass
    public static void setUp() {
        RestAssured.baseURI = "https://fakestoreapi.com/";
        RestAssured.useRelaxedHTTPSValidation();
    }
}
