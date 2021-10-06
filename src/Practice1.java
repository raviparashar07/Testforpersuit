
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Practice1 {

	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver","C:\\SeleniumDrivers\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.google.com");
		Thread.sleep(500);
		
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("COVID-19");
	driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/ul/li[1]/div/div[2]/div[1]/span")).click();
		
	driver.findElement(By.xpath("//*[@id=\"hdtb-msb\"]/div[1]/div/div[2]/a")).click();
	
	//List<WebElement> alltags =driver.findElements(By.tagName("a"));
	//System.out.println("Total tags are"+alltags.size());
	//System.out.println(driver.findElements(By.tagName("a")).size());
	
	//for(int i=0; i<=alltags.size();i++)
	{
		//System.out.println("links on page are"+alltags.get(i).getAttribute("href"));
//System.out.println("links on page are"+alltags.get(i).getText());
		int count=0;
		for(WebElement link:driver.findElements(By.tagName("a")))
		{System.out.println(link.getText());
		count++;
		}
		System.out.println("total link"+count);
		}

driver.close();
	}
}
		
		
		
		
		
		
		
		
		
	
