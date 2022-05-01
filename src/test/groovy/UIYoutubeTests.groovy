import org.openqa.selenium.WebDriver
import org.openqa.selenium.WebElement
import org.openqa.selenium.chrome.ChromeDriver
import spock.lang.Specification

class UIYoutubeTests extends Specification{


    private static def WebDriver driver = new ChromeDriver()


    def "cleanupSpec"() {
        if(driver != null) {
            driver.close()
        }
    }
    def "search and load Netcompany video"(){
        given:
            driver.navigate().to("https://www.google.com")
        println
            WebElement consent = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div[3]/span/div/div/div/div[3]/button[2]"))
        when:
            consent.click()
            searchBox.sendKeys("India")
            Thread.sleep(5000)
            submitSearchButton.click()
            def title = driver.getTitle()
        then:
            title.toLowerCase()contains("india")
    }
}
