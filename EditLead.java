package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) throws InterruptedException {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://leaftaps.com/opentaps/control/main ");
			String title = driver.getTitle();
			System.out.println(title);
			
			WebElement userName = driver.findElement(By.id("username"));
			userName.sendKeys("demosalesmanager");

			WebElement password = driver.findElement(By.id("password"));
			password.sendKeys("crmsfa");
			
			WebElement login = driver.findElement(By.className("decorativeSubmit"));
			login.click();
			WebElement crmsfa = driver.findElement(By.linkText("CRM/SFA"));
			crmsfa.click();
			
			WebElement leads = driver.findElement(By.linkText("Leads"));
			leads.click();
			WebElement finds = driver.findElement(By.linkText("Find Leads"));
			finds.click();
			driver.findElement(By.xpath("//span[text()='Phone']")).click();
			driver.findElement(By.xpath("//input[@name='phoneCountryCode']")).sendKeys("7");
			driver.findElement(By.xpath("//input[@name='phoneAreaCode']")).sendKeys("007");
			driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("9943083290");
			driver.findElement(By.xpath("(//a[@class=\"linktext\"])[4]")).click();
			driver.findElement(By.xpath("(//a[@class=\"subMenuButton\"])[3]")).click();
			driver.findElement(By.id("updateLeadForm_firstNameLocal")).sendKeys("Birla");
			driver.findElement(By.xpath("(//input[@name='submitButton'])[1]")).click();
			driver.close();
		

	}

}
