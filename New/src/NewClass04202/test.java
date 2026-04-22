package NewClass04202;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class test {

	public static void main(String[] args) throws InterruptedException{
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in"); //Open Browser
		 driver.manage().window().maximize(); // Maximize the window
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));// implicit wait
		 WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3)); // Explicit wait
		WebElement searchBox = wait.until(ExpectedConditions.elementToBeClickable(By.id("twotabsearchtextbox")));
		searchBox.sendKeys("IPhone 17");
		searchBox.submit();
		 //driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 17"); //Enter IPhone 17 in the search box
		 //Thread.sleep(3000);
		driver.findElement(By.id("nav-search-submit-button")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[2]/div/div[3]/span/div/span/div/div[3]/div[2]/ul[1]/span/span[1]/li/span/a/div/label/i")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[1]/div[1]/div/span[1]/div[1]/div[2]/div/div/div/div/span/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[3]/div/div/div/div[2]/div/form/div/div/span/div/span")).click();
		//Thread.sleep(3000);
		driver.findElement(By.id("nav-cart-count")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/div[1]/span/div/label/i")).click();
		//Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/span[1]/span/span/span/input")).click();
		//Thread.sleep(3000);
		driver.quit();
		
	}

}
