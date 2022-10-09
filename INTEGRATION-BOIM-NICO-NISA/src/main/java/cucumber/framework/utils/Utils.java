package cucumber.framework.utils;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import cucumber.framework.connection.DriverSingleton;

public class Utils {

	public static WebDriver driver = DriverSingleton.getDriver();
	public static int testCount = 0;
	public static int countOutline = 1;
	
	public static String getScreenshot(WebDriver driver, String screenshotName) throws IOException {
		String dateName = new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		String destination = System.getProperty("user.dir")+"/FailedTestScreenshot/"
				+screenshotName+"_"+dateName+".png";
		File finalDestination = new File(destination);
		FileUtils.copyFile(source, finalDestination);
		return destination;
	}
	
	public static void delay(int detik, String delays) {
		if(delays.equals("y"))
		{
			try {
				Thread.sleep(1000*detik);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}		
	}
	public static void fullScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	}
	public static void littleScroll() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,200)","");
	}
	public static void zoomOut() {
		Robot rbt;
		try {
			rbt = new Robot();
			for (int i = 0; i < 6; i++) {
				rbt.keyPress(KeyEvent.VK_CONTROL);
				rbt.keyPress(KeyEvent.VK_SUBTRACT);
				rbt.keyRelease(KeyEvent.VK_SUBTRACT);
				rbt.keyRelease(KeyEvent.VK_CONTROL);
			}
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void zoomIn(int nilai) {
		try {
			Robot rob = new Robot();
			for (int i = 0; i < nilai; i++) {
				rob.keyPress(KeyEvent.VK_CONTROL);
				rob.keyPress(KeyEvent.VK_ADD);
				rob.keyRelease(KeyEvent.VK_ADD);
				rob.keyRelease(KeyEvent.VK_CONTROL);
			}
		} catch (Exception e) {
			System.out.println("ERROR : zoomIn Method");
		}
	}
	public static void uploadFile(File uploadedFiles) {
		
	}
	public static void setengahScroll(String strX) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,"+strX+")","");
	}
	public static void clearField() {
		try {
			Robot rbtclr = new Robot();
			rbtclr.keyPress(KeyEvent.VK_CONTROL);
			rbtclr.keyPress(KeyEvent.VK_A);
			rbtclr.keyRelease(KeyEvent.VK_CONTROL);
			rbtclr.keyRelease(KeyEvent.VK_A);
			delay(1, "y");
			rbtclr.keyPress(KeyEvent.VK_BACK_SPACE);
			rbtclr.keyRelease(KeyEvent.VK_BACK_SPACE);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void scrollFullMouse(int intScrMs) {
		try {
			Robot rbtclr = new Robot();
			rbtclr.mouseWheel(intScrMs);
		} catch (AWTException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static Integer diskonKeInt(String disk) {
		disk=disk.replace("%", "");
		if (disk.isBlank()) {
			return 0;
		}else {
			return Integer.parseInt(disk);
		}
		
	}
	public static boolean compDisk(String dis1, String dis2, String dis3 ) {
		boolean bStat;
		Integer disk1 = diskonKeInt(dis1);
		Integer disk2 = diskonKeInt(dis2);
		Integer disk3 = diskonKeInt(dis3);
		if (disk1<=disk2&&disk2<=disk3) {
			bStat=true;
		}
		else {
			bStat=false;
		}
		return bStat;
	}
	public static Integer hargaKeInt(String harga) {
		if (harga.contains(".")) {
			harga = harga.substring(3,harga.length()).replaceAll("\\.", "");
		}
		else {
			harga = harga.substring(3,harga.length());
		}
		
		return Integer.parseInt(harga);
	}
	public static boolean compHarga(String har1,String har2, String har3) {
		boolean boStat;
		Integer hasil1,hasil2,hasil3;
		hasil1=hargaKeInt(har1);
		hasil2=hargaKeInt(har2);
		hasil3=hargaKeInt(har3);
		if (hasil1<=hasil2&&hasil2<=hasil3) {
			boStat=true;
		}
		else {
			boStat=false;
		}
		return boStat;
		
	}
	public static void uploadFoto(File foto) {
		try {
			// creating object of Robot class
			Robot rb = new Robot();
			String absFoto = foto.getAbsolutePath();
			
			// copying File path to Clipboard
			StringSelection str = new StringSelection(absFoto);
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
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("Next");
		}
	}
}