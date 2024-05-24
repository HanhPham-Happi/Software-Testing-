package TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import Common.Helper;
import Common.Constant;
import Screen.CreateAccountScreen;
import Screen.HomeScreen;
import Screen.LoginScreen;

public class CreateAccount {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void setUp() throws Exception {
		driver = Helper.initWebDriver(Constant.BASE_URL1);
	}
	
	@Before
	public void setUpForEachTC() throws Exception {
		Helper.clickItem(driver, HomeScreen.LOGIN_BTN_XPATH);
		Helper.clickItem(driver, LoginScreen.CREATE_ACC_LINK_XPATH);
	}
	
	@After
	public void tearDownForEachTC() throws Exception {
		testcase = name.getMethodName();
		Helper.captureScreen(driver, folder, testcase);
		Helper.refreshScreen(driver);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Helper.shutDownDriver(driver);
	}

	@Test
	public void FUNC_01_01() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.EMPTY, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.USERNAME_FB_XPATH,
				CreateAccountScreen.EMPTY_NAME_MSG);
	}

	@Test
	public void FUNC_01_02() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.FULL_SPACE, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.USERNAME_FB_XPATH,
				CreateAccountScreen.EMPTY_NAME_MSG);
	}

	@Test
	public void FUNC_01_03() throws Exception {
		CreateAccountScreen.createAccount(driver, " " + Constant.BASE_NAME + " ", Constant.BASE_EMAIL1,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_04() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_05() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.SPECIAL_CHARS, Constant.BASE_EMAIL1,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				CreateAccountScreen.USERNAME_FB_XPATH, CreateAccountScreen.INVALID_NAME_MSG);
	}

	@Test
	public void FUNC_01_06() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.NUMERIC_CHARS, Constant.BASE_EMAIL1,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				CreateAccountScreen.USERNAME_FB_XPATH, CreateAccountScreen.INVALID_NAME_MSG);
	}

	@Test
	public void FUNC_01_07() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.EMPTY, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.EMAIL_FB_XPATH,
				CreateAccountScreen.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_08() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.FULL_SPACE, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.EMAIL_FB_XPATH,
				CreateAccountScreen.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_09() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.INVALID_EMAIL,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				CreateAccountScreen.EMAIL_FB_XPATH, CreateAccountScreen.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_10() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, " " + Constant.BASE_EMAIL1 + " ",
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_11() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.INVALID_SPACE_EMAIL,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				CreateAccountScreen.EMAIL_FB_XPATH, CreateAccountScreen.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_12() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.INVALID_SPECIAL_EMAIL,
				Constant.BASE_PASSWORD, Constant.BASE_PASSWORD, Constant.BASE_PHONE1,
				CreateAccountScreen.EMAIL_FB_XPATH, CreateAccountScreen.INVALID_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_13() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL2, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}

	@Test
	public void FUNC_01_14() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.ERROR_CREATE_MSG_XPATH,
				CreateAccountScreen.REGISTED_EMAIL_MSG);
	}

	@Test
	public void FUNC_01_15() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.EMPTY,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.PWD_FB_XPATH,
				CreateAccountScreen.EMPTY_PWD_MSG);
	}

	@Test
	public void FUNC_01_16() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.FULL_SPACE,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.PWD_FB_XPATH,
				CreateAccountScreen.EMPTY_PWD_MSG);
	}

	@Test
	public void FUNC_01_17() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_18() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_19() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.SPECIAL_CHARS,
				Constant.SPECIAL_CHARS, Constant.BASE_PHONE1, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_20() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.NUMERIC_CHARS,
				Constant.NUMERIC_CHARS, Constant.BASE_PHONE1, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_21() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.EMPTY, Constant.BASE_PHONE1, CreateAccountScreen.PWD_CFM_FB_XPATH,
				CreateAccountScreen.EMPTY_PWD_CFM_MSG);
	}
	
	@Test
	public void FUNC_01_22() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.FULL_SPACE, Constant.BASE_PHONE1, CreateAccountScreen.PWD_CFM_FB_XPATH,
				CreateAccountScreen.EMPTY_PWD_CFM_MSG);
	}
	
	@Test
	public void FUNC_01_23() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD1, Constant.BASE_PHONE1, CreateAccountScreen.PWD_CFM_FB_XPATH,
				CreateAccountScreen.NOT_MATCH_PWD_MSG);
	}
	
	@Test
	public void FUNC_01_24() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.EMPTY, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_25() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.FULL_SPACE, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_26() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.PHONE_FULL0, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_27() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, "" + Constant.BASE_PHONE1 + " ", CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_28() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.CONTAIN_SPACE_PHONE, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_01_29() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.SPECIAL_CHARS, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_30() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.ALPHABET_CHARS, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_31() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.PHONE_9_CHARS, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_32() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.PHONE_11_CHARS, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_33() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE, CreateAccountScreen.PHONE_FB_XPATH,
				CreateAccountScreen.REGISTED_PHONE_MSG);
	}
	
	@Test
	public void FUNC_01_34() throws Exception {
		CreateAccountScreen.createAccount(driver, Constant.BASE_NAME, Constant.BASE_EMAIL1, Constant.BASE_PASSWORD,
				Constant.BASE_PASSWORD, Constant.BASE_PHONE1, CreateAccountScreen.SUCCESS_MSG_XPATH,
				CreateAccountScreen.SUCCESS_MSG);
	}
}
