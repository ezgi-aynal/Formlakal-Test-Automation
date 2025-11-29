import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class UserRegisteringTest {

    private static WebDriver driver;

    @BeforeAll
    public void setup() {

        System.setProperty("webdriver.chrome.driver", "/Users/sudenurarslan/Desktop/drivers/chromedriver");


        ChromeOptions options = new ChromeOptions();
        options.addArguments("--start-maximized");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);


        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    public static Stream<Arguments> userInfoStream() {
        return Stream.of(
                Arguments.of("sudenurarslan@hotmail.com", "Sudenur Arslan", "sudearslan", "Test1234!", "Test1234!", true),
                Arguments.of("sudenurarslan.com", "Sudenur Arslan", "sudenurarslan", "Test5678!", "Test5678!", false),
                Arguments.of("ezgiaynal@gmail.com", "Ezgi Aynal", "ezgiaynal", "Test5678!", "Test5678!", true),
                Arguments.of("ezgiaynalexamplcom", "Ezgi Aynal", "ezgiiaynal", "Test5678!", "Test5678!", false),
                Arguments.of("sudee@hotmail.com", "Sudenur Arslan", "sudears", "Test5678!", "Test5678!", true),
                Arguments.of("ezgii@gmail.com", "Ezgi Aynal", "ezgi123", "Test5678!", "Test5678!", true),
                Arguments.of("ezgiiaynl@gmail.com", "Ezgi Aynal", "ezgiiaynl", "Test1234!", "Test1234!", true),
                Arguments.of("sudeeyahoocom", "Sudenur Arslan", "sude123", "Test5678!", "Test5678!", false)
        );
    }

    @ParameterizedTest
    @MethodSource("userInfoStream")
    public void testSignUp(String email, String name, String username, String password, String confirmPassword, boolean expectedResult)
            throws InterruptedException {
        driver.get("https://www.formlakal.com/kayit/");

        try {
            WebElement cookieAcceptButton = driver.findElement(By.id("CybotCookiebotDialogBodyLevelButtonLevelOptinAllowAll"));
            cookieAcceptButton.click();
        } catch (Exception e) {
            System.out.println("Cookie notification not found or already turned off.");
        }

        WebElement emailField = driver.findElement(By.id("loginfield1"));
        WebElement nameField = driver.findElement(By.id("loginfield2"));
        WebElement usernameField = driver.findElement(By.id("loginfield3"));
        WebElement passwordField = driver.findElement(By.id("loginfield4"));
        WebElement confirmPasswordField = driver.findElement(By.id("loginfield5"));
        WebElement personalDataCheckbox = driver.findElement(By.id("loginfield8_1"));
        WebElement marketingCheckbox = driver.findElement(By.xpath("//*[@id=\"form-kayit-form\"]/div[10]/div/ins"));
        WebElement signUpButton = driver.findElement(By.xpath("//*[@id=\"form-kayit-form\"]/div[11]/input"));

        emailField.sendKeys(email);
        nameField.sendKeys(name);
        usernameField.sendKeys(username);
        passwordField.sendKeys(password);
        confirmPasswordField.sendKeys(confirmPassword);

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", personalDataCheckbox);
        personalDataCheckbox.click();
        marketingCheckbox.click();
        signUpButton.click();


        boolean actualResult = isSignUpSuccessful();

        assertTrue(actualResult == expectedResult);


        emailField.clear();
        nameField.clear();
        usernameField.clear();
        passwordField.clear();
        confirmPasswordField.clear();
        personalDataCheckbox.click();
    }

    private boolean isSignUpSuccessful() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        try {
            WebElement successMessage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("success-message-id")));
            return successMessage.isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }

    @AfterAll
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}


