package project1123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest1 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demo.opencart.com/");
	  
	 driver.findElement(By.xpath("//a[text()='Software']")).click();
	
	  driver.findElement(By.xpath("//a[contains(text(),'Desktops (13)')]")).click();

	  driver.findElement(By.xpath("//a[contains(text(),'Laptops & Notebooks (5)')]")).click();
	
	  
	  driver.findElement(By.xpath("//a[contains(text(),'Tablets (1)')]")).click();
	 
	  driver.findElement(By.xpath("//a[contains(text(),'Software (0)')]")).click();
	 
	  driver.findElement(By.xpath("//a[contains(text(),'Phones & PDAs (3)')]")).click();

	  driver.findElement(By.xpath("//a[contains(text(),'Cameras (2)')]")).click();
	 
	  driver.findElement(By.xpath("//a[contains(text(),'MP3 Players (4)')]")).click();
	  
	  
	  
  }
  
  
  
}

