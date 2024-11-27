package seleniumtutorials;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/*
 * CSS Selectors
 * tag id tag#id
 * tag class tag.classname
 * tag attribute tag[attribute="value"]
 * tag class attribute tag.classname[attribute="value"]
 */

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver webDriver = new ChromeDriver();
		webDriver.get("https://demo.nopcommerce.com/");

		// tag#id
		// webDriver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("hello");

		// tag.classname
		// webDriver.findElement(By.cssSelector("input.search-box-text")).sendKeys("hello");

		// tag attribute

		// webDriver.findElement(By.cssSelector("input[placeholder='Search
		// store']")).sendKeys("Shirts");

		// tag class attribute

		// webDriver.findElement(By.cssSelector("input.search-box-text[placeholder='Search store']")).sendKeys("Shirts");
	}

}
