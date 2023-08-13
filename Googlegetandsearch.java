package pratice;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Googlegetandsearch {

	public static void main(String[] args) throws Exception {

		WebDriver d =new ChromeDriver();
		d.get("https://www.google.co.in/");
		Thread.sleep(3000);
		d.findElement(By.id("APjFqb")).sendKeys("facebook");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		
	
		
		
	}

}
