package TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import Common.Helper;
import Common.Constant;
import Screen.HomeScreen;
import Screen.RegisterCourseScreen;

public class RegisterCourse {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void setUp() throws Exception {
		driver = Helper.initWebDriver(Constant.BASE_URL1);
		Helper.clickItem(driver, HomeScreen.COURSE_LINK_XPATH);
	}

	@Before
	public void setUpForEachTC() throws Exception {
		Helper.clickItem(driver, RegisterCourseScreen.REGISTER_NOW_BTN_XPATH);
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
	public void FUNC_05_01() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.EMPTY, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.EMAIL_FB_XPATH, RegisterCourseScreen.EMPTY_EMAIL_MSG);
	}

	@Test
	public void FUNC_05_02() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.FULL_SPACE, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.EMAIL_FB_XPATH, RegisterCourseScreen.EMPTY_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_03() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.INVALID_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.EMAIL_FB_XPATH, RegisterCourseScreen.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_04() throws Exception {
		RegisterCourseScreen.registerCourse(driver, " " + Constant.BASE_EMAIL + " ", Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_05() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.INVALID_SPACE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.EMAIL_FB_XPATH, RegisterCourseScreen.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_06() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.INVALID_SPECIAL_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.EMAIL_TXT_XPATH, RegisterCourseScreen.INVALID_EMAIL_MSG);
	}
	
	@Test
	public void FUNC_05_07() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_08() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.EMPTY, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.NAME_FB_XPATH, RegisterCourseScreen.EMPTY_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_09() throws Exception {
		
		  RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL,
		  Constant.FULL_SPACE, Constant.BASE_PHONE1, Constant.EMPTY,
		  RegisterCourseScreen.COUPON_CODE_FB_XPATH, RegisterCourseScreen.EMPTY_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_10() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, " " + Constant.BASE_NAME + " ", Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_11() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_12() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.SPECIAL_CHARS, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.NAME_TXT_XPATH, RegisterCourseScreen.INVALID_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_13() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.NUMERIC_CHARS, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.NAME_TXT_XPATH, RegisterCourseScreen.INVALID_NAME_MSG);
	}
	
	@Test
	public void FUNC_05_14() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.EMPTY,
				Constant.EMPTY, RegisterCourseScreen.PHONE_FB_XPATH, RegisterCourseScreen.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_15() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.FULL_SPACE,
				Constant.EMPTY, RegisterCourseScreen.PHONE_TXT_XPATH, RegisterCourseScreen.EMPTY_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_16() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.PHONE_FULL0,
				Constant.EMPTY, RegisterCourseScreen.PHONE_TXT_XPATH, RegisterCourseScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_17() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, " " + Constant.BASE_PHONE1 + " ",
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_18() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.CONTAIN_SPACE_PHONE,
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_19() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.SPECIAL_CHARS,
				Constant.EMPTY, RegisterCourseScreen.PHONE_TXT_XPATH, RegisterCourseScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_20() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.ALPHABET_CHARS,
				Constant.EMPTY, RegisterCourseScreen.PHONE_TXT_XPATH, RegisterCourseScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_21() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.PHONE_9_CHARS,
				Constant.EMPTY, RegisterCourseScreen.PHONE_TXT_XPATH, RegisterCourseScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_22() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.PHONE_11_CHARS,
				Constant.EMPTY, RegisterCourseScreen.PHONE_TXT_XPATH, RegisterCourseScreen.INVALID_PHONE_MSG);
	}
	
	@Test
	public void FUNC_05_23() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Test
	public void FUNC_05_24() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.FULL_SPACE, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
	
	@Ignore
	@Test
	public void FUNC_05_25() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.INVALID_CODE, RegisterCourseScreen.COUPON_CODE_FB_XPATH, RegisterCourseScreen.INVALID_COUPON_CODE_MSG);
	}
	
	@Test
	public void FUNC_05_26() throws Exception {
		RegisterCourseScreen.registerCourse(driver, Constant.BASE_EMAIL, Constant.BASE_NAME, Constant.BASE_PHONE1,
				Constant.EMPTY, RegisterCourseScreen.SUCCESS_MSG_XPATH, RegisterCourseScreen.SUCCESS_MSG);
	}
}
