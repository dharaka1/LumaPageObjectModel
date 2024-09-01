package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePack.BaseClass;

public class CheckOut extends BaseClass {
	public By Scroll5 = By.xpath("//tr[@class=\"grand totals\"]");
	public By CheckOut = By.xpath("//button[@data-role=\"proceed-to-checkout\"]");
	public By ScrollIntoShipping = By.xpath("//div[text()='Shipping Address']");

	public void Scroll5() throws InterruptedException {

		implicityWait();

		WebElement element3 = driver.findElement(Scroll5);

		scroll(element3);
	}

	public void CheckOut() {
		driver.findElement(CheckOut).click();
	}

	public void ScrollIntoShipping() {

		WebElement element4 = driver.findElement(ScrollIntoShipping);

		scroll(element4);		
	}
}
