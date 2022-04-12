package selenium_java_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class DropDownDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "E:\\F\\Utkarsha Academy\\5 Selenium\\Selenium Jar\\chromedriver.exe");
		ChromeOptions option = new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver = new ChromeDriver(option);
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
	
		WebElement FirstName = driver.findElement(By.xpath("//input[@id='firstName']"));
		FirstName.sendKeys("Dhananjay");
		WebElement LastName = driver.findElement(By.xpath("//input[@id='lastName']"));
		LastName.sendKeys("Abdare");
		WebElement Userid = driver.findElement(By.xpath("//input[@id='userEmail']"));
		Userid.sendKeys("dhananjayabdare11@gmail.com");
		WebElement Male = driver.findElement(By.xpath("//label[text()='Male']"));
		Male.click();
		WebElement Mobile = driver.findElement(By.xpath("//input[@id='userNumber']"));
		Mobile.sendKeys("9637221569");
		driver.findElement(By.xpath("//input[@id='dateOfBirthInput']")).click();
		
// Static Drop down - When select tag is used for drop down then we consider that drop down as static.
		WebElement Month = driver.findElement(By.xpath("//select[contains(@class,'month-select')]"));
		Select month = new Select(Month);
		month.selectByIndex(3);		
		WebElement Year = driver.findElement(By.xpath("//select[contains(@class,'year-select')]"));
		Select year = new Select(Year);
		year.selectByValue("2017");		
		
// Dynamic Drop down - When div tag is used for drop down then we consider that drop down as dynamic.		
		driver.findElement(By.xpath("//div[@aria-label='Choose Wednesday, April 26th, 2017']")).click();
		
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		WebElement Subject = driver.findElement(By.xpath("//input[@id='subjectsInput']"));
		Subject.click();
		Subject.sendKeys("C");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//div[text()='Computer Science']")).click();
		
		driver.findElement(By.xpath("//label[text()='Reading']")).click();
		WebElement Picture = driver.findElement(By.xpath("//input[@id='uploadPicture']"));
		Picture.sendKeys("E:\\D\\My Docs\\SIGN.jpg");
		WebElement CurrentAdd = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		CurrentAdd.sendKeys("Kolhapur-416001");
		
		Actions action = new Actions(driver);
		action.sendKeys(Keys.TAB).perform();
				
    	driver.findElement(By.xpath("//div[@class=' css-1hwfws3']//div[text()='Select State']")).click();
		driver.findElement(By.xpath("//div[text()='Uttar Pradesh']")).click();
	    driver.findElement(By.xpath("//div[@class=' css-1hwfws3']//div[text()='Select City']")).click();
		driver.findElement(By.xpath("//div[text()='Merrut']")).click();
		
		
		driver.get("https://demoqa.com/select-menu");

		driver.findElement(By.xpath(" //div[@id='withOptGroup']//div[@class=' css-yk16xz-control']")).click();
		driver.findElement(By.xpath("//div[text()='Group 2, option 1']")).click();	
		driver.findElement(By.xpath(" //div[@id='selectOne']//div[@class=' css-1hwfws3']")).click();
		driver.findElement(By.xpath(" //div[text()='Mr.']")).click();

		WebElement Menu = driver.findElement(By.xpath("  //select[@id='oldSelectMenu']"));
		Select menu = new Select(Menu);
		menu.selectByValue("2");
		
//check for multiselect dropdown
		
		
		
	
	}

}
