import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class FormlaKalLoginTest {
    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/sudenurarslan/Desktop/drivers/chromedriver");

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);

        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("https://www.formlakal.com/giris/");

        try {
            WebElement cookieAcceptButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
            cookieAcceptButton.click();
        } catch (Exception e) {
            System.out.println("Cookie notification not found or already turned off.");
        }

        Thread.sleep(1000);

        WebElement email = driver.findElement(By.id("loginfield1"));
        email.sendKeys("ezgiaynal@gmail.com");
        Thread.sleep(1000);

        WebElement password = driver.findElement(By.id("loginfield2"));
        password.sendKeys("ezgi123");
        Thread.sleep(1000);

        WebElement kayitolButon = driver.findElement(By.xpath("//*[@id=\"form-login-form\"]/div[4]/input"));
        kayitolButon.click();
        Thread.sleep(2000);

        String expectedUrl = "https://www.formlakal.com/hesabim/";
        assertEquals("Giriş başarısız!", expectedUrl, driver.getCurrentUrl());
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


