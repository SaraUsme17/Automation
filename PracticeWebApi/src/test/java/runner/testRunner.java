package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
import org.testng.annotations.DataProvider;

@CucumberOptions(plugin = { "html:target/results.html", "message:target/results.ndjson" })
public class testRunner extends AbstractTestNGCucumberTests {

    @Override
    @DataProvider(parallel = true)

    public Object[][] scenarios() {
        return super.scenarios();
    }
}


