package pratice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Framehandlingmutiple {

	public static void main(String[] args) throws Exception {

		WebDriver d =new FirefoxDriver();
		d.get("https://ui.vision/demo/webtest/frames/");
		d.manage().window().maximize();
		WebElement findElement = d.findElement(By.xpath("//frame[@src='frame_1.html']"));
		d.switchTo().frame(findElement);
		d.findElement(By.xpath("//input[@size='25']")).sendKeys("sundar");
		//used to get out from the frame//
		d.switchTo().defaultContent();
		WebElement findElement2 = d.findElement(By.xpath("//frame[@src='frame_2.html']"));
		d.switchTo().frame(findElement2);
		d.findElement(By.name("mytext2")).sendKeys("sundar");
		d.switchTo().defaultContent();
		WebElement findElement3 = d.findElement(By.xpath("//frame[@src='frame_3.html']"));
		d.switchTo().frame(findElement3);
		d.findElement(By.name("mytext3")).sendKeys("sunil");
		WebElement findElement4 = d.findElement(By.xpath("//iframe[@src='https://docs.google.com/forms/d/1yfUq-"
				+ "GO9BEssafd6TvHhf0D6QLDVG3q5InwNE2FFFFQ/viewform?embedded=true']"));
		d.switchTo().frame(findElement4);
		Actions a=new Actions(d);
		WebElement findElement7 = d.findElement(By.xpath("//div[text()='Form Filling Demo Page']"));
		System.out.println(findElement7.getText());
		d.findElement(By.xpath("//span[text()='Hi, I am the UI.Vision IDE']")).click();
		a.scrollByAmount(0, 420).perform();
		d.findElement(By.xpath("//span[text()='Web Testing']")).click();
		d.findElement(By.xpath("//span[text()='Form Autofilling']")).click();
		d.findElement(By.xpath("//span[text()='General Web Automation']")).click();
		a.scrollByAmount(0,300).perform();
		d.findElement(By.xpath("//span[text()='Clear form']")).click();
		Thread.sleep(2000);
		d.findElement(By.xpath("(//span[text()='Clear form'])[3]")).click();
		d.switchTo().defaultContent();
		WebElement findElement5 = d.findElement(By.xpath("//frame[@src='frame_4.html']"));
		d.switchTo().frame(findElement5);
		d.findElement(By.name("mytext4")).sendKeys("sundar");
		d.switchTo().defaultContent();
		WebElement findElement6 = d.findElement(By.xpath("//frame[@src='frame_5.html']"));
		d.switchTo().frame(findElement6);
		d.findElement(By.name("mytext5")).sendKeys("sunil");
		d.quit();
		








	}

}
