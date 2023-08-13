package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Twitter {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d= new ChromeDriver();
		d.get("https://twitter.com/i/flow/login");
		Thread.sleep(6000);
		d.findElement(By.name("text")).sendKeys("6382519651");
		d.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox r-37j5jr"
				+ " r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
		Thread.sleep(7000);
		d.findElement(By.name("password")).sendKeys("Sudharsen");
		d.findElement(By.xpath("//div[@class='css-901oao r-1awozwy r-6koalj r-18u37iz r-16y2uox"
				+ " r-37j5jr r-a023e6 r-b88u0q r-1777fci r-rjixqe r-bcqeeo r-q4m81j r-qvutc0']")).click();
	}
		 
		
		
	
	

}
