package Screen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import Common.Helper;

public class SearchScreen {
	public static String KEYWORD_TXT_XPATH 			= "//input[@id='search']";
	public static String USERS_XPATH 				= "//div[@id='printSearch-users']";
	public static String POSTS_XPATH 				= "//div[@id='printSearch-products']";
	
	public static String INVALID_KEYWORD_MSG_XPATH 	= "//div[@class='toast-message']";
	public static String UNSUCCESS_SEARCH_MSG_XPATH = "//div[@class='ms-4']";
	
	public static String INVALID_KEYWORD_MSG 		= "Từ khóa tìm kiếm phải > 4 ký tự";
	public static String UNSUCCESS_SEARCH_MSG 		= "Không tìm thấy người dùng";
	
	public static void searchCourse(WebDriver driver, String keyword, String errorMsg) throws Exception {
		Helper.sendKeys(driver, KEYWORD_TXT_XPATH, keyword);
		Helper.pressKeys(driver, KEYWORD_TXT_XPATH, Keys.ENTER);
		if (errorMsg == INVALID_KEYWORD_MSG) {
			Helper.assertTextValue(driver, INVALID_KEYWORD_MSG_XPATH, errorMsg);
		}
		else if (errorMsg == UNSUCCESS_SEARCH_MSG) {
			Helper.assertTextValue(driver, UNSUCCESS_SEARCH_MSG_XPATH, errorMsg);
			Helper.assertElementNotDisplayed(driver, POSTS_XPATH);
		}
		else {
			TimeUnit.SECONDS.sleep(3);
			Helper.assertElementDisplayed(driver, USERS_XPATH);
			Helper.assertElementDisplayed(driver, POSTS_XPATH);
		}
	}
}
