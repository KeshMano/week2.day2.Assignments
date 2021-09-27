package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login ");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("demosalesmanager");

		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("crmsfa");
		WebElement login = driver.findElement(By.className("decorativeSubmit"));
		login.click();
		WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
		crmsfa.click();
		driver.findElement(By.linkText("Leads")).click();
		WebElement finds = driver.findElement(By.linkText("Find Leads"));
		finds.click();

		driver.findElement(By.xpath("//span[text()='Email']")).click();
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("keshmano@gmail.com");
		WebElement firstLead = driver.findElement(By.xpath("//button[text()='Find Leads']"));
		firstLead.click();
		System.out.println("First resulting Lead");
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//a[@class='linktext'])[4]")).click();
		Thread.sleep(3000);
		WebElement title = driver.findElement(By.linkText("Duplicate Lead"));
		title.click();
		String title1 = driver.getTitle();
		System.out.println("Title:" + title1);
		driver.findElement(By.xpath("//input[@value='Create Lead']")).click();
		driver.close();

	}

}
