package com.xworkz.locatorsprograms;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBookApp {

	public static void main(String[] args) {
		WebDriver faceBook = new ChromeDriver();
		faceBook.manage().window().maximize();
		faceBook.get("https://www.facebook.com/");
		
		By emailIdField = By.id("email");
		WebElement emailField = faceBook.findElement(emailIdField);
		emailField.click();
		emailField.sendKeys("Aisha@gmail.com");
		
		By passrdField = By.name("pass");
		WebElement passwordField = faceBook.findElement(passrdField);
		passwordField.click();
		passwordField.sendKeys("Aisha@123");
		
		By logIn = By.name("login");
		WebElement loginField = faceBook.findElement(logIn);
		loginField.click();
		
	}

}
