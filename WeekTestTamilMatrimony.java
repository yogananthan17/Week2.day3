package week3.day5.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WeekTestTamilMatrimony {

	public static void main(String[] args) {
		ChromeDriver driver =new ChromeDriver();
		driver.get("https://www.tamilmatrimony.in/");
		driver.manage().window().maximize();
		
		
		WebElement name = driver.findElement(By.id("Name"));
		name.sendKeys("Yogananthan");
		
		WebElement ClickGender = driver.findElement(By.className("Gender"));
		ClickGender.sendKeys("male");
		
		

	}

}
