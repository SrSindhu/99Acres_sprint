package runner;

import org.testng.annotations.Test;
import io.cucumber.junit.Cucumber;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;
//import io.cucumber.junit.CucumberOptions;

//@RunWith(Cucumber.class)
@CucumberOptions(
		features="feature",
		glue="stepDefinitions",
		//plugin="com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
		dryRun=true,

				//plugin={"pretty","json:target/cucumberReports.json"})

				//plugin={"pretty","junit:target/cucumberReports.xml"})
		plugin={"pretty","html:target/CucumberReports.html",
						"json:target/CucumberReport/JSONReport.json",
						"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:"}
		)


public class testng extends AbstractTestNGCucumberTests {
	
}
