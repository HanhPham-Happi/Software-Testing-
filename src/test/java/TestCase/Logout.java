package TestCase;

import org.junit.After;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import Common.Helper;
import Common.Constant;
import Screen.HomeScreen;
import Screen.LoginScreen;

public class Logout {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
		driver = Helper.initWebDriver(Constant.BASE_URL1);
		Helper.clickItem(driver, HomeScreen.LOGIN_BTN_XPATH);
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD, Constant.EMPTY);
	}
			
	@After
	public void tearDown() throws Exception {
		testcase = name.getMethodName();
		Helper.captureScreen(driver, folder, testcase);
		Helper.shutDownDriver(driver);
	}

	@Test
	public void FUNC_07_01() throws Exception {
		 HomeScreen.logout(driver);
	}
	
}
