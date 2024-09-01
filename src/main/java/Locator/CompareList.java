package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePack.BaseClass;

public class CompareList extends BaseClass  {


	public By ComparetoList = By.xpath("(//div[@class=\"price-box price-final_price\"])[6]");
	public By ComparetowidList = By.xpath("(//a[@title=\"Add to Compare\"])[6]");
	public By AddCompareList = By.xpath("//a[text()='comparison list']");
	public By ScrollComapareProducts = By.xpath("//a[@title=\"Push It Messenger Bag\"]");
	public By AddToCart = By.xpath("//span[text()='Add to Cart']");
	public void ComparetoList() throws InterruptedException {
		implicityWait();
		driver.findElement(ComparetoList).click();		
	}
	public void ComparetowidList() {
		driver.findElement(ComparetowidList).click();
		
	}
	public void AddCompareList() {
		driver.findElement(AddCompareList).click();
		
	}
	public void ScrollComapareProducts() {

		WebElement element2 = driver.findElement(ScrollComapareProducts);

		scroll(element2);
	}
	public void AddToCart() throws InterruptedException {
		implicityWait();
		driver.findElement(AddToCart).click();
		
	}
}