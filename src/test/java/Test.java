import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
    WebDriver driver;

    public void launchBrowser(){
        System.setProperty("webdriver.chrome.driver","C:\\Users\\rapha\\Documents\\Selenium_Test_1\\Desafio_Selenium\\Chrome_Driver_94");
        driver = new ChromeDriver();
        driver.get("http://sampleapp.tricentis.com/101/app.php");

    }
}
