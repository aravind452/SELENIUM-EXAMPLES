package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.List;

public class LocatorsDemo {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();

		// findElement by name
		// driver.findElement(By.name("search")).sendKeys("MacBook");
	
		// findElement by ID
		// boolean status = driver.findElement(By.id("logo")).isDisplayed();
		// System.out.println(status);

		// linkText and partialLinkText
		// driver.findElement(By.linkText("Tablets")).click();
		// - not recommended driver.findElement(By.partialLinkText("Tab")).click();

		// ---------- Grouping multiple elements
		// Class name
		//List<WebElement> links =  driver.findElements(By.className("list-inline-item"));
		//System.out.println(links.size());

		// TagName
		//List<WebElement> links = driver.findElements(By.tagName("img"));
		//System.out.println(links.size());
		
		
		
	
	}
}
/*
 * Scenario 1: Locator matching with single web element 
 * findElement(loc) -----> single web element return type - WebElement 
 * findElements(loc) ----> single web element return type - List<WebElement>
 * 
 * 
 * Scenario 2: Locator matching with multiple web elements: 
 * findElement(loc)----> single web element return type -web element 
 * findElements(loc) ----> multiple web elements return type - list<WebElement>
 * 
 * Scenario 3: Locator is not matching with any element/s 
 * findElement(loc) ---->Exception - No such element exception 
 * findElements(loc) ----> return 0
 */




