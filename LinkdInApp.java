package com.xworkz.locatorsprograms;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LinkdInApp {

	public static void main(String[] args) {
		
		WebDriver lkdin = new ChromeDriver();
		lkdin.manage().window().maximize();
		lkdin.get("https://www.linkedin.com/home");
		
		By emailIdField = By.id("session_key");
		WebElement emailField = lkdin.findElement(emailIdField);
		emailField.click();
		emailField.sendKeys("Aisha@gmail.com");
		
		By passrdField = By.name("session_password");
		WebElement passwordField = lkdin.findElement(passrdField);
		passwordField.click();
		passwordField.sendKeys("Aisha@123");
		
		By logIn = By.className("sign-in-form__submit-button");
		WebElement loginField = lkdin.findElement(logIn);
		loginField.click();
		
		lkdin.get("https://www.linkedin.com/home");
		
		By frgotPasswrd = By.partialLinkText("Forgot");
		WebElement fPasswrd = lkdin.findElement(frgotPasswrd);
		fPasswrd.click();
		
		
	}

}
