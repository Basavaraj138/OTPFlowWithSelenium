opackage com.amazon.qa.signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Otpflow {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./browserdriver/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		Actions act=new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[@id='nav-link-accountList']"))).build().perform();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='nav-flyout-ya-newCust']/descendant::a")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("ap_customer_name")).sendKeys("Basavaraj");
		Thread.sleep(2000);
		driver.findElement(By.id("auth-country-picker")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@role='application']//li/a[contains(.,'United States +1')]")).click();
		driver.findElement(By.id("ap_phone_number")).sendKeys("2708106296");
		Thread.sleep(2000);
		driver.findElement(By.id("ap_password")).sendKeys("Deepu$1234");
		Thread.sleep(2000);
		driver.findElement(By.id("continue")).click();
		

	}

}
