package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnamePraticeFacebook {

	public static void main(String[] args) {

		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/login.php");
		WebElement findElement = d.findElement(By.xpath("//div[@class='_9axz']"));
		System.out.println(findElement.getText());
		System.out.println(findElement.getTagName());
		System.out.println(findElement.getClass());
		
		
		
	}
}



