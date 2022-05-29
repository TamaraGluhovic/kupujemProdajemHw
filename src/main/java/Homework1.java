import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

    public static void main(String[] args) {

                System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tamara\\IdeaProjects\\chromedriver_win32\\chromedriver.exe");
                WebDriver driver = new ChromeDriver();
                driver.manage().window().maximize();


                driver.navigate().to("https://www.kupujemprodajem.com/");

                WebElement exitFromPopUp = driver.findElement(By.className("kpBoxCloseButton"));
                exitFromPopUp.click();
                WebElement clickSearch = driver.findElement(By.xpath("//*[@id='searchKeywordsInput']"));
                clickSearch.sendKeys(" iphone 13");
                WebElement pressEnterToSeeAds = driver.findElement(By.name("submit[search]"));
                pressEnterToSeeAds.submit();
                WebElement chooseFirstAd = driver.findElement(By.id("adDescription7321776"));
                chooseFirstAd.click();
                driver.close();
    }
}
