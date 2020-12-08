package FirefoxExample;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.util.concurrent.TimeUnit;

public class BestBuyHome {
    public static void main(String[] args) {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\Mohammed Ali\\IdeaProjects\\SeleniumProject1\\Driver\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://www.bestbuy.com/");
        driver.manage().window().fullscreen();
//       driver.findElement(By.id("gh-search-input"))
//       .sendKeys("Samsung Dryer", Keys.ENTER);
//        driver.findElement(By.id("gh-search-input"))
//              .clear();
      driver.findElement(By.id("gh-search-input"))
        .sendKeys("Sound Bar", Keys.ENTER);
      
     }

}
