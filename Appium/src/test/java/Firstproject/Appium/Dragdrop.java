package Firstproject.Appium;



import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class Dragdrop extends BaseTest
{
	
	@Test
	public void DragandDrop() throws MalformedURLException, InterruptedException {
		
		//actual automation
		//xpath ,id, accessibiltyid, classname, androidUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		 driver.findElement(By.xpath("//android.widget.TextView[@content-desc=\"Drag and Drop\"]")).click();
	        
	        WebElement element2=driver.findElement(By.id("io.appium.android.apis:id/drag_dot_1"));
	        
	         driver.executeScript("mobile: dragGesture", ImmutableMap.of(
	                "elementId", ((RemoteWebElement) element2).getId(),
	                "endX", 651,
	                "endY", 577
	            ));
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		//Actual automation
		
		
	}

	

}
