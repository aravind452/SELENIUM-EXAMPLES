package seleniumtutorials;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class WaitMethods {

	public static void main(String[] args) throws InterruptedException {
		// IMPLICIT WAIT
		/*WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));  // IMPLICIT WAIT
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		//Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("Admin");
*/
		
		
		
		// EXPLICIT WAIT
//		WebDriver driver = new ChromeDriver();
//		WebDriverWait webDriverWait = new WebDriverWait(driver,Duration.ofSeconds(5));
//		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		
//		WebElement userName  = 	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Username']"))); // EXPLICIT WAIT
//		userName.sendKeys("Admin");
//		WebElement password = 	webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@placeholder='Password']")));
//		password.sendKeys("admin123");
//		
//		
//		WebElement login  = webDriverWait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='Login']")));
//		login.click();
		
		
		
	}

}





/*IMPLICIT WAIT
 ADVANTAGES:
 1) SINGLE TIME
 2) IT WILL NOT WAIT TILL MAXIMUM TIME IF THE ELEMENT IS AVAILABLE
 3) APPLICABLE FOR ALL THE ELEMENTS
 4) EASY TO USE
 
 DISADVANTAGES:
 1) IF THE TIME IS NOT SUFFICIENT THEN EXCEPTION WILL BE THROWN
 */


/*----------EXPLICIT WAIT-------
 1) DECLARATION
 2) USAGE
 
 1) CONDITIONAL BASED, IT WILL MORE EFFECTIVELY
 2) FINDING ELEMENT IS INCLUSIVE(FOR SOME CONDITIONS)
 3) IT WILL WAIT FOR CONDITION TO BE TRUE, THEN CONSIDER THE TIME
 4) WE NEED TO WRITE MULTIPLE STATEMENTS FOR MULTIPLE ELEMENTS
 */
















/*-----SYNCHRONISATION-----
 1) IMPLICIT WAIT
 2) EXPLICIT WAIT
 */

/*SLEEP COMMAND - NOT RECOMMENDED
 ADVANTAGES:
 1)EASY TO USE
 
 DISADVANTAGES:
  1) IF THE TIME IS NOT SUFFICIENT THEN YOU WILL GET EXCEPTION
  2) IT WILL WAIT FOR MAXIMUM TIME OUT. THIS WILL REDUCE THE PERFORMANCE SCRIPT
  3) MULTIPLE TIMES
 */

/*-----EXCEPTIONS-----
 * 1) NOSUCHELEMENTEXCEPTION - ELEMENT IS NOT PRESENT ON THE PAGE -SYNCHRONISATION
 * 2) ELEMENTNOTFOUNDEXCEPTION - LOCATOR IS INCORRECT
 */
