package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FrameHandling {

	public static void main(String[] args) throws Exception {
		
		WebDriver d=new FirefoxDriver();
		d.get("https://demo.automationtesting.in/Frames.html");
		d.manage().window().maximize();
		WebElement findElement = d.findElement(By.id("singleframe"));
		d.switchTo().frame(findElement);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("sundarlingam");
		d.switchTo().defaultContent();
		d.findElement(By.xpath("//a[@href='#Multiple']")).click();
		WebElement findElement2 = d.findElement(By.xpath("//iframe[@src='MultipleFrames.html']"));
		d.switchTo().frame(findElement2);
		WebElement findElement3 = d.findElement(By.xpath("//iframe[@style='float: left;height: 250px;width: 400px']"));
		d.switchTo().frame(findElement3);
		d.findElement(By.xpath("//input[@type='text']")).sendKeys("sundarlingam");
		Thread.sleep(2000);
		d.switchTo().parentFrame();
		WebElement findElement4 = d.findElement(By.xpath("//h5[text()='Nested iFrames']"));
		System.out.println(findElement4.getText());
		d.switchTo().defaultContent();
		WebElement findElement5 = d.findElement(By.xpath("//h1[text()='Automation Demo Site ']"));
		System.out.println(findElement5.getText());
		
		
		
		
		
	}

}
