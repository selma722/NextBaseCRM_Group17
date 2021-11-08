package TestCases;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TC_002 {

    public static void main(String[] args) {
        String url = "https://login2.nextbasecrm.com/";
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get(url);

        //locate username field
        WebElement usernameField = driver.findElement(By.cssSelector("input[type='text']"));
        usernameField.sendKeys("marketing35@cybertekschool.com"+ Keys.TAB + "UserUser" + Keys.ENTER);

        //    WebElement submitButton = driver.findElement(By.cssSelector("input[type='submit']"));
        //    submitButton.click();

        String expectedResult = "https://login2.nextbasecrm.com/stream/?login=yes";
        String actualResult = driver.getCurrentUrl();
        if(expectedResult.equals(actualResult)){
            System.out.println("Successfully logged in");
        }else{
            System.out.println("Login Failed");
        }

    }
}
