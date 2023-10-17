package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Productbuydemopratice {

	public static void main(String[] args) throws InterruptedException {

		WebDriver d= new FirefoxDriver();
		d.get("https://www.saucedemo.com/");
		d.manage().window().maximize();
		d.findElement(By.id("user-name")).sendKeys("standard_user");
		d.findElement(By.id("password")).sendKeys("secret_sauce");
		d.findElement(By.id("login-button")).click();
		Actions a =new Actions(d);
		a.scrollByAmount(0,200).perform();
		WebElement findElement = d.findElement(By.xpath("//div[text()='Sauce Labs Onesie']"));
		findElement.click();
		WebElement findElement2 = d.findElement(By.id("add-to-cart-sauce-labs-onesie"));
		findElement2.click();
		WebElement findElement3 = d.findElement(By.xpath("//a[@class='shopping_cart_link']"));
		findElement3.click();
		WebElement findElement4 = d.findElement(By.id("checkout"));
		findElement4.click();
		d.findElement(By.id("first-name")).sendKeys("parvathy");
		d.findElement(By.id("last-name")).sendKeys("nair");
		d.findElement(By.id("postal-code")).sendKeys("12345");
		WebElement findElement5 = d.findElement(By.id("continue"));
		findElement5.click();
		WebElement findElement6 = d.findElement(By.id("finish"));
		findElement6.click();
		WebElement findElement7 = d.findElement(By.xpath("//button[text()='Open Menu']"));
		findElement7.click();
		Thread.sleep(1000);
		WebElement findElement8 = d.findElement(By.id("logout_sidebar_link"));
		findElement8.click();
		d.quit();
	}

}
