package cucumber.framework.page.jcadmin;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.framework.connection.DriverSingleton;
import cucumber.framework.constant.Constants;
import cucumber.framework.utils.Utils;

public class JCAdminTestimonial extends JCAdminLoginPage {
	private WebDriver driver;
	private String strDelay = Constants.GLOB_PARAM_DELAY;

	public JCAdminTestimonial() {
		this.driver = DriverSingleton.getDriver();
		PageFactory.initElements(driver, this);
		super.LoginPage("ucen1315@gmail.com", "a");
	}
	@FindBy(linkText = "Home")
	private WebElement btnHome;
	@FindBy(linkText = "Testimonial")
	private WebElement btnTestimonial;
	@FindBy(linkText = "Tambahh")
	private WebElement btnTambahhTestimonial;
	@FindBy(xpath = "//h3[normalize-space()='List Testimonial']")
	private WebElement txtLaman;
	
	//form tambah testimonial
	@FindBy(xpath = "//input[@name='uploadedFile']")
	private WebElement upload;
	@FindBy(name = "nama")
	private WebElement nama;
	@FindBy(xpath = "//input[@id='nama']")
	private WebElement editNamaPeserta;
	@FindBy(id = "exampleFormControlSelect9")
	private WebElement selPublish;
	@FindBy(name = "body")
	private WebElement isiTesti;
	@FindBy(xpath = "/html[1]/body[1]/div[2]/div[2]/div[2]/div[2]/div[1]/div[1]/div[1]/form[1]/div[2]/div[1]/div[5]/div[1]/select[1]")
	private WebElement selRating;	
	
//	data yang akan diedit 
	@FindBy(xpath ="//figure[1]//a[1]//img[1]")
	private WebElement editPertama;
	
	@FindBy(xpath ="//figure[14]//a[1]//img[1]")
	private WebElement editData;
	
	@FindBy(xpath = "//input[@name='mysubmit']")
	private WebElement btnSubmit;
	
	@FindBy(xpath = "//input[@value='Pilih Gambar Ulang']")
	private WebElement uploadUlang;
	
	public void tambahDataTestimonialPublish(String statss){
		uploadFile("C:\\Users\\NEXSOFT\\Downloads\\shutterstock.jpeg");
		Utils.delay(3, strDelay);
		this.nama.sendKeys("Budi");
		Utils.delay(3, strDelay);
		Select selPublish = new Select(this.selPublish);
		selPublish.selectByVisibleText(statss);
		Utils.delay(3, strDelay);
		this.isiTesti.sendKeys("Juara Coding the best");
		Utils.delay(3, strDelay);
		selRating.click();
		pilihRating(2);
		Utils.delay(3, strDelay);
	}
	
	// MENGEDIT DATA
		public void editNamaPeserta() {
			editNamaPeserta.clear();
			this.editNamaPeserta.sendKeys("Aliando Syarif");
			Utils.delay(2, strDelay);
		}
		
		public void editIsiTesti() {
			isiTesti.clear();
			this.isiTesti.sendKeys("Fasilitas di JuaraCoding sangat lengkap dari internet yang cepat");
			Utils.delay(2, strDelay);
		}
		
		public void editGambar() {
			uploadUlang.click();
			uploadUlangAction("C:\\Users\\NEXSOFT\\Downloads\\aliando.jpeg");
			Utils.delay(3, strDelay);
		}
		
		public void editClickDataPertama() {
			this.editPertama.click();
		}
		
		public void uploadFile(String foto){
		Utils.delay(1, strDelay);
		this.upload.sendKeys(foto);
		}
		

		public static void uploadUlangAction(String lokasiFile) {
			// creating object of Robot class
		    Robot rb;
			try {
				rb = new Robot();
			    // copying File path to Clipboard
			    StringSelection str = new StringSelection(lokasiFile);
			    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str, null);
			 
			     // press Contol+V for pasting
			     rb.keyPress(KeyEvent.VK_CONTROL);
			     rb.keyPress(KeyEvent.VK_V);
			 
			    // release Contol+V for pasting
			    rb.keyRelease(KeyEvent.VK_CONTROL);
			    rb.keyRelease(KeyEvent.VK_V);
			 
			    // for pressing and releasing Enter
			    rb.keyPress(KeyEvent.VK_ENTER);
			    rb.keyRelease(KeyEvent.VK_ENTER);

			} catch (AWTException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	
		public void clickSimpan() {
			Utils.fullScroll();;
			Utils.delay(1, strDelay);
			this.btnSubmit.click();
		}
		
		public String getTxtTestimonial() {
		return new WebDriverWait(driver, Duration.ofSeconds(15))
				.until(ExpectedConditions.visibilityOf(txtLaman)).getText();
		}
		
		public void goToHome() {
		this.btnHome.click();
		}
	
		public void goToTestimonial() {
		this.btnTestimonial.click();
		}
		
		public void goToTambahTesti() {
		this.btnTambahhTestimonial.click();
		}
	
//		hapus kolom edit (steril)
		public void clearField() {
		try {
			Robot rbtclr = new Robot();
			rbtclr.keyPress(KeyEvent.VK_CONTROL);
			rbtclr.keyPress(KeyEvent.VK_A);
			rbtclr.keyRelease(KeyEvent.VK_CONTROL);
			rbtclr.keyRelease(KeyEvent.VK_A);
			rbtclr.keyPress(KeyEvent.VK_BACK_SPACE);
			rbtclr.keyRelease(KeyEvent.VK_BACK_SPACE);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
		public static void pilihRating(int nilaiRate) {
		try {
			Robot rbt = new Robot();
			for (int i= 0; i<nilaiRate;i++) {
				rbt.keyPress(KeyEvent.VK_DOWN);
				rbt.keyRelease(KeyEvent.VK_DOWN);
			}
			rbt.keyPress(KeyEvent.VK_ENTER);
			rbt.keyRelease(KeyEvent.VK_ENTER);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		}
		
	
	
//	driver.get("https://dev.ptdika.com/web_jc_v2/index.php/admin#");
//    driver.findElement(By.linkText("Home")).click();
//    driver.findElement(By.linkText("Testimonial")).click();
//    driver.findElement(By.linkText("Tambahh")).click();
//    driver.findElement(By.name("uploadedFile")).click();
//    driver.findElement(By.name("uploadedFile")).clear();
//    driver.findElement(By.name("uploadedFile")).sendKeys("C:\\fakepath\\shutterstock.jpeg");
//    driver.findElement(By.name("nama")).click();
//    driver.findElement(By.name("nama")).clear();
//    driver.findElement(By.name("nama")).sendKeys("Siapa");
//    driver.findElement(By.id("exampleFormControlSelect9")).click();
//    driver.findElement(By.xpath("//option[@value='1']")).click();
//    driver.findElement(By.name("body")).click();
//    driver.findElement(By.name("body")).clear();
//    driver.findElement(By.name("body")).sendKeys("Sangat bagus");
//    driver.findElement(By.id("rating")).click();
//    new Select(driver.findElement(By.id("rating"))).selectByVisibleText("2");
//    driver.findElement(By.xpath("//option[@value='2']")).click();
//    driver.findElement(By.name("mysubmit")).click();
//    driver.findElement(By.xpath("//div[@id='pageWrapper']/div[2]/div[2]/div[2]/div/div/div/div")).click();
	
	
}
