package week3.day5.test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class TestFacebook {
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		
		WebElement firstName = driver.findElement(By.id("First name"));
		firstName.sendKeys("yogananthan");
		
		WebElement surnameinput = driver.findElement(By.className("surname"));
		surnameinput.sendKeys("Reddy");
		
		
		
	}

}
