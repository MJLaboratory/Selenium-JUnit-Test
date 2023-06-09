//added any comments
//added two comment4
// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class UntitledTest {
  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void untitled() throws InterruptedException {
    // Test name: Untitled
    // Step # | name | target | value
    // 1 | open | /search?q=happy&source=hp&ei=OjRrZLu4Duex2roP97OF2Aw&iflsig=AOEireoAAAAAZGtCSh9s7GG-uNJZ2V84wVpehR4ThABS&ved=0ahUKEwi7vbbtzIj_AhXnmFYBHfdZAcsQ4dUDCAs&uact=5&oq=happy&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCC4QgAQQsQMQgwEyCwguENQCELEDEIAEMggIABCABBCxAzILCAAQgAQQsQMQgwEyBAgAEAMyCwguEIAEELEDEIMBMg4ILhCABBCxAxDHARDRAzIECC4QAzoRCC4QgAQQsQMQgwEQxwEQ0QM6BQgAEIAEOggILhCABBDUAjoLCC4QgAQQsQMQ1AI6DgguEIAEELEDEIMBENQCUABY7AZgjAloAHAAeACAAX2IAdgEkgEDMC41mAEAoAEB&sclient=gws-wiz | 
    driver.get("https://www.google.com/search?q=happy&source=hp&ei=OjRrZLu4Duex2roP97OF2Aw&iflsig=AOEireoAAAAAZGtCSh9s7GG-uNJZ2V84wVpehR4ThABS&ved=0ahUKEwi7vbbtzIj_AhXnmFYBHfdZAcsQ4dUDCAs&uact=5&oq=happy&gs_lcp=Cgdnd3Mtd2l6EAMyCwgAEIAEELEDEIMBMgsIABCABBCxAxCDATILCC4QgAQQsQMQgwEyCwguENQCELEDEIAEMggIABCABBCxAzILCAAQgAQQsQMQgwEyBAgAEAMyCwguEIAEELEDEIMBMg4ILhCABBCxAxDHARDRAzIECC4QAzoRCC4QgAQQsQMQgwEQxwEQ0QM6BQgAEIAEOggILhCABBDUAjoLCC4QgAQQsQMQ1AI6DgguEIAEELEDEIMBENQCUABY7AZgjAloAHAAeACAAX2IAdgEkgEDMC41mAEAoAEB&sclient=gws-wiz");
    // 2 | setWindowSize | 868x1020 |
    Thread.sleep(1000);
    driver.manage().window().setSize(new Dimension(868, 1020));
    // 3 | mouseOver | css=.g:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) .ct3b9e:nth-child(1) .TbwUpd:nth-child(3) .VuuXrf:nth-child(1) | 
    {
      WebElement element = driver.findElement(By.cssSelector(".g:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) .ct3b9e:nth-child(1) .TbwUpd:nth-child(3) .VuuXrf:nth-child(1)"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element).perform();
    }
    Thread.sleep(1000);
    // 4 | mouseOut | css=.g:nth-child(2) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) .ct3b9e:nth-child(1) .TbwUpd:nth-child(3) .VuuXrf:nth-child(1) | 
    {
      WebElement element = driver.findElement(By.tagName("body"));
      Actions builder = new Actions(driver);
      builder.moveToElement(element, 0, 0).perform();
    }
    Thread.sleep(1000);
    // 5 | click | css=.g:nth-child(2) > div > div > div .ct3b9e .LC20lb | 
    driver.findElement(By.cssSelector(".g:nth-child(2) > div > div > div .ct3b9e .LC20lb")).click();
    // 6 | runScript | window.scrollTo(0,300) |
    Thread.sleep(1000);
    js.executeScript("window.scrollTo(0,300)");
    // 7 | runScript | window.scrollTo(0,396.6666564941406) |
    Thread.sleep(1000);
    js.executeScript("window.scrollTo(0,396.6666564941406)");
    // 8 | click | css=.style-scope:nth-child(2) > #dismissible .yt-core-image--fill-parent-height | 
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".style-scope:nth-child(2) > #dismissible .yt-core-image--fill-parent-height")).click();
    // 9 | runScript | window.scrollTo(0,0) | 
    Thread.sleep(1000);
    js.executeScript("window.scrollTo(0,0)");
    // 10 | runScript | window.scrollTo(0,180.6666717529297) | 
    Thread.sleep(1000);
    js.executeScript("window.scrollTo(0,180.6666717529297)");
    // 11 | click | css=.video-stream | 
    Thread.sleep(1000);
    driver.findElement(By.cssSelector(".video-stream")).click();
    // 12 | close |  |
    Thread.sleep(1000);
    driver.close();
  }
}
