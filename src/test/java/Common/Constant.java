package Common;

public class Constant {

	public static final String DRIVER_KEY 			= "webdriver.chrome.driver";
	public static final String DRIVER_KEY_LOCATION 	= System.getProperty("user.dir") + "/src/test/resources/chromedriver.exe";

	// Define general information to access test application
	public static final String BASE_URL1 				= "https://colorme.vn/";
	public static final String BASE_URL2 				= "https://e.colorme.vn/";

	// Username and password to access website
	public static final String BASE_NAME 				= "Hanh test";
	public static final String BASE_EMAIL 			= "hanhhuyen10000@gmail.com";
	public static final String BASE_EMAIL1 			= "hanhtest1@gmail.com";
	public static final String BASE_EMAIL2 			= "hanh1@gmail.com";
	public static final String BASE_PASSWORD 			= "hanh test";
	public static final String BASE_PASSWORD1			= "hanh test 123";
	public static final String BASE_PHONE 			= "0987654321";
	public static final String BASE_PHONE1 			= "0123456789";
	public static final String CONTAIN_SPACE_PHONE	= "0123 456 789";
	
	public static final String EMPTY 					= "";
	public static final String FULL_SPACE 			= "        ";
	public static final String ALPHABET_CHARS 		= "hanhpham";
	public static final String SPECIAL_CHARS			= "@#$%^&*!";
	public static final String NUMERIC_CHARS 			= "0369852741";
	public static final String INVALID_EMAIL 			= "hanh.com";
	public static final String INVALID_SPACE_EMAIL	= "hanh test@gmail.com";
	public static final String INVALID_SPECIAL_EMAIL	= "hanh#$%^&test@gmail.com";
	public static final String PHONE_FULL0 			= "00000000";
	public static final String PHONE_9_CHARS 			= "098765432";
	public static final String PHONE_11_CHARS 		= "01234567890";
	
	public static final String KEYWORD_4_CHARS 		= "han";
	public static final String KEYWORD_5_CHARS 		= "Duyên ";
	public static final String KEYWORD_6_CHARS 		= "Nguyên";
	public static final String KEYWORD_ABSOLUTE		= "Nguyễn Việt Hùng ";
	public static final String KEYWORD_RELATIVE		= "Phạm Dũng";
	public static final String KEYWORD_UPPERCASE		= "NGUYỄN VIỆT HÙNG";
	public static final String INVALID_KEYWORD		= "test search";

	public static final String INVALID_CODE			= "123456";
	
	public static final String EMAIL_VALUE			= "{Email}";
	
	public static final String BASE_DESCRIPTION		= "Phạm Hạnh 2002 Thái Bình";
	public static final String BASE_USERNAME		= "HanhPham";
	public static final String BASE_UNIVERSITY		= "Trường Đại học ông Nghiệp Hà Nội (HAUI)";
	public static final String BASE_WORK			= "Nơi làm việc";
	public static final String BASE_CITY			= "Quê quán Hưng Hà, Thái Bình, hiện đang tạm trú tạm vắng tại Bắc Từ Liêm, Hà Nội";
}
