package Firstproject.Appium;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import com.google.common.collect.ImmutableMap;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public class BaseTest {
	public AndroidDriver driver;
	public AppiumDriverLocalService service;
	@BeforeClass
	public void ConfigureAppium() throws MalformedURLException {
		//code to start server
		
				//AndroidDriver ,IOs 
		        service = new AppiumServiceBuilder().withAppiumJS(new File("C:\\Users\\anjalisingh7\\AppData\\Roaming\\npm\\node_modules\\appium\\build\\lib\\main.js"))
		    		   .withIPAddress("127.0.0.1").usingPort(4723).build();
		       service.start();
				
				UiAutomator2Options options = new UiAutomator2Options();
				options.setDeviceName("Anjaliemulator");
				options.setApp("C:\\Users\\anjalisingh7\\eclipse-workspace\\Appium\\src\\test\\java\\resources\\ApiDemos-debug.apk");
				
				  driver = new AndroidDriver(new URL("http://127.0.0.1:4723"),options);
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
				
	}
	
	public void ScrollendAction() {
		boolean canScroll;
		do {
		 canScroll =(Boolean) driver.executeScript("mobile: scrollGesture", ImmutableMap.of("left" ,100, "top" ,100 ,"width",200 
				,"height",200 ,"direction","down","percent",3.0));
		
		}
		while(canScroll!=false);
	}
	
	
	
	@AfterClass
	public void tearDown() {
		driver.quit();
		service.stop();
	}

}
