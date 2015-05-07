package driver123;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

@Test
public class GoogleSearch {

  public void f() throws InterruptedException {
	  FirefoxProfile Profile = new FirefoxProfile();
	  FirefoxDriver driver = new FirefoxDriver(Profile);
	  driver.get("https://www.google.co.in");
	  driver.manage().window().maximize();
	  WebElement SearchBox = driver.findElement(By.id("lst-ib"));
	  //WebElement Button = driver.findElement(By.tagName("Button"));
	  //WebElement LinkText = driver.findElement(By.linkText("Which animal are you"));
	//  System.out.println(LinkText.getAttribute());
	//  LinkText.click();
	 System.out.println(SearchBox.isDisplayed());
	 System.out.println(SearchBox.isEnabled());
	 System.out.println(SearchBox.isSelected());
	  System.out.println(driver.getTitle());
	  //Button.click();
	  //SearchBox.click();
//	  if(driver.findElement(By.id("resultStats")).equals("Your search did not match any documents")){
//		  System.out.println("No search result exusts");
//	  }
//	  else
//	  {
//		  System.out.println("there are search results");
//	  }
	  //System.out.println(driver.getPageSource());
	//  driver.wait();
	  driver.quit();
  }
}
