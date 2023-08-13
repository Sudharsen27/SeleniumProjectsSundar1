package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Shopperstack {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new ChromeDriver();
		d.get("https://www.shoppersstack.com/user-signin");
		
		Thread.sleep(25000);
		d.findElement(By.id("Email")).sendKeys("sundarlingam272000@gmail.com");
		d.findElement(By.id("Password")).sendKeys("@27");
		d.findElement(By.className("MuiButton-label")).click();
		d.manage().window().maximize();
		Thread.sleep(6000);
		d.quit();
		
				
		

	}

}
