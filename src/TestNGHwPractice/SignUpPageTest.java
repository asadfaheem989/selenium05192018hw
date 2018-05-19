package TestNGHwPractice;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class SignUpPageTest {
	WebDriver driver; 
	String baseURL = "https://asadfaheem989.github.io/selenium05192018hw/rss/SignupPage.html"; 
	
	@BeforeClass
	public void beforeClass() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Ace\\eclipse-workspace\\Selenium\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get(baseURL);
	}

	@Test
	public void signUpPage() throws InterruptedException {
		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"FirstName\"]"));
		firstName.sendKeys("Asad");
		Thread.sleep(1000);
		System.out.println("entered: First name");
		
		WebElement lastName = driver.findElement(By.xpath("//*[@id=\"LastName\"]"));
		lastName.sendKeys("Faheem");
		Thread.sleep(1000);
		System.out.println("entered: last name");
		
		WebElement emailAddress = driver.findElement(By.xpath("//*[@id=\"exampleFormControlInput1\"]"));
		emailAddress.sendKeys("asadfaheem989@gmail.com");
		Thread.sleep(1000);
		System.out.println("entered: emailaddress");
		
		WebElement enterPassword = driver.findElement(By.xpath("//*[@id=\"password\"]"));
		enterPassword.sendKeys("abcdefgh");
		Thread.sleep(1000);
		System.out.println("entered: password");
		
		WebElement phoneNumber = driver.findElement(By.xpath("/html/body/form/div[2]/div/input[5]"));
		phoneNumber.sendKeys("entered number");
		Thread.sleep(1000);
		System.out.println("entered: number");
		
		WebElement chooseGender = driver.findElement(By.xpath("/html/body/form/div[2]/input[1]")); 
		chooseGender.click();
		System.out.println("gender clicked");
		
		WebElement submitClicked = driver.findElement(By.xpath("/html/body/form/div[2]/button/a"));
		submitClicked.click();
		Thread.sleep(1000);
		System.out.println("clicked submit");
		
	}

}
