package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrollupanddown {

	public static void main(String[] args) throws InterruptedException {

      WebDriver d=new ChromeDriver();
      d.get("https://www.youtube.com/");
      d.findElement(By.name("search_query")).sendKeys("tamilsongs");
      d.findElement(By.id("search-icon-legacy")).click();
      
      Actions a=new Actions(d);
      Thread.sleep(3000);
      a.scrollByAmount(0, 3000).perform();
      Thread.sleep(3000);
      a.scrollByAmount(0,-3000).perform();
		
	}
		
	}

