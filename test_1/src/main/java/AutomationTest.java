import org.junit.Assert;
import org.testng.annotations.BeforeMethod;

import test.shevtsova.tat.steps.Steps;

public class AutomationTest {
	private static final String ABOUT_SPECIALITY_URL = "http://km.mmf.bsu.by/about.html";
	private static final String DETCH_HEADER = "Computermathematik und Systemanalyse";
	private static final String LAVROVA_INFO_URL = "http://km.mmf.bsu.by/people/lavrova.html";
	
	private Steps steps;
	
	@BeforeMethod(description = "init browser")
	public void setUp() {
		steps = new Steps();
		steps.initBrowser();
	}

	public void oneCanReadAboutSpeciality() {
		Assert.assertEquals(ABOUT_SPECIALITY_URL, steps.aboutSpeciality());
	}
	
	public void oneCanChangeLang() {
		Assert.assertEquals(DETCH_HEADER, steps.changeLangResult());
	}
	
	public void oneCanSeeTeacherInfo() {
		Assert.assertEquals(LAVROVA_INFO_URL, steps.teacherInfo());
	}
	
	public void oneCanSeeAddress() {
		Assert.assertTrue(steps.isHaveAddress());
	}
}
