package hozefa;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Exrc {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:/New folder/geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http://www.ebay.com/");
       // count the links in a page//
		System.out.println(driver.findElements(By.tagName("a")).size());
		WebElement footer = driver.findElement(By.xpath(".//*[@id='glbfooter']"));
		System.out.println(footer.findElements(By.tagName("a")).size());
		WebElement col = driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("The number of links in the footer");
		System.out.println(col.findElements(By.tagName("a")).size());
		String BeforeClicking;
		String AfterClicking;
		for(int i=0; i<col.findElements(By.tagName("a")).size(); i++){
			//System.out.println(col.findElements(By.tagName("a")).get(i).getText());//
			if(col.findElements(By.tagName("a")).get(i).getText().contains("Site map")){
				//col.findElements(By.tagName("a")).get(i).click();//
				//break;//
				
				BeforeClicking = driver.getTitle();
				col.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		//System.out.println(driver.getTitle());//
		
		AfterClicking = driver.getTitle();
		if(BeforeClicking != AfterClicking){
			
			boolean abc = driver.findElement(By.xpath(".//*[@id='buy']/h2")).isDisplayed();
			if (abc==true)
			System.out.println("Pass");
			
		}else {
			System.out.println("Fail");
		}
		
		
	}

}
