package Amazon;

import static org.testng.Assert.assertEquals;

import org.openqa.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;


public class Addresses_Lists {

	static String failText="Sign in";
	static String failTextLists="Lists";


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.eg/");
        driver.manage().window().maximize();
        //hover on hello sign in
        WebElement ele =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions action = new Actions(driver);
        action.moveToElement(ele).perform();
        
        //change language
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/label[1]/i[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/span[2]/span[1]/input[1]")).click();
		
        Thread.sleep(1000);
        WebElement el =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
        Actions actio = new Actions(driver);
        actio.moveToElement(el).perform();
        //select your orders
        driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/a[2]/span[1]")).click();
		assertEquals(failText, driver.findElement(By.className("a-spacing-small")).getText());
		//go back
		Thread.sleep(1000);
		driver.navigate().back();
		
		//hover on hello sign in
		WebElement e =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    Actions a = new Actions(driver);
	    a.moveToElement(e).perform();
	    //click on your addresses
	    driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/a[3]/span[1]")).click();
	    assertEquals(failText, driver.findElement(By.className("a-spacing-small")).getText());
	    //go back
	  	Thread.sleep(1000);
	  	driver.navigate().back();
	  	
	    //hover on hello sign in
	  	WebElement e1 =driver.findElement(By.id("nav-link-accountList-nav-line-1"));
	    Actions a1 = new Actions(driver);
	  	a1.moveToElement(e1).perform();
	  	//click on your Lists
	  	driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[3]/div[2]/div[2]/div[1]/div[3]/a[4]/span[1]")).click();
	  	assertEquals(failTextLists, driver.findElement(By.className("al-intro-banner-header")).getText());
	  	
	    //go back
	  	Thread.sleep(1000);
	  	driver.navigate().back();
	  	
		
		
		
		
		
		
	}

}
