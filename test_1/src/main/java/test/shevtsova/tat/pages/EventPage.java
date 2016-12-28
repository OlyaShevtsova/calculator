package test.shevtsova.tat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EventPage extends AbstractPage {
	private static final String BASE_URL = "http://km.mmf.bsu.by/events.html";
	
	@FindBy(xpath = "//a[contains(@aria-label, 'Узнать больше')]")
	private WebElement buttonLearnMore;
	
	@FindBy(xpath = "//main//header//h1")
	private WebElement openedUserPage;

	public EventPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}
	
	public String getHrefFromLearnMoreButton() {
		return buttonLearnMore.getAttribute("href");
	}
	
}
