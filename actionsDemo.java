package selenium_java_project;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","E:\\F\\Utkarsha Academy\\5 Selenium\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demoqa.com/buttons");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();  
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();

		WebElement DoubleClickBtn = driver.findElement(By.xpath("//button[@id='doubleClickBtn']"));
		WebElement RightClickBtn = driver.findElement(By.xpath("//button[@id='rightClickBtn']"));
		WebElement DynamicClickBtn = driver.findElement(By.xpath("//button[text()='Click Me']"));
		
		Actions action = new Actions(driver);
		
// Mouse Actions Methods-----doubleClick(), contextClick(), click(), dragAndDrop(), moveToElement()	
// Perfom an single action then use -----perform()	  Multiple action------build().perform()	
		
		action.doubleClick(DoubleClickBtn).perform();
		Thread.sleep(1000);
		action.contextClick(RightClickBtn).perform();    //For Right click use contextClick() method
		Thread.sleep(1000);
		action.click(DynamicClickBtn).perform();
		Thread.sleep(1000);
		
		driver.get("https://demoqa.com/droppable");
		driver.findElement(By.xpath("//a[@id='close-fixedban']")).click();
		
		WebElement DragMe = driver.findElement(By.xpath("//div[@id='draggable']"));
		WebElement Dropable = driver.findElement(By.xpath("//div[@id='draggable']//following-sibling::div[@id='droppable']"));
		
		action.dragAndDrop(DragMe, Dropable).perform();
		Thread.sleep(1000);
		
		WebElement BookStore = driver.findElement(By.xpath("//div[text()='Book Store Application']"));
		action.moveToElement(BookStore).perform();
		
	}

}
