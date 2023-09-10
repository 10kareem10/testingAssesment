package Amazon;

import static org.testng.Assert.assertEquals;


import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.chrome.ChromeDriver;

public class Quantity {

	static String Name ="Xo Pr137 Power Bank 20000 Mah, 20W, Qc22.5W - Black";
	static String Quantity="Qty: 2";
	static String Price="EGP 659.00";
	static String Subtotal="EGP 1,318.00";


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver(); 
		driver.get("https://www.amazon.eg/");
		driver.manage().window().maximize();
	    //open the menu bar
		driver.findElement(By.id("nav-hamburger-menu")).click();
		// redirect to today's deals
		driver.findElement(By.xpath("/html[1]/body[1]/div[3]/div[2]/div[1]/ul[1]/li[17]/a[1]")).click();
		//click in second category
		driver.get("https://www.amazon.eg/gp/goldbox/?ref_=nav_em_navm_deals_0_1_1_24&deals-widget=%257B%2522version%2522%253A1%252C%2522viewIndex%2522%253A0%252C%2522presetId%2522%253A%2522CA8530B6841E79DD8687D723F1C27930%2522%252C%2522departments%2522%253A%255B%252218018102031%2522%255D%252C%2522sorting%2522%253A%2522FEATURED%2522%257D");
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[19]/div[1]/div[1]/div[1]/div[2]/div[3]/div[1]/div[4]/div[1]/div[1]/a[1]/div[1]/div[1]/img[1]")).click();
		//click on 2nd item in this product 
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[2]/div[1]/div[2]/div[1]/ul[1]/li[2]/span[1]/div[1]/div[1]/a[1]/div[1]")).click();
		//Select Quantity
		Select select = new Select(driver.findElement(By.id("quantity")));
		select.selectByValue("2");
		//Click on Add to Cart Button
		driver.findElement(By.id("add-to-cart-button")).click();
		//Go to Cart Button
		driver.findElement(By.id("nav-cart-text-container")).click();
		//Change language to English
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[1]/div[1]/div[3]/div[1]/a[1]/span[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/form[1]/div[1]/div[1]/div[3]/div[1]/label[1]/i[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/span[2]/span[1]/input[1]")).click();
		assertEquals(Name,driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[2]/ul[1]/li[1]/span[1]/a[1]/span[1]/span[1]/span[2]")).getText());
		assertEquals(Quantity, driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[2]/div[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]/span[1]")).getText());
		assertEquals(Price, driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[2]/div[3]/div[4]/div[1]/div[2]/ul[1]/div[1]/div[1]/div[1]/p[1]/span[1]")).getText());
		assertEquals(Subtotal, driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[3]/div[4]/div[1]/div[2]/div[1]/div[1]/form[1]/div[3]/span[2]/span[1]")).getText());
		
		
		
	}
}
