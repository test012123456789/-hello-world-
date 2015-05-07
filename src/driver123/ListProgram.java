package driver123;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.f
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class ListProgram {
  @Test
  public void List() throws InterruptedException {
	  FirefoxDriver driver = new FirefoxDriver();
	  driver.get("https://www.facebook.com/");
	  Thread.sleep(10000);
	  WebElement table = driver.findElement(By.id("login_form"));
	 // System.out.println(table.getText());
	  List<WebElement> Row = table.findElements(By.tagName("tr"));
	  for(WebElement k : Row)
	  {
		  System.out.println("This is displaying the rows of the table");
		  System.out.println(k.getText());
	  }
	  List<WebElement> list = driver.findElements(By.id("month"));
	  for (WebElement i : list )
	  {
		  //list.add(i);System.out.println(list.add(i));
		  
		  System.out.println(i.getText());
		//  list.add(i);
	 // System.out.println(list);
  }
	
	  for (WebElement j : list )
	  {
		  if(j.getText().contains("set") )
		  {
			  System.out.println("November month exists in the given list");	
		  }
		  else
		  {
			  System.out.println("November month does not exists in the given list");
		  }
		  
	 // System.out.println(list);
  }
  
}
}
