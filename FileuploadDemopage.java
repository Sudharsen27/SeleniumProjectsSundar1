 package pratice;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class FileuploadDemopage {

	public static void main(String[] args) throws Exception {

		WebDriver d =new FirefoxDriver();
		d.get("https://only-testing-blog.blogspot.com/2014/02/attributes.html");
		d.manage().window().maximize();
		Actions a=new Actions(d);
		d.findElement(By.id("text1")).sendKeys("sundar");
		d.findElement(By.id("text4")).sendKeys("lingam");
		WebElement findElement = d.findElement(By.id("check1"));
		findElement.click();
		WebElement findElement2 = d.findElement(By.id("check2"));
		findElement2.click();
		WebElement findElement3 = d.findElement(By.id("check3"));
		findElement3.click();
		WebElement findElement4 = d.findElement(By.id("radio1"));
		findElement4.click();
		Thread.sleep(1000);
	    WebElement findElement5 = d.findElement(By.xpath("//input[@type='file']"));
	    a.moveToElement(findElement5).click().perform();
		StringSelection sc=new StringSelection("C:\\Users\\Sundar\\Desktop\\pancard.jpg");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(sc, null);
		Robot r=new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CONTROL);
		r.keyPress(KeyEvent.VK_V);
		r.keyRelease(KeyEvent.VK_CONTROL);
		r.keyRelease(KeyEvent.VK_V);
		Thread.sleep(3500);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

		
		
		
		
	}

}
