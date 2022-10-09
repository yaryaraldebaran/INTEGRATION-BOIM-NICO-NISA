package cucumber.framework.runner.jcadmin.Anisa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/jcadmin/001Login002LoginInvalid.feature",
		"src/main/resources/jcadmin/001Login001LoginValid.feature",
		"src/main/resources/jcadmin/002Testimonial004SearchEdit.feature",
		"src/main/resources/jcadmin/002Testimonial003Search.feature",
		"src/main/resources/jcadmin/002Testimonial002Edit.feature",
		"src/main/resources/jcadmin/002Testimonial001Tambah.feature"},
glue = "cucumber.framework.runner.jcadmin",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html",
		"json:target/hrms/jsonreport/LoginRunner.json",
		"junit:target/hrms/junitreport/LoginRunner.xml"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}