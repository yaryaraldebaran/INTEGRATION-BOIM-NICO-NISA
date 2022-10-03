package cucumber.framework.runner.jcadmin.boim;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/jcadmin/boim/003RincianBiaya002MengeditRB.feature"},
glue = "cucumber.framework.runner.jcadmin.boim",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html"})
public class JCAdminRunnerBoim extends AbstractTestNGCucumberTests{

}
