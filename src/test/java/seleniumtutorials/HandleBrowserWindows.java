package seleniumtutorials;


import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		Set<String> windowIDSet = driver.getWindowHandles();
		
//		// Approach 1
//		List<String> list = new ArrayList<String>(windowIDSet);
//		String parentID = list.get(0);
//		String childID = list.get(1);
//		
//		// Switch to child window
//		driver.switchTo().window(childID);
//		
//		System.out.println(driver.getTitle());
//		
//		// Switch to parent window
//		driver.switchTo().window(parentID);
//		System.out.println(driver.getTitle());
		
		
		// Approach 2
		for(String id:windowIDSet) {
			String title = driver.switchTo().window(id).getTitle();
			
				System.out.println(driver.getCurrentUrl());
			
		}
		
		
		
}
}