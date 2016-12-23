package learnserenity;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

/**
 * Created by rahul.kulkarni on 22/12/2016.
 */

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features="src/test/resources",
        plugin = {
                "pretty", "html:target/cucumber-html-reports",
                "json:target/cucumber.json"},
        tags = "@Mail")

public class RunnerTest {
}
