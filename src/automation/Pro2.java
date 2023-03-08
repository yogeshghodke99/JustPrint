package automation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pro2 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\chrome driver win_32\\Chrome Driver1\\chromedriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		driver.get("https://www.Facebook.com");
		
//		String b =driver.getTitle();
//		String a= driver.getCurrentUrl();
//		driver.navigate().to("https://www.Google.com");
//		driver.navigate().back();
//		driver.navigate().refresh();
		
		driver.manage().window().maximize();
		driver.manage().window().minimize();
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("8793424273");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("Yogesh@99");
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[2]/button")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div/div/div/div[2]/div/div[1]/form/div[3]/a")).click();
		
		
		
		
}
}


