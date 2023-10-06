package runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/account_management.feature",
        glue = {"test/stepsDefinitions"},
        plugin = {"json:output/cucumber-report/cucumber.json"},
//        tags = "@smoke",
        snippets = CucumberOptions.SnippetType.CAMELCASE

)
public class StartTests {

}
