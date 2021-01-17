package tfTest;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginTestJUnit {
	WebDriver driver;

	@Before
	public void launchBrowser() {
		// Set system property
		System.setProperty("webdriver.chrome.driver", "driver\\chromedriver.exe ");
		// created an object for webdriver
		driver = new ChromeDriver();
		// go to website
		driver.get("https://techfios.com/billing/?ng=admin/");
		// max the window
		driver.manage().window().maximize();
		// applied implicity waits
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

	}

	@Test
	public void loginTest1() throws InterruptedException {

		// identify username box and pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Sign in Button and click
		
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name("login")))); 
		driver.findElement(By.name("login")).click();
		// wait for 2 seconds
		Thread.sleep(2000);

	}

	//@Test
	public void loginTest2() throws InterruptedException {

		// identify username box and pass username
		driver.findElement(By.id("username1")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Sign in Button and click
		driver.findElement(By.name("login")).click();
		// wait for 2 seconds
		Thread.sleep(2000);
		
		
		

	}

	// @Test
	public void loginTest3() throws InterruptedException {

		// identify username box and pass username
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		// identify password box and type password
		driver.findElement(By.id("password")).sendKeys("abc123");
		// identify Sign in Button and click
		driver.findElement(By.name("login")).click();
		// wait for 2 seconds
		Thread.sleep(2000);

	}

	@After
	public void teardown() {
		// close browser
		driver.close();

	}

}
