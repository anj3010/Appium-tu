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

public class Scroll extends BaseTest
{
	
	@Test
	public void Scrolldown() throws MalformedURLException, InterruptedException {
		
		//actual automation
		//xpath ,id, accessibiltyid, classname, androidUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		
		//Where to scroll is known prior
		
//		driver.findElement(AppiumBy.androidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView(text(\"WebView\"))"));
	   
		//No prior idea just scrolling
		ScrollendAction();
		
		Thread.sleep(2000);
		
		
		
		
		
		
		//Actual automation
		
		
	}

	

}
