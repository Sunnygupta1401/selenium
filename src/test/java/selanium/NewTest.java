package selanium;

import org.testng.annotations.Test;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import static org.junit.Assert.assertTrue;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.AssertJUnit;

public class NewTest {
	
	WebDriver driver;
  @Test
  public void loadSite() {
	  
	  
	  try {
			// TODO Auto-generated method stub
			driver.get("http://localhost:8090/webapp/");

		// driver.findElement(By.className("NKcBbdsdsdd")).click();
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	  
  }
  
  @Test
  public void validateTitle() {
	  
	  
	  try {

		// driver.findElement(By.className("NKcBbdsdsdd")).click();
			String title= driver.getTitle();
			Assert.assertEquals("test", title);
		  
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			Assert.fail();
		}
	  
  }
  
  @Test public void testSomeLibraryMethod() {
  	System.out.println("test");
      Library classUnderTest = new Library();
      //Assert.assertTrue(classUnderTest.someLibraryMethod());
      
      AssertJUnit.assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
  }
  
  @BeforeMethod
  public void beforeMethod() {
  }

  @AfterMethod
  public void afterMethod() {
  }

  
  @BeforeTest
  public void beforeTest()
  {
	  System.setProperty("webdriver.chrome.driver", "/Users/Shared/Jenkins/Home/tools/chromedriver");
		 
	  ChromeOptions chromeOptions = new ChromeOptions();
	   chromeOptions.addArguments("--headless");
	  driver = new ChromeDriver(chromeOptions);
		 
		 
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
  }
  
  @AfterTest
  public void afterTest()
  {
	  
	  driver.close();	  
  }
  }

