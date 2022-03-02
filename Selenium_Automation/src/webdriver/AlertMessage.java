package webdriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertMessage {
	
	public static void main(String[] args)  throws Exception{
		WebDriver driver;
		System.setProperty("webdriver.chrome.driver", ".\\browserdriver\\chromedriver.exe");
		
	     driver = new ChromeDriver();
	     driver.manage().window().maximize();
		
		driver.get("https://retail.onlinesbi.com/retail/login.htm");
		
		

}
}