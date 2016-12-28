package test.shevtsova.tat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends AbstractPage {
	private final String BASE_URL = "http://km.mmf.bsu.by/";

	@FindBy(xpath = "//a[contains(@aria-label, 'О специальности')]")
	private WebElement buttonAboutSpeciality;
	
	@FindBy(xpath = "//a[contains(@aria-label, 'Преподователи')]")
	private WebElement buttonTeachers;
	
	@FindBy(xpath = "//a[contains(@aria-label, 'Контакты')]")
	private WebElement buttonAddress;

	@FindBy(xpath = "/html/body/div[2]/a")
	private WebElement buttonChangeLang;
	
	@FindBy(xpath = "/html/body/div/div/div/div/h1")
	private WebElement header;

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
	
	public void clickOnTeachersButton() {
		buttonTeachers.click();
	}

	public void changeLang() {
		buttonChangeLang.click();
	}
	
	public String getChangedHeader() {
		return header.getText();
	}
	
	public void clickOnContact() {
		buttonAddress.click();
	}
}
