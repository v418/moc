package project1123;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest4 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver= new ChromeDriver();
	  driver.get("https://demo.opencart.com/");

	  
	  driver.findElement(By.xpath("//a[text()='Software']")).click();
	
	  
     //Laptopes
	  driver.findElement(By.xpath("//a[contains(text(),'Phones & PDAs (3)')]")).click();
	 
	  driver.findElement(By.xpath("//a[contains(text(),'iPhone')]")).click();
	 
	  driver.navigate().back();
	  driver.findElement(By.xpath("//a[contains(text(),'Palm Treo Pro')]")).click();
	
	  

	 
	
	  
	  
	  
	
	  
	  
	  
  }
  
  
  
}

