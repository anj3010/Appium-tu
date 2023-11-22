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

public class Swipe extends BaseTest
{
	
	@Test
	public void SwipeDemo() throws MalformedURLException, InterruptedException {
		
		//actual automation
		//xpath ,id, accessibiltyid, classname, androidUIAutomator
		
		driver.findElement(AppiumBy.accessibilityId("Views")).click();
		driver.findElement(AppiumBy.accessibilityId("Gallery")).click();
		WebElement firstImg = driver.findElement(AppiumBy.accessibilityId("1. Photos"));
		firstImg.click();
		
		
		//swipe perform
		
//		size = driver.manage().window().getSize();
//		System.out.println(size);
		int a =1;
		while(a<4) {
		
		
		WebElement firstimage = driver.findElement(By.xpath("(//android.widget.ImageView)["+a+"]"));
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)["+a+"]")).getAttribute("focusable"),"true");
		
		//swipe
		
		driver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId" ,((RemoteWebElement)firstimage).getId(),
				"direction" ,"left",
				"percent",0.75));
		
		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)["+a+"]")).getAttribute("focusable"),"false");
		a++;
		}
//		//2nd image
//		WebElement secondimage = driver.findElement(By.xpath("(//android.widget.ImageView)[2]"));
//Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[2]")).getAttribute("focusable"),"true");
//		
//		//swipe
//		
//		driver.executeScript("mobile: swipeGesture", ImmutableMap.of("elementId" ,((RemoteWebElement)secondimage).getId(),
//				"direction" ,"left",
//				"percent",0.75));
//		
//		Assert.assertEquals(driver.findElement(By.xpath("(//android.widget.ImageView)[2]")).getAttribute("focusable"),"false");
//		
//		
		
		
		
		Thread.sleep(2000);
		
		
		
		
		
		
		//Actual automation
		
		
	}

	

}
