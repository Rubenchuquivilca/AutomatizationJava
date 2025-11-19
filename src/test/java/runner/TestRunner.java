package runner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.Test;
import org.junit.runner.RunWith;
import utility.BrowserDriver;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/features",
        glue = {"utility", "stepDefinition"},
        plugin = {"pretty", "html:target/cucumber-html-report.html","json:cucumber.json"}

)
public class TestRunner {

    //BrowserDriver browserDriver;

    //@Test
    //public void TestRunner(){
    //    browserDriver = new BrowserDriver();
    //    browserDriver.getDriver();
    //}
}
