package sss;

import java.time.Duration;

import javax.swing.plaf.basic.BasicSliderUI.ActionScroller;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import net.bytebuddy.asm.Advice.Enter;

public class Currencyconvertion {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://www.xe.com");
		
		Actions act1=new Actions(driver);
		act1.moveToElement(driver.findElement(By.id("midmarketFromCurrency"))).click();
		act1.sendKeys("IND");
		act1.sendKeys(Keys.ENTER).build().perform();
		Actions act2=new Actions(driver);
		
		act2.moveToElement(driver.findElement(By.id("midmarketToCurrency"))).click();
		
		
		act2.sendKeys("USD");
		act2.sendKeys(Keys.ENTER).build().perform();
		Actions act3=new Actions(driver);
		act3.moveToElement(driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[1]/div[1]")));
		act3.click();
		act3.sendKeys(Keys.CLEAR);
		act3.sendKeys("10").build().perform();
		
		
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/button")).click();
		Thread.sleep(5000);
		driver.findElement(By.id("yie-close-button-9492635e-55f5-52a1-8eef-e85504109139")).click();

	
		String s=driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[2]/section/div[2]/div/main/form/div[2]/div[1]/p[2]")).getText();
		System.out.println(s);
		driver.close();

	}

}
