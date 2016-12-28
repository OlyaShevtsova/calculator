package test.shevtsova.tat.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AboutSpecialityPage extends AbstractPage {
	private static final String BASE_URL = "http://km.mmf.bsu.by/about.html";

	@FindBy(xpath = "//main//header//h1")
    private WebElement openedUserPage;
	
	public AboutSpecialityPage(WebDriver driver) {
		super(driver);
        PageFactory.initElements(this.driver, this);
	}
	
	public String getCurrentOpenedUserPage() {
        return openedUserPage.getText();
    }

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}

}
