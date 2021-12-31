package Runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
              features={"src/test/resources/Features/StudentRegistration.feature"},
                glue = {"Steps"},
                plugin={"pretty","html:target/report.html",
                        "rerun:target/failedRerun.txt"},
                 tags = "@regression"
)


public class TestRunner {


}
