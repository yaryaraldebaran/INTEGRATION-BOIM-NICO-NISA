package cucumber.framework.runner.jcadmin.nisa;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/jcadmin/nisa/001Login002LoginInvalid.feature"},
//		"src/main/resources/jcadmin/001Login001LoginValid.feature"},
//		"src/main/resources/jcadmin/002Testimonial002Edit.feature"},
//		"src/main/resources/jcadmin/002Testimonial001Tambah.feature"},
glue = "cucumber.framework.runner.jcadmin.nisa",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html"})
public class JCAdminRunner extends AbstractTestNGCucumberTests{

}