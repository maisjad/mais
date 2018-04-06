
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class test2 {


	static WebDriver driver;
	@Before
	public void setup() throws Exception{
		System.setProperty("webdriver.chrome.driver", ".\\src\\mylib\\chromedriver.exe");
		driver=new ChromeDriver();
	}
	@Test
	public void test(){
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath(".//*[@id='email']")).sendKeys("mais_jaradat_2000@yahoo.com");
		driver.findElement(By.xpath(".//*[@id='pass']")).sendKeys("123");
		driver.findElement(By.xpath(".//*[@id='loginbutton']")).click();

	}
	

}


