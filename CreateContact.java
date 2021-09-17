package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateContact {

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
		WebElement contactsButton = driver.findElement(By.linkText("Contacts"));
		contactsButton.click();
		WebElement CreateContact = driver.findElement(By.linkText("Create Contact"));
		CreateContact.click();

		driver.findElement(By.id("firstNameField")).sendKeys("Kesh");
		driver.findElement(By.id("lastNameField")).sendKeys("mano");
		driver.findElement(By.id("createContactForm_firstNameLocal")).sendKeys("Kesh");
		driver.findElement(By.id("createContactForm_lastNameLocal")).sendKeys("mano");
		driver.findElement(By.id("createContactForm_departmentName")).sendKeys("Testing");
		driver.findElement(By.id("createContactForm_description")).sendKeys("About Testing");
		driver.findElement(By.id("createContactForm_primaryEmail")).sendKeys("den@gmail.com");

		WebElement state = driver.findElement(By.id("createContactForm_generalStateProvinceGeoId"));
		Select drop = new Select(state);
		drop.selectByVisibleText("California");

		WebElement CreateContact1 = driver.findElement(By.className("smallSubmit"));
		CreateContact1.click();

		WebElement edit = driver.findElement(By.linkText("Edit"));
		edit.click();

		WebElement describe = driver.findElement(By.id("updateContactForm_description"));
		describe.clear();

		WebElement note=driver.findElement(By.className("inputBox"));
		note.sendKeys("Listening is important");
		
		WebElement update = driver.findElement(By.xpath("//input[@class=\'smallSubmit\']"));
		update.click();

		String title = driver.getTitle();
		System.out.println("title:" + title);
		driver.close();

	}

}
