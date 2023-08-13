package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollupanddownpratice {

	public static void main(String[] args) throws InterruptedException {
 
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		d.findElement(By.name("email")).sendKeys("6382519651");
		d.findElement(By.id("pass")).sendKeys("Sundarfreaker");
		d.findElement(By.name("login")).click();
		Thread.sleep(3000);
		Actions a=new Actions(d);
		Thread.sleep(3000);
		a.scrollByAmount(0, 3000);
		Thread.sleep(3000);
		a.scrollByAmount(0, -2000);
		
	}

}
