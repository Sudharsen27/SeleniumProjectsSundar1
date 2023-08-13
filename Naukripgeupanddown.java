package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Naukripgeupanddown {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d=new ChromeDriver();
		d.get("https://www.naukri.com/nlogin/login?msg=0&URL=https%3A%2F%2Fmy.naukri.com%3A80");
		Thread.sleep(3000);
		d.findElement(By.id("usernameField")).sendKeys("sundarlingam272000@gmail.com");
		d.findElement(By.id("passwordField")).sendKeys("Sudharsen");
		Thread.sleep(3000);
		d.findElement(By.xpath("//button[@class='waves-effect "
				+ "waves-light btn-large btn-block btn-bold blue-btn textTransform']")).click();
		Actions a=new Actions(d) ;
		Thread.sleep(3000);
		a.scrollByAmount(0, 3000);
		Thread.sleep(3000);
		a.scrollByAmount(0,-3000);

	
	}

}
