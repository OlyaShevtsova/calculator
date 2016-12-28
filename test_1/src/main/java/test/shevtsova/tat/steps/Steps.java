package test.shevtsova.tat.steps;

import org.openqa.selenium.WebDriver;

import test.shevtsova.tat.driver.DriverSingleton;
import test.shevtsova.tat.pages.AboutSpecialityPage;
import test.shevtsova.tat.pages.ContactPage;
import test.shevtsova.tat.pages.EventPage;
import test.shevtsova.tat.pages.LavrovaPage;
import test.shevtsova.tat.pages.MainPage;
import test.shevtsova.tat.pages.TeachersPage;

public class Steps {
	private WebDriver driver;
	
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
	
	public String changeLangResult() {
		MainPage mainPage = new MainPage(driver);
		mainPage.changeLang();
		return mainPage.getChangedHeader();
	}
	
	public String teacherInfo() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickOnTeachersButton();
		TeachersPage teachersPage = new TeachersPage(driver);
		teachersPage.clickLavrovaButton();
		LavrovaPage lavrovaPage = new LavrovaPage(driver);
		return lavrovaPage.getCurrentOpenedUserPage();
	}
	
	public boolean isHaveAddress() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickOnContact();
		ContactPage contactPage = new ContactPage(driver);
		return contactPage.isContainAddress();
	}
	
	public String hrefMoreAboutEvent() {
		MainPage mainPage = new MainPage(driver);
		mainPage.clickOnEvent();
		EventPage eventPage = new EventPage(driver);
		return eventPage.getHrefFromLearnMoreButton();
	}
}
