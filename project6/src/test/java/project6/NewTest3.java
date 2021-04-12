package project6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

  import io.github.bonigarcia.wdm.WebDriverManager;

  public class NewTest3 {
  @Test
  public void f() throws InterruptedException {
	  WebDriverManager.chromiumdriver().setup();
	  WebDriver driver=new ChromeDriver();
	 driver.manage().window().maximize();
	 driver.get("https://github.com/bonigarcia/webdrivermanager");
       	
	Thread.sleep(5000);
	 
	
	   
  
  }
  
}