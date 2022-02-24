package sss;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ascending_order_list_items {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrom.driver","chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		Select x=new Select(driver.findElement(By.id("searchDropdownBox")));
		List<WebElement> y=x.getOptions();
		
		String item1=null;
		String item2=null;
		boolean h=true;
		for(int i=2;i<y.size();i++){
			item1=y.get(i-1).getText();
			item2=y.get(i).getText();
			
			if(item2.compareTo(item1)<0){	
			h=false;
			break;
		}
		}
	if(h){
		System.out.println("items are in ascending order");
	}else{
		System.out.println("items are not in ascending order");
	}
		
		
	
	}
}
