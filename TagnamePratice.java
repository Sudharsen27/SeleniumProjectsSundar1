package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TagnamePratice {

	public static void main(String[] args) {

		WebDriver d=new ChromeDriver();
		d.get("https://www.guru99.com/selenium-tutorial.html");
		// Used to store the web element 
		WebElement findElement = d.findElement(By.tagName("h1"));
		// Used to print the web element to the console [getText()]
		System.out.println(findElement.getText());
		System.out.println(findElement.getTagName());
	}

}
