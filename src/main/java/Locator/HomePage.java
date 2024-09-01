package Locator;

import org.openqa.selenium.By;

import BasePack.BaseClass;

public class HomePage extends BaseClass {

	public By Login = By.xpath("//li[@class='authorization-link']");
	public By user = By.xpath("//input[@name='login[username]']");
	public By pass = By.xpath("//input[@name=\"login[password]\"]");
	public By Signin = By.xpath("//span[text()='Sign In']");

	public void Login() {

		driver.findElement(Login).click();
	}

	public void user() {

		driver.findElement(user).sendKeys("gayathridharaka@gmail.com");

	}

	public void pass() {
		driver.findElement(pass).sendKeys("Gayathri123456");

	}

	public void Signin() {
		driver.findElement(Signin).click();

	}

}