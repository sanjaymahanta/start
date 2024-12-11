



	package co.actionsclass;

	import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeClass;
	import org.testng.annotations.Test;

	public class Slider {
WebDriver driver;
		
		@BeforeClass
		
	  public void initialization() throws InterruptedException {
		  System.setProperty("webdriver.chrome.driver", "D:/chromedriver131.exe");
		  driver = new ChromeDriver();
		  driver.get("https://www.flipkart.com/");
		  driver.manage().window().maximize();
		 
		  
	  }
		
		
		@Test
		public void Sliding() {
		WebElement inputFiled = driver.findElement(By.name("q"));
			Actions action = new Actions(driver);
			action.moveToElement(inputFiled).click().sendKeys("Monitor").sendKeys(Keys.ENTER).perform();
			
			
		WebElement slider =	driver.findElement(By.xpath("(//div[@class='PYKUdo'])[1]"));
		Actions action1 = new Actions(driver);
		System.out.println(slider.getLocation());   //(17, 360)
		action1.clickAndHold(slider).moveByOffset(50, 0).release().perform();
		 System.out.println("New slider position: " + slider.getLocation());
		}

	}

	

