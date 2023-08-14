package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Instagramscrollupanddown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d=new ChromeDriver();
		d.get("https://www.instagram.com/?hl=en&__coig_restricted=1");
		Thread.sleep(3000);
		d.findElement(By.name("username")).sendKeys("Sundarlingam272000@gmail.com");
		d.findElement(By.name("password")).sendKeys("Sundar27");
		d.findElement(By.xpath("//button[@class='_acan _acap _acas _aj1-']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//div[text()='Not Now']")).click();
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[text()='Not Now']")).click();
		Thread.sleep(3000);
		d.manage().window().maximize();
		Thread.sleep(3000);
		Actions a=new Actions(d);
		Thread.sleep(3000);
		a.scrollByAmount(0, 6000).perform();
		Thread.sleep(2000);
		a.scrollByAmount(0,-2000).perform();
		d.close();
	}
	
	

}
