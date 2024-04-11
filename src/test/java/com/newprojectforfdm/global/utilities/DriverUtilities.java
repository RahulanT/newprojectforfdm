package com.newprojectforfdm.global.utilities;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverUtilities  {
	private static DriverUtilities driverUtilities;
	private WebDriver driver;
	
	ConfigurationReader cfr ;
	
	protected DriverUtilities() {
		
	}
	
	

	public void resetDriver() {
		driver.close();
		driver=null;
		driverUtilities = null;
	}

	public static DriverUtilities getInstance() {
		if (driverUtilities == null) {
			driverUtilities = new DriverUtilities();
		}
		return driverUtilities;
	}

	public WebDriver getDriver() {
		if (driver == null) {
			System.out.println("Driver is NULL");
			createDriver();
		}

		return driver;
	}

    private void createDriver() {
		//System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+ "//Drivers/chromedriver.exe");
		System.setProperty("webdriver.chrome.driver" , System.getProperty("user.dir")+ ConfigurationReader.getProperty("config" ,"driverPATH"));

    	ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-blink-features=AutomationControlled");
		//options.addArguments("--disable-dev-shm-usage");
		//options.add_argument(""--proxy-server=%s" % PROXY)
		//options.addArguments("--remote-allow-origins=*");
		this.driver = new ChromeDriver(options);
		this.driver.manage().deleteAllCookies();

		}

	}


