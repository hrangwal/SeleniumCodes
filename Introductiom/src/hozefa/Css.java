package hozefa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Css {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver","C:/New folder/geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        
        driver.get("https://login.salesforce.com/");
        driver.findElement(By.cssSelector("input[id ='username']")).sendKeys("hozefa");
        driver.findElement(By.cssSelector("[class= 'button r4 wide primary']")).sendKeys("fjfajjf");
        driver.findElement(By.xpath("//input[@id = 'Login']")).click();
        driver.findElement(By.cssSelector("#Login"));
        
        
		
		// xpath = // tagname[@attribute = 'value']
        //#id
        //.classname=
        
        //*1. Verify in firebug before u run the script
        //* 2.css customized syntax
        //*3. can identify using shortcuts like #idname or.class name
        //.* 4 always find unique attribute
        
		
		//css= tagname[attribute = 'value']
		
		
		/*div[class = 'mt8 mb16'];
		
		//div[@class = 'mt8 mb16']*/

	}

}
