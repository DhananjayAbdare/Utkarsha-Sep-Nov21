package selenium_java_project;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demoqa1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/checkbox");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();  
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		driver.findElement(By.xpath("//*[text()='Home']")).click();
		
		WebElement Logo = driver.findElement(By.xpath("//img[contains(@src,'Toolsqa')]"));
		System.out.println(Logo.isDisplayed());						// Method isDisplayed() is call------to print true/false
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		File srcFile = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\Swara\\eclipse-workspace\\selenium_java_project\\src\\selenium_java_project\\"+timestamp()+".jpeg"));
	}
	
	public static String timestamp() {
		
		return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());     // yyyy-MM-dd & HH-mm-ss ---format is imp.no change
		
	}

}
