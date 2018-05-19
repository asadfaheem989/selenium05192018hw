package TestNGHwPractice;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

//import BasePackage.BaseClasses;
//import org.testng.annotations.AfterClass;

public class LoginWorkingTest {
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
	
	
@Test(priority = 0)
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

@Test(priority = 1)
public void contactForm() throws InterruptedException {
		WebElement fullName = driver.findElement(By.xpath("//*[@id=\"ContactName\"]"));
		fullName.sendKeys("Asad Faheem");
		Thread.sleep(1000);
		System.out.println("entered: Full name");
		
		WebElement emailField = driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput1\"]"));
		emailField.sendKeys("asadfaheem989@gmail.com");
		Thread.sleep(1000);
		System.out.println("entered email address");
		
		WebElement phoneField = driver.findElement(By.xpath("/html/body/form/div[2]/div[1]/input[3]"));
		phoneField.sendKeys("469-556-3233");
		Thread.sleep(1000);
		System.out.println("entered phone number");
		
		WebElement selectDropdown = driver.findElement(By.xpath("//*[@id=\"exampleFormControlSelect1\"]"));
		Select selection = new Select(selectDropdown); 
		System.out.println("choose the option by using index method");
		selection.selectByIndex(2);
		System.out.println("option3 selected");
		
		WebElement detailsTyped = driver.findElement(By.xpath("//*[@id=\"exampleFormControlTextarea1\"]")); 
		detailsTyped.sendKeys("This message is for practice homework for Selenium");
		Thread.sleep(2000);
		System.out.println("Message sent to details");
		
		WebElement submitButton = driver.findElement(By.xpath("/html/body/form/div[2]/button/a")); 
		submitButton.click();
		System.out.println("Submit button clicked");
}
	
	@AfterClass
	void tearDown() throws Exception {
		Thread.sleep(3000);
		driver.quit();
	}
	

}
