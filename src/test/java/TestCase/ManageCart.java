package TestCase;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TestName;
import org.openqa.selenium.WebDriver;

import Common.Helper;
import Common.Constant;
import Screen.HomeScreen;

public class ManageCart {
	private static WebDriver driver;
	private String folder = this.getClass().getName();;
	private String testcase;
	@Rule
	public TestName name = new TestName();

	@BeforeClass
	public static void setUp() throws Exception {
		
		driver = Helper.initWebDriver(Constant.BASE_URL2);
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
	public void FUNC_04_01() throws Exception {
		Helper.clickItem(driver, HomeScreen.ADD_TO_CART_BTN_XPATH.replace("INDEX", "1"));
		Helper.assertTextValue(driver, HomeScreen.ADD_TO_CART_MSG_XPATH, HomeScreen.ADD_TO_CART_MSG);
	}
	
	@Test
	public void FUNC_04_02() throws Exception {
		Helper.clickItem(driver, HomeScreen.ADD_TO_CART_BTN_XPATH.replace("INDEX", "1"));
		Helper.assertTextValue(driver, HomeScreen.TOTAL_QTY_ICON_XPATH, "1");
	}
	
	@Test
	public void FUNC_04_03() throws Exception {
		Helper.clickItem(driver, HomeScreen.ADD_TO_CART_BTN_XPATH.replace("INDEX", "2"));
		Helper.assertTextValue(driver, HomeScreen.ADD_TO_CART_MSG_XPATH, HomeScreen.ADD_TO_CART_MSG);
	}
	
	@Test
	public void FUNC_04_04() throws Exception {
		Helper.clickItem(driver, HomeScreen.CART_ICON_XPATH);
		Helper.clickItem(driver, HomeScreen.REMOVE_ITEM_BTN_XPATH.replace("INDEX", "2"));
		Helper.assertTextValue(driver, HomeScreen.TOTAL_QTY_ICON_XPATH, "1");
	}
	
	@Test
	public void FUNC_04_05() throws Exception {
		Helper.clickItem(driver, HomeScreen.CART_ICON_XPATH);
		Helper.clickItem(driver, HomeScreen.REMOVE_ITEM_BTN_XPATH.replace("INDEX", "1"));
		Helper.assertTextValue(driver, HomeScreen.EMPTY_CART_MSG_XPATH, HomeScreen.EMPTY_CART_MSG);
	}
}
