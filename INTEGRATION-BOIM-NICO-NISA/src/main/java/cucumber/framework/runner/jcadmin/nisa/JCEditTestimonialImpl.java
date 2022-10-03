package cucumber.framework.runner.jcadmin.nisa;

import org.openqa.selenium.WebDriver;

import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import cucumber.framework.constant.Constants;
import cucumber.framework.page.jcadmin.JCAdminTestimonial;
import cucumber.framework.utils.Utils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class JCEditTestimonialImpl {
	private static WebDriver driver;
	private static ExtentTest extentTest;
	private JCAdminTestimonial JCAdminTes; 
	String strDelay = Constants.GLOB_PARAM_DELAY;
	
	public JCEditTestimonialImpl() {
		driver = JCAdminHooks.driver;
		extentTest = JCAdminHooks.extentTest;
		driver.get(Constants.URL_JCADMIN_LOGIN);
		JCAdminTes = new JCAdminTestimonial();
		
	}
	//INI BACKGROUND
	@When("Admin login dan membuka halaman testimonials")
	public void admin_login_dan_membuka_halaman_testimonial() {
	    JCAdminTes.goToHome();
		JCAdminTes.goToTestimonial();
		extentTest.log(LogStatus.PASS, "Admin login dan membuka halaman testimonials");
	}

	@And("Admin klik tombol edit testimonial pertama")
	public void admin_klik_tombol_edit_testimonial_pertama() {
	    JCAdminTes.editClickDataPertama();
	    extentTest.log(LogStatus.PASS, "Admin klik tombol edit testimonial pertama");
	}
	//INI AKHIR BACKGROUND
	
	
//	edit gambar peserta
	@When("TE028P Admin mengedit gambar peserta")
	public void admin_mengedit_gambar_peserta() {
		System.out.println("INI DARI ADMIN EDIT GAMBAR");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editGambar();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE028P Admin mengedit gambar peserta");
	}

	@And("TE028P Admin menekan tombol simpan edit gambar peserta")
	public void admin_menekan_tombol_simpan_edit_gambar_peserta() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE028P Admin menekan tombol simpan edit gambar peserta");
	}

	@Then("TE028P Admin berhasil edit gambar peserta")
	public void admin_berhasil_edit_gambar_peserta() {
	    extentTest.log(LogStatus.PASS, "TE028P Admin berhasil edit gambar peserta");
	}
	
//	edit nama peserta
	@When("TE035P Admin mengedit nama peserta")
	public void admin_mengedit_nama_peserta() {
		System.out.println("INI DARI ADMIN EDIT NAMA");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editNamaPeserta();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE035P Admin mengedit nama peserta");
	}

	@And("TE035P Admin menekan tombol simpan edit nama peserta")
	public void admin_menekan_tombol_simpan_edit_nama_peserta() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE035P Admin menekan tombol simpan edit nama peserta");
	}

	@Then("TE035P Admin berhasil edit nama peserta")
	public void admin_berhasil_edit_nama_peserta() {
		
		extentTest.log(LogStatus.PASS,"TE035P nama peserta sudah diedit");
	}
	
//	edit isi
	@When("TE036P Admin mengedit isi testimonial")
	public void admin_mengedit_isi_testimonial() {
		System.out.println("INI DARI ADMIN EDIT ISI");
//	    Utils.fullScroll();
		Utils.delay(2, strDelay);
	    JCAdminTes.editIsiTesti();
	    Utils.delay(2, strDelay);
	    extentTest.log(LogStatus.PASS, "TE036P Admin mengedit isi testimonial");
	}

	@And("TE036P Admin menekan tombol simpan edit isi testimonial")
	public void admin_menekan_tombol_simpan_edit_isi_testimonial() {
		Utils.fullScroll();
		JCAdminTes.clickSimpan();
		extentTest.log(LogStatus.PASS, "TE036P Admin menekan tombol simpan edit isi testimonial");
	}

	@Then("TE036P Admin berhasil edit isi testimonial")
	public void admin_berhasil_edit_isi_testimonial() {
		
		extentTest.log(LogStatus.PASS, "TE036P Admin berhasil edit isi testimonial");
	}

}
