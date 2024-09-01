package Locator;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class shoppingcart extends BaseClass {
	public By ShoppingCart = By.xpath("//a[@data-bind=\"scope: 'minicart_content'\"]");
	public By Edite = By.xpath("//a[@class=\"action edit\"]");
	public By update = By.xpath("//button[@id=\"product-updatecart-button\"]");
	public void ShoppingCart() throws InterruptedException {
		implicityWait();
		driver.findElement(ShoppingCart).click();
		
	}
	public void Edite() {
		driver.findElement(Edite).click();
		
	}
	public void update() {
		driver.findElement(update).click();
		
	}

}
