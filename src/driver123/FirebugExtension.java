package driver123;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
//import org.openqa.selenium.f
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;
import org.testng.annotations.Test;

public class FirebugExtension {
  @Test
  public void f() {
	  System.setProperty("webdriver.", "");

	  FirefoxProfile Profile = new FirefoxProfile();
	  String json = "";
	  try {
		Profile.addExtension(new File("C:\\Users\\patch07\\Downloads\\firebug-1.9.0.xpi"));
		System.out.println(Profile.toJson());
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	  FirefoxDriver driver = new FirefoxDriver(Profile);
	  EventFiringWebDriver eventwebdriver = new EventFiringWebDriver(driver);
//	  WebDriverEventListener eventlistener = new WebDriverEventListener();
//	  eventlistener.get("https://www.ca.com");
  }
  
}
