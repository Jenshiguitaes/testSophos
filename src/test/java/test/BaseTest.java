package test;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

import pages.BasePage;
import utils.DriverController;

public class BaseTest {
		@Parameters({"browser","url"})
		@BeforeMethod
		public void setup(String browser, String url) {
		DriverController.setDriver(browser);
		BasePage.initBrowser(url);	
	}

}
