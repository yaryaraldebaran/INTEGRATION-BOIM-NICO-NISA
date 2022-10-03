package cucumber.framework.runner.jcadmin.boim;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/jcadmin/003RincianBiaya002MengeditRB.feature"},
glue = "cucumber.framework.runner.jcadmin",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}
