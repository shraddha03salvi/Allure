import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Application 
{

	public static WebDriver driver;
	@BeforeClass
	public void before() 
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
	}
	@Test
	public void testcase1() {
		HomePage HomePage1 = PageFactory.initElements(driver, HomePage.class);
		HomePage1.search("samsung s10");
	}
	@Test
	public void testcase2() {
		System.out.println("This is testcase 2");
	}
	@Test
	public void testcase3() {
		System.out.println("This is testcase 3");
	}
}
