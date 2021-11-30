package com.xworkz.locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class InstaApp {

	public static void main(String[] args) {
		WebDriver insta = new ChromeDriver();
		insta.manage().window().maximize();
		insta.get("https://www.instagram.com/");
		
		By emailIdField = By.name("username");
		WebElement emailField = insta.findElement(emailIdField);
		emailField.click();
		emailField.sendKeys("Aisha@gmail.com");
		
		By passrdField = By.name("password");
		WebElement passwordField = insta.findElement(passrdField);
		passwordField.click();
		passwordField.sendKeys("Aisha@123");
		
		By logIn = By.className("             qF0y9          Igw0E     IwRSH      eGOV_         _4EzTm    bkEs3                          CovQj                  jKUp7          DhRcB ");
		WebElement loginField = insta.findElement(logIn);
		loginField.click();
		
//		insta.get("https://www.facebook.com/");
		
	}

}
