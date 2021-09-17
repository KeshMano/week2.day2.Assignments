package week2.day2.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.get(" https://acme-test.uipath.com/login");
		driver.findElement(By.id("email")).sendKeys("kumar.testleaf@gmail.com");
		WebElement password=driver.findElement(By.id("password"));
		password.sendKeys("leaf@12");
		WebElement login=driver.findElement(By.xpath("//button[@type=\'submit\']"));
		login.click();
		
		String title = driver.getTitle();
		System.out.println("title:" + title);
		
		WebElement logout=driver.findElement(By.linkText("Log Out"));
		logout.click();
		
		driver.close();
		
		

	}

}
