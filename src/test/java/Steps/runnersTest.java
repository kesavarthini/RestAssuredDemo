package Steps;

import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;

@RunWith(Cucumber.class)
//@CucumberOptions(plugin ={"pretty" , "html:target/generated-test-sources/test-annotations"},features="java/Features", glue="")
@CucumberOptions(features="src/test/java/Features/GetPost.feature", glue="src/test/java/Steps/GetPostSteps.java",monochrome = true)
public class runnersTest {
}
