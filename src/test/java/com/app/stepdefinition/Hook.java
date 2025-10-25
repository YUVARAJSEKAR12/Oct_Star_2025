package com.app.stepdefinition;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.io.FileHandler;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.google.common.io.Files;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import io.github.bonigarcia.wdm.WebDriverManager;

//before and after
public class Hook{
	// extents 
	public static WebDriver driver;
	public static ExtentReports extent;
	public static ExtentTest test;
	
	@Before
	public void setup(Scenario scenario) {
		//System.out.println("Launching Chrome with DesiredCapabilities and ChromeOptions...");
	if(extent==null) {
		ExtentSparkReporter exspark= new ExtentSparkReporter("target/Extentreport.html");
		extent = new ExtentReports();
		extent.attachReporter(exspark);		
	}
	test = extent.createTest(scenario.getName());
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--start-maximized");
	options.addArguments("--disable-notifications");
	options.addArguments("--in-cognito");
	WebDriverManager.chromedriver().setup();
	driver = new ChromeDriver(options);
	
	}

	@After
	public void teardown(Scenario scenario) {
		if(scenario.isFailed()) {
			TakesScreenshot ts = (TakesScreenshot)driver;
			File src = ts.getScreenshotAs(OutputType.FILE);
			String desc = "target/screenshot"+scenario.getName()+".jpeg";
			File des = new File(desc);
			try {
				FileHandler.copy(src, des);
				test.fail("Scenario Failed, Screen shot attached")
				.addScreenCaptureFromPath(desc);
				
			//	Files.copy(src, desc);
			} catch (IOException e) {
				
			}
		}else {
			test.pass("Scenario passed");
		}
		extent.flush();
		if(driver!=null) {
			driver.quit();
		}
		
	}
}
