package hozefa;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","C:/New folder/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);//
		driver.get("https://alaskatrips.poweredbygps.com/g/pt/hotels?MDPCID=ALASKA-US.TPS.BRAND.hotels.HOTEL");
		driver.findElement(By.id("H-destination")).sendKeys("nyc");
		driver.findElement(By.id("H-destination")).sendKeys(Keys.TAB);
		driver.findElement(By.id("H-fromDate")).sendKeys(Keys.ENTER);
		//driver.findElement(By.xpath("//a[contains(@href,'New-York-Hotels-The-Gallivant-Times-Square')]")).click();//
		
		WebDriverWait d= new WebDriverWait(driver,20);
		d.until(ExpectedConditions.elementToBeClickable(By.xpath(".//*[@id='5086']/div[2]/div[1]/a")));
		driver.findElement(By.xpath(".//*[@id='5086']/div[2]/div[1]/a")).click();
		
		
		
		
	}

}