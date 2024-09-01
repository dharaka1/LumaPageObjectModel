package Locator;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class AddTowidlist extends BaseClass{
	public By AddtoWidlist = By.xpath("//a[@class=\"action towishlist\"]");

	public void AddtoWidlist() {
		driver.findElement(AddtoWidlist).click();
		
	}

}
