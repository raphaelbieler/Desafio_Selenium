import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","D:\\ProgramFiles\\SELENIUM\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");

    }
}
