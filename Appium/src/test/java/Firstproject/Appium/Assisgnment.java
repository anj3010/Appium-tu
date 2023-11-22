package Firstproject.Appium;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Assisgnment extends BaseTest
{
	
	@Test
	public void Assisgnmentend() throws MalformedURLException, InterruptedException {
		
		//actual automation
		//xpath ,id, accessibiltyid, classname, androidUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("App")).click();
		driver.findElement(AppiumBy.accessibilityId("Alert Dialogs")).click();
		driver.findElement(AppiumBy.accessibilityId("OK Cancel dialog with a message")).click();
		
		String menutext = driver.findElement(By.id("android:id/alertTitle")).getText();
//		Assert.assertEquals(menutext, "Lorem ipsum dolor sit aie consectetur adipiscing Plloaso mako nuto siwuf cakso dodtos anr koop. ");
		driver.findElement(By.id("android:id/button2")).click();
		
//		WebElement alert = driver.findElement(By.id("android:id/button2"));
//		alert.click();
		
		Assert.assertTrue(driver.findElement(By.id("io.appium.android.apis:id/two_buttons2")).isDisplayed());
		
		driver.findElement(AppiumBy.accessibilityId("List dialog")).click();
		driver.findElement(By.xpath("//android.widget.TextView[@text='Command two']")).click();
		
		//assertion 
		String dialog = driver.findElement(By.id("android:id/message")).getText();
		Assert.assertEquals(dialog,"You selected: 1 , Command two");
		driver.pressKey(new KeyEvent(AndroidKey.BACK));
		
		//Single choice list
		 driver.findElement(AppiumBy.accessibilityId("Single choice list")).click();
		 
		 WebElement traffic = driver.findElement(By.xpath("//android.widget.CheckedTextView[@text ='Traffic']"));
		 
		 boolean isDisplayedCondition = traffic.isDisplayed();
	      System.out.println("The traffic radio button is status is :" +isDisplayedCondition);
	        
	      boolean isEnabledCondition = traffic.isEnabled();

	     System.out.println("The button is :" + isEnabledCondition); 
	     
	     boolean selectedCondtion = traffic.isSelected();
	     if(!traffic.isSelected()) {
	    	 traffic.click();
	     }
	     else {
	    	 System.out.println("already selected");
	     }
		
		
		
		//Repeat alarm
	     
		//entry fill
		
		Thread.sleep(2000);
		
		
		
		
		
		
		//Actual automation
		
		
	}

	

}
