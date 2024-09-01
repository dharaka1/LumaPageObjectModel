package Locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BasePack.BaseClass;

public class Scroll  extends BaseClass{


		public By Scroll = By.xpath(" //a[@title=\"Push It Messenger Bag\"]");

		public void Scroll() throws InterruptedException {
			implicityWait();

			WebElement element1 = driver.findElement(Scroll);

			scroll(element1);			
		}

	}
