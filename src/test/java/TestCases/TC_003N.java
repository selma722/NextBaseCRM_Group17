package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_003N {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        String url = "https://login2.nextbasecrm.com/";
        driver.get(url);

        WebElement loginBox = driver.findElement(By.xpath("//input[@placeholder='Login']"));
        loginBox.sendKeys("hr35@cybertekschool.com");

        Thread.sleep(1234);

        WebElement passwordBox = driver.findElement(By.xpath("//input[@placeholder='Password']"));
        passwordBox.sendKeys("");

        Thread.sleep(1234);

        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        Thread.sleep(1234);

        String expTitle = driver.getTitle();
        String actTitle = "Authorization";

        System.out.println(expTitle.equals(actTitle) ? "scenario passed" : "scenario failed");


        //driver.quit();

    }
}
