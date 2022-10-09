package cucumber.framework.runner.jcadmin;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
features = {
		"src/main/resources/jcadmin/anisa/001Login001LoginValid.feature",
		"src/main/resources/jcadmin/anisa/001Login002LoginInvalid.feature",
		"src/main/resources/jcadmin/anisa/002Testimonial001Tambah.feature",
		"src/main/resources/jcadmin/anisa/002Testimonial002TambahNegatif.feature",       
		"src/main/resources/jcadmin/anisa/002Testimonial003Edit.feature",
		"src/main/resources/jcadmin/anisa/002Testimonial004EditNegatif.feature",
		"src/main/resources/jcadmin/anisa/002Testimonial005Search.feature",
		"src/main/resources/jcadmin/anisa/002Testimonial006SearchNegatif.feature",       
		"src/main/resources/jcadmin/anisa/002Testimonial007SearchEdit.feature",
		"src/main/resources/jcadmin/anisa/002Testimonial008ListTestimonial.feature",     
		"src/main/resources/jcadmin/anisa/002Testimonial009SlidePageTestimonial.feature",
		
		
        "src/main/resources/jcadmin/nico/005About001AddTrainer.feature",
        "src/main/resources/jcadmin/nico/005About002AddTrainerNegative.feature",
        "src/main/resources/jcadmin/nico/005About003FindAndMoveTrainer.feature",
        "src/main/resources/jcadmin/nico/005About004FindAndMoveNegative.feature",
        "src/main/resources/jcadmin/nico/005About005EditTrainer.feature",
        "src/main/resources/jcadmin/nico/005About006EditTrainerNegative.feature",
        "src/main/resources/jcadmin/nico/005About007EditInputTrainerNegative.feature",
        "src/main/resources/jcadmin/nico/006Blog005FindAndEditBlogNegative.feature",
        "src/main/resources/jcadmin/nico/007ContactMessages001GetMessages.feature",
        "src/main/resources/jcadmin/nico/007ContactMessages002SearchMessages.feature",
        "src/main/resources/jcadmin/nico/007ContactMessages003MovePage.feature",
        "src/main/resources/jcadmin/nico/007ContactMessages004CariNegative.feature",
        "src/main/resources/jcadmin/nico/005About008FindAndEdit.feature",
		},
glue = "cucumber.framework.runner.jcadmin",
monochrome=true,
plugin = {"pretty","html:target/jcadmin/htmlreport/LoginRunner.html"})
public class JCAdminRunnerKolektif extends AbstractTestNGCucumberTests{

}