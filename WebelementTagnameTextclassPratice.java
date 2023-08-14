package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebelementTagnameTextclassPratice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d=new ChromeDriver();
		d.get("https://parabank.parasoft.com/parabank/index.htm");
		Thread.sleep(3000);
		WebElement findElement = d.findElement(By.xpath("//p[text()='Experience "
				+ "the difference']"));
		System.out.println(findElement.getText());
		System.out.println(findElement.getTagName());
		System.out.println(findElement.getLocation());
		System.out.println(findElement.getClass());
		
		
	}
	

}
