package test.shevtsova.tat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
	private final String BASE_URL = "http://km.mmf.bsu.by/";
	
	@FindBy(xpath = "//a[contatins(@aria-label, 'О специальности')]")
	private WebElement buttonAboutSpeciality;

	public MainPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

	public void clickOnAboutSpecialityButton() {
		buttonAboutSpeciality.click();
	}
}
