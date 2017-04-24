package hozefa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import junit.framework.Assert;

public class FormMethods {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/New folder/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		// Is displayed is used only when particular object  is in code base but is it visible or not
		driver.get("https://makemytrip.com/");
		 driver.findElement(By.xpath(".//*[@id='MultiCity']")).isEnabled();//
		 
		System.out.println("Before Clicking the Radio Button");
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='ReturnDate']")).isDisplayed());
	    System.out.println(driver.findElement(By.xpath(".//*[@id='ReturnDate']")).isDisplayed());
	     driver.findElement(By.xpath(".//*[@id='MultiCity']")).click();
		 System.out.println("After Clicking the Radio Button");
		Assert.assertTrue(driver.findElement(By.xpath(".//*[@id='ReturnDate']")).isDisplayed());
		//is displayed can only be used when the button is present in code but not visible//
		//*int count = driver.findElement(By.xpath(".//*[@id='Multy']")).size();//
		//if we want to validate the object which is in webpage or code page//
		
		//if(count==0){
		//	*System.out.println("Verified");*//
		
		//System.out.println(driver.findElement(By.xpath(".//*[@id='hp-banner']/div[1]/div/div[6]/div/section/h4")).getText());
	   // driver.findElement(By.xpath(".//*[@id='hp-widget__depart']")).click();
	    //driver.findElement(By.xpath(".//*[@id='dp1492189881017']/div/div[1]/table/tbody/tr[3]/td[4]")).click();
		}

		
		
	

	}


