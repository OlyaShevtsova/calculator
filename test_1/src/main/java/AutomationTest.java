import org.junit.Assert;
import org.testng.annotations.BeforeMethod;

import test.shevtsova.tat.steps.Steps;

public class AutomationTest {
	private Steps steps;
	
	@BeforeMethod(description = "init browser")
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

	public void oneCanReadAboutSpeciality() {
//		steps.aboutSpeciality();
		Assert.assertEquals("http://km.mmf.bsu.by/about.html", steps.aboutSpeciality());
	}
}
