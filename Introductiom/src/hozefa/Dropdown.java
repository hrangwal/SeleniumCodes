package hozefa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {
	
	public static void main(String[] args){
		System.setProperty("webdriver.gecko.driver","C:/New folder/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://spicejet.com");
		Select s = new Select(driver.findElement(By.id("ControlGroupSearchView_AvailabilitySearchInputSearchView_DropDownListPassengerType_ADT")));
		s.selectByValue("2");
		s.selectByIndex(6);
		s.selectByVisibleText("5");
		driver.findElement(By.cssSelector("#ControlGroupSearchView_AvailabilitySearchInputSearchVieworiginStation1_CTXT")).click();
		driver.findElement(By.xpath("//input[@value = 'Goa (GOI)']")).click();
		driver.findElement(By.xpath("//input[@value = 'Delhi (DEL)']")).click();
		
		
		
		
		
	}

}
