package co.actionsclass;



	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.testng.Assert;
	import org.testng.annotations.Test;
	

public class Demo1{

	    @Test
	    public void testGoogle() {
	        // Use WebDriverManager to automatically set up the correct ChromeDriver
	        System.setProperty("webdriver.chrome.driver", "D:/chromeDriver131.exe");

	        // Create an instance of ChromeDriver (Selenium 4)
	        WebDriver driver = new ChromeDriver();

	        // Open Google's homepage
	        driver.get("https://www.google.com");

	        // Assert that the title contains "Google"
	        Assert.assertTrue(driver.getTitle().contains("Google"));

	        // Close the browser
	       
	    }
	}

	

