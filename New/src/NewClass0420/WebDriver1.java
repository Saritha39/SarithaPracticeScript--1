package NewClass0420;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver1 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		 driver.get("https://www.amazon.in"); //Open Browser
		 driver.manage().window().maximize(); // Maximize the window
		 Thread.sleep(3000);
		 driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Iphone 17"); //Enter IPhone 17 in the search box
		 Thread.sleep(3000);
		 driver.findElement(By.id("nav-search-submit-button")).click(); // select check box Get it today on the left pane
		 Thread.sleep(3000);
		 driver.findElement(By.id("a-autoid-30")).click();  // Click Add to cart
		 Thread.sleep(3000);
		 driver.findElement(By.id("a-autoid-1")).click(); // increment by 1
		 Thread.sleep(3000);
		 driver.findElement(By.id("a-autoid-27-announce")).click(); //Click Cart icon on the top right
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("/html/body/div[1]/div[1]/div[3]/div[5]/div/div[1]/div[1]/div/form/div/div[3]/div[1]/span/div/label/i")).click(); //Select this order contains a gift on the right side
		 Thread.sleep(3000);
		 driver.findElement(By.id("proceed-to-checkout-action")).click(); //Click Proceed to checkout
		 
		 
		 
		  
		
		
	}

}
