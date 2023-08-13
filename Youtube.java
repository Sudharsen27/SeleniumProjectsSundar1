package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Youtube {

	public static void main(String[] args) throws InterruptedException {
    
		WebDriver d= new ChromeDriver();
		d.get("https://www.youtube.com/");
		d.findElement(By.name("search_query")).sendKeys("tamil songs");
		d.findElement(By.id("search-icon-legacy")).click();
		
		}

}
