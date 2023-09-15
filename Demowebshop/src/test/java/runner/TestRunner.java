package runner;



import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
		features = "Features//DigitalDownloadWishlist.feature",
		glue = {"stepDefination"},

		//dryRun=true
		plugin= {"pretty","html:target/CucumberReportForLoginPage.html"}
		)
public class TestRunner extends AbstractTestNGCucumberTests{

}
