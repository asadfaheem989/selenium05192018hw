//Questions: How can I use baseclass for calling webdriver driver and baseurl and setting up chrome driver
//because everytime I do an extension i have to redeclare baseurl and webdriver. Also can't find driver.  

package TestNGHwPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import BasePackage.BaseClasses;
//import org.testng.annotations.AfterClass;

public class LoginPageTest extends BaseClasses{
	WebDriver driver; 
	String baseURL = "https://asadfaheem989.github.io/selenium05192018hw/";
	
	@BeforeClass
	  public void beforeClass() {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ace\\eclipse-workspace\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseURL); 
	  }
	
	
@Test
  void LoginPageTest() throws InterruptedException {
		
		WebElement userName = driver.findElement(By.xpath("/html/body/form/center/div/input[1]"));
		userName.sendKeys("asad@gmail.com");
		Thread.sleep(1000);
		System.out.println("entered:  userName");
		
		WebElement password = driver.findElement(By.xpath("/html/body/form/center/div/input[2]"));
		password.sendKeys("password");
		Thread.sleep(1000);
		System.out.println("entered: password");
		
		WebElement rememberCheckBox = driver.findElement(By.xpath("/html/body/form/center/div/label[3]/input"));
		rememberCheckBox.click();
		Thread.sleep(1000);
		System.out.println("clicked checkbox");
		
		WebElement loginClicked = driver.findElement(By.xpath("/html/body/form/center/div/button[1]/a"));
		loginClicked.click();
		Thread.sleep(1000);
		System.out.println("clicked login");
		
		
  }
	

}
