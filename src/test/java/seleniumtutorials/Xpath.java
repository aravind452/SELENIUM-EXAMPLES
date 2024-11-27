package seleniumtutorials;

// import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		
		// Xpath with single attribute
		// driver.findElement(By.xpath("//input[@placeholder='Search']")).sendKeys("Shirts");
		
		
		// Xpath with multiple attribute
		
		// driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("Shirts");
		
		// Xpath with and/or attribute
		// driver.findElement(By.xpath("//input[@name='search' or @placeholder='Search']")).sendKeys("Shirts");
		
		
		// Xpath with inner text
		
//		boolean displayStatus = driver.findElement(By.xpath("//*[text()='Featured']")).isDisplayed();
//		System.out.println(displayStatus);
//		String value = driver.findElement(By.xpath("//*[text()='Featured']")).getText();
//		System.out.println(value);
		
		
		// Xpath with contains
		// driver.findElement(By.xpath("//input[contains(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		// Xpath with starts with
		
		// driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sea')]")).sendKeys("T-shirts");
		
		
//		boolean status = driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
//		System.out.print(status);
	}

}

/*
 * Xpath - is an address of the element 
 * works on DOM
 * Relative Xpath and Absolute Xpath
 * Relative - //*[@id="search"]/input
 * Absolute - /html/body/header/div/div/div[2]/div/input - Only Tags, No Attributes
*/


/*
 * Diff b/w Absolute and Relative
 * 1) Absolute xpath starts with /
 * 	  Relative xpath starts with //
 * 2) Absolute path does not use attributes
 *    Relative xpath works with attributes
 * 3) Absolute xpath traverse through each and every node
 *    Relative xpath directly jumps and finds the element by using attribute
*/


/*
 * Relative Xpath
 * 1) Automatically - Devtools, SelectorsHub
 * 2) Manually - (Own Xpath)
 * 
 * Syntax(Manually)
 * tagname[@attribute="value"]
 * *[@attribute="value]
*/


/*
 * Xpath with and/or operators
 *  // input[@name='search' and @placeholder='search']
 *  // input[@name='search' or @placeholder='search']
 *  
 */


/*
 * X path with inner text - text()
 * //a[text()='Desktops']
 * */


/*
 * <a href="/">click me <a/> link text as well as inner text
 * <h1>Hello<h1/> inner text not link text
 * */



/*handling dynamic attributes
 *
 *   //*[@id='start or @id='stop]' // Manually written
 *   //*[contains(@id,'st')]
 *   //* [starts-with(@id,'st')]
 *   */




/*
 *  chained xpath
 *  
 *  //div[@id='logo']/a/img
 *  */
