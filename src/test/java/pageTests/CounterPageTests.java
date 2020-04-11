package pageTests;

import org.junit.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import pageObjects.CounterPage;

import java.util.concurrent.TimeUnit;

public class CounterPageTests {

    protected static WebDriver driver;

    @BeforeClass
    public static void setUp() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterClass
    public static void tearDown() {
        driver.quit();
    }

    @After
    public void cleanUp() {
        driver.manage().deleteAllCookies();
    }

    @Test
    public void counterTest() {
        driver.get("https://groomwall.github.io/finalAssignment/");
        CounterPage buttonsPage = new CounterPage(driver);
        buttonsPage.getCounterValue();
        buttonsPage.incrementeClick();
        buttonsPage.incrementeClick();
        Assert.assertEquals("2", buttonsPage.getCounterValue());
        buttonsPage.decrementeClick();
        buttonsPage.decrementeClick();
        buttonsPage.decrementeClick();
        Assert.assertEquals("-1", buttonsPage.getCounterValue());
    }
}
