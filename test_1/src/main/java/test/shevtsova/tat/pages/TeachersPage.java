package test.shevtsova.tat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TeachersPage extends AbstractPage {
	private static final String BASE_URL = "http://km.mmf.bsu.by/people.html";
	
	@FindBy(xpath = "//a[contains(@aria-label, 'Лаврова Ольга Анатольевна')]")
	private WebElement teacherLavrovaButton;

	public TeachersPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}
	
	public void clickLavrovaButton() {
		teacherLavrovaButton.click();
	}
	
}
