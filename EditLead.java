package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class EditLead {

	public static void main(String[] args) {
		
			WebDriverManager.chromedriver().setup();
			ChromeDriver driver = new ChromeDriver();
			driver.manage().window().maximize();
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
			driver.findElement(By.className("x-tab-strip x-tab-strip-top"));
			
			driver.findElement(By.xpath("//input[@name='firstName'][3]")).sendKeys("Iniyan");
			
			WebElement findlead = driver.findElement(By.className("x-btn-text"));
			findlead.click();
			WebElement reslead = driver.findElement(By.className("x-grid3-cell-inner x-grid3-col-firstName"));
		    reslead.click();
			String title = driver.getTitle();
			System.out.println("title:" + title);
			driver.close();
		

	}

}
