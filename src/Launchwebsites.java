import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.junit.Test;
//
public class Launchwebsites {

	private WebDriver driver;

	@Before
	public void setUp() throws Exception {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\May2017\\Webdrivers\\chromedriver_win32\\chromedriver.exe");
		this.driver = new ChromeDriver();
	}
	
	@Test
	public void testW3schools() throws Exception {
		this.driver.get("http://www.w3schools.com");
		assertEquals("W3Schools Online Web Tutorials", this.driver.getTitle());
	}
	
	@Test
	public void testGoogle() throws Exception {
		this.driver.get("http://www.google.com");
		assertEquals("Google", this.driver.getTitle());
	}

	@After
	public void tearDown() throws Exception {
		this.driver.quit();
	}

}
