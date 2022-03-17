package AccountView.Runners;

import io.cucumber.junit.*;
import org.junit.runner.*;

@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features", glue={"StepsDefinition"}, plugin = {"json:target/cucumber.json"})
public class TestRunner {
}
