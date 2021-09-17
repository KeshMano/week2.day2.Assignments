package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DuplicateLead {

	public static void main(String[] args) {
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
		driver.findElement(By.className("x-tab-strip-text"));
		driver.findElement(By.xpath("//input[@name='emailAddress']")).sendKeys("kesh@gmail.com");
		WebElement findlead = driver.findElement(By.className("x-btn-text"));
		findlead.click();
		/*
		 * 1 Launch the browser 2 Enter the username 3 Enter the password 4 Click Login
		 * 5 Click crm/sfa link 6 Click Leads link 7 Click Find leads 8 Click on Email 9
		 * Enter Email 10 Click find leads button 11 Capture name of First Resulting
		 * lead 12 Click First Resulting lead 13 Click Duplicate Lead 14 Verify the
		 * title as 'Duplicate Lead' 15 Click Create Lead 16 Confirm the duplicated lead
		 * name is same as captured name 17 Close the browser (Do not log out)
		 */

	}

}
