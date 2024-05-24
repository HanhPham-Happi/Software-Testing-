package Screen;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import Common.Helper;

public class UpdateProfileScreen {
	public static String UPDATE_PROFILE_BTN_XPATH 	= "//button[contains(text(),'Sửa thông tin')]";
	
	public static String DESCRIPTION_TXT_XPATH 		= "//input[@name='description']";
	public static String USERNAME_TXT_XPATH 		= "//input[@name='username']";
	public static String UNIVERSITY_TXT_XPATH 		= "//input[@name='university']";
	public static String WORK_TXT_XPATH 			= "//input[@name='work']";
	public static String CITY_TXT_XPATH 			= "//input[@name='city']";
	
	public static String SAVE_BTN_XPATH 			= "//button[@id='submitUser']";
	
	public static String MSG_XPATH 					= "//div[@id='swal2-html-container']";
	
	public static String EMPTY_DESCRIPTION_MSG		= "Vui lòng nhập mô tả về bạn";
	public static String EMPTY_USERNAME_MSG 		= "Vui lòng nhập username riêng";
	public static String EMPTY_UNIVERSITY_MSG		= "Vui lòng nhập trường học";
	public static String EMPTY_WORK_MSG 			= "Vui lòng nhập nơi làm việc";
	public static String EMPTY_CITY_MSG 			= "Vui lòng nhập địa điểm";
	public static String SUCCESS_MSG 				= "Cập nhật thành công";
	
	public static void openScreen(WebDriver driver) throws Exception {
		Helper.clickItem(driver, HomeScreen.USERNAME_LABEL_XPATH);
		Helper.clickItem1(driver, HomeScreen.PROFILE_LINK_XPATH);
		Helper.clickItem1(driver, UPDATE_PROFILE_BTN_XPATH);
		TimeUnit.SECONDS.sleep(3);
	}
	
	public static void updateProfile(WebDriver driver, String description, String username, String university, String work, String city, String expectedMsg) throws Exception {
		Helper.sendKeys(driver, DESCRIPTION_TXT_XPATH, description);
		Helper.sendKeys(driver, USERNAME_TXT_XPATH, username);
		Helper.sendKeys(driver, UNIVERSITY_TXT_XPATH, university);
		Helper.sendKeys(driver, WORK_TXT_XPATH, work);
		Helper.sendKeys(driver, CITY_TXT_XPATH, city);
		Helper.clickItem(driver, SAVE_BTN_XPATH);
		TimeUnit.SECONDS.sleep(3);
		Helper.assertTextValue(driver, MSG_XPATH, expectedMsg);
	}
}
