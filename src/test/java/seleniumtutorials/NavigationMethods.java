package seleniumtutorials;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.navigate().to("https://demo.nopcommerce.com/");
		driver.navigate().to("https://www.google.com/");
//		driver.navigate().back();
		System.out.println(driver.getCurrentUrl());
		//driver.navigate().forward();
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().refresh();
		
	}

}

/*GET METHOD
  ACCEPTS URL ONLY IN STRING FORMAT
  WHILE NAVIGATE() TAKES STRING AS WELL AS URL OBJECT
  */


/*NAVIGATIONAL METHODS
 1) navigate().to(url)
 2) navigate().back()
 3) navigate().forward()
 4) navigate().refresh()
 */