package test.shevtsova.tat.pages;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ContactPage extends AbstractPage {
	private static final String BASE_URL = "http://km.mmf.bsu.by/contact.html";
	private static final String EXPECTED_ADDRESS = "Адрес";
	
	@FindBy(xpath = "/html/body/div[1]/div[2]/h2")
	private WebElement address;
	
	public ContactPage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(this.driver, this);
	}

	@Override
	public void openPage() {
		driver.navigate().to(BASE_URL);
	}
	
	public boolean isContainAddress() {
		return StringUtils.equalsIgnoreCase(EXPECTED_ADDRESS, address.getText());
	}

}
