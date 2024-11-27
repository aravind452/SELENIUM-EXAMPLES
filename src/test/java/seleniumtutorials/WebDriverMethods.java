package seleniumtutorials;

import org.openqa.selenium.chrome.ChromeDriver;


import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
public class WebDriverMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		/*GET METHODS*/
	//driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	//  String pageTitleString = driver.getTitle();
	//	Thread.sleep(5000);
	//	System.out.println(pageTitleString);
	//	System.out.println(driver.getCurrentUrl());
	//  System.out.println(driver.getPageSource()); 
	//	System.out.println(driver.getWindowHandle());
	//	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	//  Set<String> ids =driver.getWindowHandles();
	//  System.out.println(ids);
		
		
    //driver.get("https://demo.nopcommerce.com/register");
	// WebElement logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']"));
    // System.out.println(logo.isDisplayed());
	// boolean status = driver.findElement(By.xpath("//input[@id='FirstName']")).isEnabled();
	// System.out.println(status);
    
    
//    WebElement male = driver.findElement(By.xpath("//input[@id='gender-male']"));
//    WebElement female = driver.findElement(By.xpath("//input[@id='gender-female']"));
//    
//    
//    System.out.println(male.isSelected());
//    System.out.println(female.isSelected());
//    male.click();
//    System.out.println(male.isSelected());
		
		
		
		// Browser Methods
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	Thread.sleep(5000);
	driver.findElement(By.linkText("OrangeHRM, Inc")).click();
	Thread.sleep(5000);
	//driver.close();
	driver.quit();
	}

}




/*
 * Get methods
 * conditional methods
 * browser methods
 * navigational methods
 * wait methods
 * 
 * */

/*
 * GET METHODS - we can access these methods through webdriver instance
 * get(Url)
 * getTitle()
 * getPageSource()
 * getWindowHandle() - returns the ID of the browser window
 * getWindowHandles() - returns the ID of the multiple browser window
 * /


/*CONDITIONAL METHODS - ACCESS THESE COMMANDS THROUGH WEB ELEMENT
 * RETURNS BOOLEAN VALUE
 * isDisplayed()
 * isEnabled()
 * isSelected()
 * */


/* BROWSER METHODS
 * CLOSE() - close single browser
 * QUIT() - close multiple windows
 * */
 