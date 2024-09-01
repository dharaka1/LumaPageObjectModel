package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePack.BaseClass;

public class RemoveFromCart extends BaseClass {

	public void scrollMyCart() {
		WebElement scrollMyCart = driver.findElement(By.xpath("	//a[@title=\"Compare Products\"]"));

		scroll(scrollMyCart);
	}

	public static By Mycart = By.xpath("//a[@class=\"action showcart\"]");

	public void Mycart() throws InterruptedException {
		implicityWait();
		driver.findElement(Mycart).click();
	}

	public static By RemoveFromMycart = By.xpath("//a[@title=\"Remove item\"]");

	public void RemoveFromMycart() {
		driver.findElement(RemoveFromMycart).click();
	}

	public static By ClickOK = By.xpath("//span[text()='OK']");

	public void ClickOK() throws InterruptedException {
		implicityWait();
		driver.findElement(ClickOK).click();
	}

}
