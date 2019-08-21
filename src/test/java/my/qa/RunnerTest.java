package my.qa;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.AfterClass;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {
                "html:target/cucumber/html",
                "json:target/cucumber/json/cucumber.json",
                "pretty"
        },
        monochrome = true,
        features = {"src/test/resources/feature/"},
        glue = {"my.qa"}
)

public class RunnerTest {

        @AfterClass
        public static void afterClass(){

        }

}
