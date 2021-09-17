package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DeleteLead {

	public static void main(String[] args) {
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
		driver.findElement(By.className("x-panel-header x-panel-header-noborder x-unselectable"));
		WebElement phone= driver.findElement(By.className("x-tab-strip-text"));
		phone.click();
		
		driver.findElement(By.className("x-form-text x-form-field")).sendKeys("9823456790");
		WebElement finds1=driver.findElement(By.className("x-btn-text"));
		finds1.click();
		driver.findElement(By.className("x-grid3-hd-inner x-grid3-hd-partyId")).sendKeys("007");
		//WebElement delete=driver.findElement(By.className("x-btn-text"));
		//delete.click();
		driver.close();
		
	}
		
		
		
		

	}


