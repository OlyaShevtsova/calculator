package test.shevtsova.tat.steps;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;

import test.shevtsova.tat.driver.DriverSingleton;
import test.shevtsova.tat.pages.AboutSpecialityPage;
import test.shevtsova.tat.pages.MainPage;

public class Steps {
	private WebDriver driver;
	private final Logger LOGGER = LogManager.getRootLogger();
	
	public void initBrowser() {
		driver = DriverSingleton.getDriver();
	}
	
	public void closeDriver() {
		driver.quit();
	}
	
	public String aboutSpeciality() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickOnAboutSpecialityButton();
		AboutSpecialityPage aboutSpecialityPage = new AboutSpecialityPage(driver);
		String expectedPage = aboutSpecialityPage.getCurrentOpenedUserPage();
		return expectedPage;
	}
	
	
}
