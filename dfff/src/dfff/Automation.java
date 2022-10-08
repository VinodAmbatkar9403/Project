package dfff;

import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\driver\\chromedriver.exe" );
	
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.google.com");
	}

}
