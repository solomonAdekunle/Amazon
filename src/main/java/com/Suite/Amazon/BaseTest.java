package com.Suite.Amazon;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class BaseTest{
	
   public static WebDriver d;
   EventFiringWebDriver dr;
	public static Properties OR = null;
	  protected static Properties CONFIG = null;
 

	
		
		public BaseTest() {
			if (OR == null) {
				try {
					// initialize OR
					OR = new Properties();
					FileInputStream fs = new FileInputStream(
							System.getProperty("user.dir") + "\\src\\main\\java\\Config\\OR.Properties");
					OR.load(fs);

					// initialize CONFIG to corresponding env
					CONFIG = new Properties();
					fs = new FileInputStream(
							System.getProperty("user.dir") + "\\src\\main\\java\\Config\\Config.Properties");
					CONFIG.load(fs);

					// System.out.println(OR.getProperty("loginusername"));
					// System.out.println(CONFIG.getProperty("loginURL"));

				} catch (Exception e) {
					System.out.println("Error on intializing properties files");
				}

			}
			
			
			// log("Opening browser "+browserType);
			String browserType = CONFIG.getProperty("browser");
			if (browserType.equals("Mozilla")) {
				System.setProperty("webdriver.gecko.driver", "lib\\geckodriver.exe");
				BaseTest.d = (WebDriver) new FirefoxDriver();
			} else if (browserType.equals("Chrome") ) {
				File file = new File("lib\\chromedriver.exe");
				System.setProperty("webdriver.chrome.driver", file.getAbsolutePath());
				ChromeOptions options = new ChromeOptions();
				options.addArguments("no-sandbox");
				BaseTest.d = (WebDriver) new ChromeDriver();
			}else if (browserType.equals("IE")) {
				// set the IE server exe path and initialize
			}
			
			// max
			d.manage().window().maximize();
			// implicit wait
			d.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
			
			//driver.get(CONFIG.getProperty("siteName"));
		}
		
		
	}
