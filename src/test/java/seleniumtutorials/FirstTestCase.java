package seleniumtutorials;

import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTestCase{

	public static void main(String[] args) {
//		System.out.print("hello");
		ChromeDriver chromeDriver = new ChromeDriver();

		chromeDriver.get("https://demo.opencart.com/");

		String actualTitleString = chromeDriver.getTitle();
		if (actualTitleString.equals("Your Stor")) {
			System.out.println("TEst passed");
		} else {
			System.out.println("Test failed");
		}
	}

}
