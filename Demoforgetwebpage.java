package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demoforgetwebpage {

	public static void main(String[] args) {

		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login.php");
		d.findElement(By.id("email")).sendKeys("6382519651");
		d.findElement(By.id("pass")).sendKeys("Sundarfreaker");
		d.findElement(By.name("login")).click();
		

	}

}
