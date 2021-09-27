package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main ");
		
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
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys("13373");
		driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[@class=\"x-grid3-cell-inner x-grid3-col-partyId\"]/a")).click();
		driver.findElement(By.linkText("Delete")).click();
		String title = driver.getTitle();
		System.out.println("Title:"+title);
		driver.close();
		
	}
		
	
	}


