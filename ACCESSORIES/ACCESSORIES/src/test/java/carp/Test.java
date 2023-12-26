package carp;
import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
//import io.cucumber.junit.CucumberOptions.SnippetType;





@RunWith(Cucumber.class)
@CucumberOptions(
		features = "features",
		glue="carp",
		strict = true,
		plugin = {"pretty","html:target/outcucumber.html"}
) 
public class Test {

}