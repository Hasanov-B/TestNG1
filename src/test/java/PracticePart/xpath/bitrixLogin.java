package PracticePart.xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.BrowserFactory;
import utils.BrowserUtils;

public class bitrixLogin {

    public static void main(String[] args) {


        WebDriver driver= BrowserFactory.getDriver("chrome");
        driver.get("https://login1.nextbasecrm.com/?login=yes");
        driver.findElement(By.xpath("//input[@name='USER_LOGIN']")).sendKeys("helpdesk59@cybertekschool.com");
driver.findElement(By.xpath("//*[@placeholder='Password']")).sendKeys("UserUser");
        driver.findElement(By.xpath("//input[starts-with(@value, 'Log')]")).click();
        BrowserUtils.wait(3);
driver.quit();

    }

}
