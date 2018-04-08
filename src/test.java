

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test {
	static WebDriver driver;
public	static void main(String argv[]){
		System.setProperty("webdriver.chrome.driver", ".\\mylib\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mais_jaradat_2000@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();
		
		
	}

}
