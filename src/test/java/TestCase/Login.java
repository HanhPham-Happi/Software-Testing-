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

public class Login {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule public TestName name = new TestName();
	
	@Before
	public void setUp() throws Exception {
		driver = Helper.initWebDriver(Constant.BASE_URL1);
		Helper.clickItem(driver, HomeScreen.LOGIN_BTN_XPATH);
	}
			
	@After
	public void tearDown() throws Exception {
		testcase = name.getMethodName();
		Helper.captureScreen(driver, folder, testcase);
		Helper.shutDownDriver(driver);
	}

	@Test
	public void FUNC_02_01() throws Exception {
		 LoginScreen.login(driver, Constant.EMPTY, Constant.BASE_PASSWORD, Constant.EMPTY);
	}

	@Test
	public void FUNC_02_02() throws Exception {
		 LoginScreen.login(driver, Constant.FULL_SPACE, Constant.BASE_PASSWORD, LoginScreen.INCORRECT_INFO_MSG);
	}

	@Test
	public void FUNC_02_03() throws Exception {
		 LoginScreen.login(driver, Constant.INVALID_EMAIL, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_02_04() throws Exception {
		 LoginScreen.login(driver, " " + Constant.BASE_EMAIL + " ", Constant.BASE_PASSWORD, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_02_05() throws Exception {
		 LoginScreen.login(driver, Constant.INVALID_SPACE_EMAIL, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_02_06() throws Exception {
		 LoginScreen.login(driver, Constant.INVALID_SPECIAL_EMAIL, Constant.BASE_PASSWORD, LoginScreen.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_02_07() throws Exception {
		 LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_02_08() throws Exception {
		 LoginScreen.login(driver, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD, LoginScreen.INCORRECT_INFO_MSG);
	}
	
	@Test
	public void FUNC_02_09() throws Exception {
		 LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.EMPTY, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_02_10() throws Exception {
		 LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.FULL_SPACE, LoginScreen.INCORRECT_INFO_MSG);
	}
	
	@Test
	public void FUNC_02_11() throws Exception {
		 LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD + "1234", LoginScreen.INCORRECT_INFO_MSG);
	}
	
	@Test
	public void FUNC_02_12() throws Exception {
		 LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD, Constant.EMPTY);
	}
}
