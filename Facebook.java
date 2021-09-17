package week2.day2.assignments;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Facebook {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(15,TimeUnit.SECONDS);
		driver.get(" https://en-gb.facebook.com/");
		String title = driver.getTitle();
		System.out.println("title:" + title);
		WebElement CreateNewAccount = driver.findElement(By.linkText("Create New Account"));
		CreateNewAccount.click();
		driver.findElement(By.xpath("//input[@name=\'firstname\']")).sendKeys("kesh");
		driver.findElement(By.xpath("//input[@name=\'lastname\']")).sendKeys("mano");
		driver.findElement(By.xpath("//input[@name=\'reg_email__']")).sendKeys("k4567@gmail.com");
		driver.findElement(By.xpath("//input[@name=\'reg_email_confirmation__']")).sendKeys("k4567@gmail.com");
		WebElement passWord = driver.findElement(By.id("password_step_input")); passWord.sendKeys("k4567");
		//driver.findElement(By.xpath("//div[@class='mtm mbs _2_68']"));
		WebElement dropDown1 = driver.findElement(By.id("day"));
		Select drop1=new Select(dropDown1);
		drop1.selectByIndex(20);
		WebElement dropDown2=driver.findElement(By.id("month"));
		Select drop2=new Select(dropDown2);
		drop2.selectByValue("7");
		WebElement dropDown3=driver.findElement(By.id("year"));
		Select drop3=new Select(dropDown3);
		drop3.selectByVisibleText("2018");
		WebElement gender = driver.findElement(By.xpath("//label[@class='_58mt']"));
		gender.click();
		driver.close();
		
	}

}
