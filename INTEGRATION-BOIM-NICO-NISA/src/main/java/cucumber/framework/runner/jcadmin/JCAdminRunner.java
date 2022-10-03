package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {"src/main/resources/jcadmin/003rincianbiaya001menambahRB.feature",
		"src/main/resources/jcadmin/003rincianbiaya002mengeditRB.feature",
		"src/main/resources/jcadmin/005About001AddTrainer.feature",
		"src/main/resources/jcadmin/005About004FindAndMoveTrainer.feature",
		"src/main/resources/jcadmin/005About007EditTrainer.feature",
		"src/main/resources/jcadmin/005About008FindAndEdit.feature"},
glue = "cucumber.framework.runner.jcadmin",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}