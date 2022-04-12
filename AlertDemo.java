package selenium_java_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/test/delete_customer.php");
		driver.manage().window().maximize();  
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement CustomerId = driver.findElement(By.xpath("//input[@name='cusid']"));
		WebElement SubmitBtn = driver.findElement(By.xpath("//input[@name='submit']"));
		
		CustomerId.sendKeys("123");
		SubmitBtn.click();
		
	// Click cancel on the alert
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
		SubmitBtn.click();
		
	//Click ok to accept the alert
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		
	// To capture the alert message
		System.out.println(driver.switchTo().alert().getText());
		driver.switchTo().alert().accept();
	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("alert('Hello welcome to Uttkarshaa Academy'))");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();		

	}

}
