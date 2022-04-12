package selenium_java_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cssSelectorDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\Selenium Jar\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/automation-practice-form");
		driver.manage().window().maximize();
		
// cssSelector for id
		WebElement FirstName = driver.findElement(By.cssSelector("input#firstName"));
			
// cssSelector for class Name
		WebElement CurrentAddress = driver.findElement(By.cssSelector("textarea.form-control"));
		
// cssSelector for other attributes
		WebElement LastName = driver.findElement(By.cssSelector("input[placeholder='Last Name']"));
		
//cssSelector for id along with other attributes
		//WebElement Email = driver.findElement(By.cssSelector("input#userEmail[placeholder='name@example.com']"));
		
// cssSelector for class along with other attributes
		//WebElement Male = driver.findElement(By.cssSelector("label.custom-control-label[for='gender-radio-1']"));
		WebElement Male = driver.findElement(By.cssSelector("label.custom-control-label[for='gender-radio-2']"));
		
// cssSelector for parent to child
		//WebElement Mobile = driver.findElement(By.cssSelector("div.col-md-9.col-sm-12>input#userNumber"));
		
// cssSelector for sub string for starting text
		//WebElement Email = driver.findElement(By.cssSelector("input[id^='userE']"));
		WebElement Email = driver.findElement(By.cssSelector("input[placeholder^='name@']"));
		
// cssSelector for sub string for ending text
		WebElement Mobile = driver.findElement(By.cssSelector("input[id$='ber']"));
		
// cssSelector for sub string for any text
		WebElement Dob = driver.findElement(By.cssSelector("input[id*='BirthIn']"));
		
		
		FirstName.sendKeys("Dhananjay");
		LastName.sendKeys("Abdare");
		Email.sendKeys("dhananjayabdare11@gmail.com");
		Male.click();
		Mobile.sendKeys("9637221569");
		CurrentAddress.sendKeys("Kolhapur");
		Dob.click();
	}

}
