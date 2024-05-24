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
import Screen.UpdateProfileScreen;

public class UpdateProfile {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule
	public TestName name = new TestName();

	@Before
	public void setUp() throws Exception {
		driver = Helper.initWebDriver(Constant.BASE_URL1);
		Helper.clickItem(driver, HomeScreen.LOGIN_BTN_XPATH);
		LoginScreen.login(driver, Constant.BASE_EMAIL, Constant.BASE_PASSWORD, Constant.EMPTY);
		UpdateProfileScreen.openScreen(driver);
	}
		
	@After
	public void tearDown() throws Exception {
		testcase = name.getMethodName();
		Helper.captureScreen(driver, folder, testcase);
//		HomeScreen.logout(driver);
		Helper.shutDownDriver(driver);
	}

	@Test
	public void FUNC_06_01() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.EMPTY, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_DESCRIPTION_MSG);
	}

	@Test
	public void FUNC_06_02() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.FULL_SPACE, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_DESCRIPTION_MSG);
	}
	
	@Test
	public void FUNC_06_03() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.ALPHABET_CHARS, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_04() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_05() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.NUMERIC_CHARS, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_06() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.SPECIAL_CHARS, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_07() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.EMPTY, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_USERNAME_MSG);
	}

	@Test
	public void FUNC_06_08() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.FULL_SPACE, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_USERNAME_MSG);
	}
	
	@Test
	public void FUNC_06_09() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.ALPHABET_CHARS, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_10() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_11() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.NUMERIC_CHARS, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_12() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.SPECIAL_CHARS, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_13() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.EMPTY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_UNIVERSITY_MSG);
	}

	@Test
	public void FUNC_06_14() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.FULL_SPACE, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_UNIVERSITY_MSG);
	}
	
	@Test
	public void FUNC_06_15() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.ALPHABET_CHARS, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_16() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_17() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.NUMERIC_CHARS, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_18() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.SPECIAL_CHARS, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	@Test
	public void FUNC_06_19() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.EMPTY, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_WORK_MSG);
	}

	@Test
	public void FUNC_06_20() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.FULL_SPACE, Constant.BASE_CITY, UpdateProfileScreen.EMPTY_WORK_MSG);
	}
	
	@Test
	public void FUNC_06_21() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.ALPHABET_CHARS, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_22() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_23() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.NUMERIC_CHARS, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_24() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.SPECIAL_CHARS, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_25() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.EMPTY, UpdateProfileScreen.EMPTY_CITY_MSG);
	}

	@Test
	public void FUNC_06_26() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.FULL_SPACE, UpdateProfileScreen.EMPTY_CITY_MSG);
	}
	
	@Test
	public void FUNC_06_27() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.ALPHABET_CHARS, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_28() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.BASE_CITY, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_29() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.NUMERIC_CHARS, UpdateProfileScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_06_30() throws Exception {
		UpdateProfileScreen.updateProfile(driver, Constant.BASE_DESCRIPTION, Constant.BASE_USERNAME, Constant.BASE_UNIVERSITY, Constant.BASE_WORK, Constant.SPECIAL_CHARS, UpdateProfileScreen.SUCCESS_MSG);
	}
}
