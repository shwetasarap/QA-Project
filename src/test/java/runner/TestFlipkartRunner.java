package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;



    @RunWith(Cucumber.class)  // This annotation tells JUnit to run this as a Cucumber test.
    @CucumberOptions(
            features = {"src/test/resources/features/Tests.feature"},  // Path to the feature files
            glue = {"StepDefinations"},  // Package where step definitions are located
            plugin = {"pretty", "html:target/cucumber-reports"}  // Plugins for reports
    )

    public class TestFlipkartRunner {
        // This class doesn't need methods. The annotations do all the work.
    }


