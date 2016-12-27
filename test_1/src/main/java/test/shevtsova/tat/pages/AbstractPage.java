package test.shevtsova.tat.pages;

import org.openqa.selenium.WebDriver;

/**
 * 
 * @author Volha_Shautsova
 *
 */
public abstract class AbstractPage {
	protected WebDriver driver;
	
	public abstract void openPage();
	
	public AbstractPage(WebDriver driver) {
		this.driver = driver;
	}
}
