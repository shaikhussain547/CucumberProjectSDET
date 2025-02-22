package testRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = {"./Features/Vendors.feature","./Features/LoginFeature.feature"},
	//	features = {"./Features/"},  //To run all feature files
		glue = {"stepDefinition"},
		tags = "@sanity",
		dryRun = false,
		monochrome = true,
		plugin = {"pretty","html:target/HTMLReports/report.html"}
		)
public class Run {
/** This class will be empty*/
}
