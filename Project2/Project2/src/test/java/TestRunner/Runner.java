package TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = ".//Features/Saucedemo.feature",
		glue="StepDefination",
		dryRun = false,
		monochrome = true,
		plugin= {"pretty","html:target/Reports/reports1.html" }
		
		)
public class Runner {

}
