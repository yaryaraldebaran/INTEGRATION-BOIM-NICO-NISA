package cucumber.framework.runner.jcadmin.Cnico;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/jcadmin/nico/005About004FindAndMoveTrainer.feature"},
glue = "cucumber.framework.runner.jcadmin.nico",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html"})
public class JCAdminRunnerNico extends AbstractTestNGCucumberTests{

}