package hozefa;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Chrome {
	public static void main (String[] args){
	System.setProperty("webdriver.chrome.driver","C:/New folder/chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("http://google.com");
	}
	

}
