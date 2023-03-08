package automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class pro1 {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","D:\\chrome driver win_32\\Chrome Driver1\\chromedriver.exe");
	
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.facebook.com");
}
}
