import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import org.openqa.selenium.Keys
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.chrome.ChromeOptions
import org.openqa.selenium.remote.DesiredCapabilities
import spock.lang.Specification
import java.time.Duration;



class UINetcompanyTests extends Specification {

    static WebDriver driver = new ChromeDriver();



    def "find and play video"(){

        given:
            driver.manage().window().maximize();
            driver.navigate().to("https://www.youtube.com")
            JavascriptExecutor js = (JavascriptExecutor) driver;

            js.executeScript("window.scrollBy(0,250)", "");

            driver.findElement(By.xpath("/html/body/ytd-app/ytd-consent-bump-v2-lightbox/tp-yt-paper-dialog/div[4]/div[2]/div[5]/div[2]/ytd-button-renderer[2]/a/tp-yt-paper-button/yt-formatted-string")).click()

        driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys("netcompany")
        driver.findElement(By.xpath("/html[1]/body[1]/ytd-app[1]/div[1]/div[1]/ytd-masthead[1]/div[3]/div[2]/ytd-searchbox[1]/form[1]/div[1]/div[1]/input[1]")).sendKeys(Keys.ENTER)
            Thread.sleep(2000)



    }


}