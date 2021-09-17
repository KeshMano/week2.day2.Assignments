package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SalesForce {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://www.salesforce.com/in/form/signup/freetrial-sales/?d=70130000000Enyk");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		
		String title = driver.getTitle();
		System.out.println("title:" + title);
		driver.findElement(By.xpath("//input[@name='UserFirstName']")).sendKeys("kesh");
		driver.findElement(By.xpath("//input[@name='UserLastName']")).sendKeys("mano");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("k4567@gmail.com");
		driver.findElement(By.xpath("//input[@name='CompanyName\']")).sendKeys("Automation");
		driver.findElement(By.xpath("//input[@name='UserPhone\']")).sendKeys("9087623498");
		
		WebElement dropDown1 = driver.findElement(By.xpath("//select[@name=\'UserTitle\']"));
		Select drop1=new Select(dropDown1);
		drop1.selectByValue("IT_Manager_AP");
		WebElement dropDown2 = driver.findElement(By.xpath("//select[@name=\'CompanyEmployees\']"));
		Select drop2=new Select(dropDown2);
		drop2.selectByValue("250");
		WebElement dropDown3 = driver.findElement(By.xpath("//select[@name=\'CompanyCountry\']"));
		Select drop3=new Select(dropDown3);
		drop3.selectByValue("US");
		WebElement checkBrowser=driver.findElement(By.xpath("//div[@class=\'checkbox-ui\']"));
		checkBrowser.click();
		driver.close();
		
		
			

	}

}
