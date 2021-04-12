package project6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class NewTest5 {
  @Test
  public void f() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("https://www.cleartrip.com/");
	  driver.findElement(By.xpath("//input[@id=\"OneWay\"]")).click();
	 // driver.findElement(By.xpath("//input[@id=\"RoundTrip\"]")).click();
	 // driver.findElement(By.xpath("//input[@id=\"MultiCity\"]")).click();
	  driver.findElement(By.xpath("//input[@id=\"FromTag\"]")).sendKeys("hyd");
	  driver.findElement(By.xpath("//input[@id=\"ToTag\"]")).sendKeys("ban");
     driver.findElement(By.id("DepartDate")).click();
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[3]/td[3]")).click();

	driver.findElement(By.id("hotelLink")).click();
	driver.findElement(By.id("CheckInDate")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[1]/table/tbody/tr[2]/td[7]")).click();
	driver.findElement(By.id("CheckOutDate")).click();
	driver.findElement(By.xpath("//*[@id=\"ui-datepicker-div\"]/div[2]/table/tbody/tr[1]/td[4]/a")).click();
	
	
  driver.findElement(By.xpath("//*[@id=\"Home\"]/section/div/aside[1]/nav/ul[1]/li[3]/a")).click();

  driver.findElement(By.id("from_station")).sendKeys("hyd");
  driver.findElement(By.id("to_station")).sendKeys("ban");
  driver.findElement(By.id("trainsSelBox")).click();
  driver.findElement(By.id("train_adults")).sendKeys("4");

 













  }
  
}

