package driver123;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {
  @Test
  public void GmailTest() throws InterruptedException, IllegalMonitorStateException {
	  WebDriver driver = new FirefoxDriver();
	  driver.get("https://www.gmail.com");
	  driver.manage().window().maximize();
	  //WebElement SignInLink = driver.findElement(By.id("gmail-sign-in"));
	  WebElement Email = driver.findElement(By.id("Email"));
	  Email.sendKeys("chintamoni.patra@gmail.com");
	  WebElement Password = driver.findElement(By.id("Passwd"));
	  Password.sendKeys("vision@123");
	  WebElement SignIn_Button = driver.findElement(By.id("signIn"));
	  SignIn_Button.click();
	  //String xpath = "//span[@id='errormsg_0_Passwd']";

	//  if(driver.findElement(By.xpath(xpath)
	  //{
		//  System.out.println("Login Unsuccessful");
	  //}
	  Thread.sleep(20000);
	  
	  String xpath1 = "//div[@id=':x6']/div/div";
	  WebElement Compose = driver.findElement(By.xpath(xpath1));
	  Compose.click();
	  Thread.sleep(5000);
	  String winHandleBefore = driver.getWindowHandle();
	  System.out.println(winHandleBefore);
	  for(String winHandle : driver.getWindowHandles()){
	  driver.switchTo().window(winHandle);
	  System.out.println(driver.switchTo().window(winHandle));
	  }
     String xpath2 = "//input[@id=':1y6']";
      WebElement To = driver.findElement(By.xpath(xpath2));
	 // driver.switchTo().alert().sendKeys("chintamoni.patra@gmail.com");
	 To.sendKeys("chintamoni.patra@gmail.com");
	  String xpath3 = "//div[@id=':122']/input";
	  WebElement Subject = driver.findElement(By.xpath(xpath3));
	  Subject.sendKeys("Automating Gmail");
	  String xpath4 = "//div[@id=':11r']";
	  WebElement Send = driver.findElement(By.xpath(xpath4));
	  Send.click();
	  Thread.sleep(10000);
	  String xpath5 = "//div/../a/span[@class='gb_ea gbii']";
	  //driver.wait(60000);
	  WebElement Title = driver.findElement(By.xpath(xpath5));
	  Thread.sleep(10000);
	  Title.click();
	  WebElement Logout = driver.findElement(By.id("gb_71"));
	  Logout.click();
	  driver.quit();
	  //driver.wait();
	  //String xpathn = "//div[@class ='nH Hd']"
	//  driver.switchTo().alert().sendKeys(xpath2);
	  //driver.switchTo().window(By.className("nH Hd"));
	  String xpath0 = "//div[@class ='nH Hd']";
	  //driver.switchTo().frame((WebElement) By.xpath(xpath0));
	  driver.switchTo().activeElement().findElement(By.xpath(xpath0));
	
	  
	  
	 
		  
		  
	  
  }
}
