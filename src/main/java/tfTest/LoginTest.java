package tfTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		launchBrowser();
		loginTest1();
		teardown();
		
		launchBrowser();
		loginTest1();
		teardown();
		
		launchBrowser();
		loginTest1();
		teardown();
		
		
	
		}
	
	public static void launchBrowser() {
		// Set system property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe ");
		//created an object for webdriver
		 driver = new ChromeDriver();
		//go to website
		driver.get("https://techfios.com/billing/?ng=admin/");
		//max the window
		driver.manage().window().maximize();
		
	}
	public static void loginTest1() throws InterruptedException {
	
		
		//identify username  box and pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identify Sign in Button and click
		driver.findElement(By.name("login")).click();  
		//wait for 2 seconds
		Thread.sleep(2000);
		
	
	}
	
	public static void loginTest2() throws InterruptedException {
	
		
		//identify username  box and pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identify Sign in Button and click
		driver.findElement(By.name("login")).click();  
		//wait for 2 seconds
		Thread.sleep(2000);
		
	
	}
	
	public static void loginTest3() throws InterruptedException {
	
		
		//identify username  box and pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		//identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		//identify Sign in Button and click
		driver.findElement(By.name("login")).click();  
		//wait for 2 seconds
		Thread.sleep(2000);
		
	
	}
	

	 public static void teardown() {
		//close browser
		driver.close();
		
	}
	


}
