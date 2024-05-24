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
import Screen.HomeScreen;
import Screen.SearchScreen;

public class SearchCourse {
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
		Helper.clickItem(driver, HomeScreen.SEARCH_LINK_XPATH);
	}
	
	@After
	public void tearDownForEachTC() throws Exception {
		testcase = name.getMethodName();
		Helper.captureScreen(driver, folder, testcase);
	}

	@AfterClass
	public static void tearDown() throws Exception {
		Helper.shutDownDriver(driver);
	}

	@Test
	public void FUNC_03_01() throws Exception {
		SearchScreen.searchCourse(driver, Constant.EMPTY, SearchScreen.INVALID_KEYWORD_MSG);
	}

	@Test
	public void FUNC_03_02() throws Exception {
		SearchScreen.searchCourse(driver, Constant.FULL_SPACE, SearchScreen.INVALID_KEYWORD_MSG);
	}
	
	@Test
	public void FUNC_03_03() throws Exception {
		SearchScreen.searchCourse(driver, Constant.KEYWORD_4_CHARS, SearchScreen.INVALID_KEYWORD_MSG);
	}
	
	@Test
	public void FUNC_03_04() throws Exception {
		SearchScreen.searchCourse(driver, Constant.KEYWORD_5_CHARS, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_05() throws Exception {
		SearchScreen.searchCourse(driver, Constant.KEYWORD_6_CHARS, Constant.EMPTY);
	}

	@Test
	public void FUNC_03_06() throws Exception {
		SearchScreen.searchCourse(driver, Constant.KEYWORD_ABSOLUTE, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_07() throws Exception {
		SearchScreen.searchCourse(driver, Constant.KEYWORD_RELATIVE, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_08() throws Exception {
		SearchScreen.searchCourse(driver, Constant.KEYWORD_UPPERCASE, Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_09() throws Exception {
		SearchScreen.searchCourse(driver, " " + Constant.KEYWORD_ABSOLUTE + " ", Constant.EMPTY);
	}
	
	@Test
	public void FUNC_03_10() throws Exception {
		SearchScreen.searchCourse(driver, Constant.INVALID_KEYWORD, SearchScreen.UNSUCCESS_SEARCH_MSG);
	}
}
