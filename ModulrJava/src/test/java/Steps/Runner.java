package Steps;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


//For Multiple feature files to be run this class could be used


@RunWith(Cucumber.class)
@CucumberOptions(features="src/test/resources/Features",
glue= {"Steps"},
monochrome=true,
plugin = {"pretty","html:target/HtmlReports"})

public class Runner {

}
