package hozefa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Basic {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/New folder/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.get("http://kshitijrangari.com");//**
		//driver.findElement(By.xpath("html/body/section[3]/div/div/div[2]/a")).click();//**
		
		driver.get("http://facebook.com");
		driver.findElement(By.id("email")).sendKeys("rangwalahozefa@yahoo.co.in");
		driver.findElement(By.name("pass")).sendKeys("hrangwal@nyit.edu");
		driver.findElement(By.xpath("//*[@id='u_0_q']")).click();
		//driver.findElement(By.className(className));//
		driver.findElement(By.linkText("Forgot account?")).click();
		//driver.findElement(By.partialLinkText("Forgot your")).click();//

	}

}
