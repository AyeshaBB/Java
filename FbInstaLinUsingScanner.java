package com.xworkz.locatorsprograms;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class FbInstaLinUsingScanner {

	public static void main(String[] args) {
		
		System.out.println("Please Enter the Input");

		Scanner sc = new Scanner(System.in);
		String choice = sc.next();
		
		if (choice.equalsIgnoreCase("facebook")) {
			callFaceBook();
		}
		else if (choice.equalsIgnoreCase("Insta")) {
			callInsta();
		}
		else if (choice.equalsIgnoreCase("linkdin")) {
			callLinkdIn();
		}
		else {
			System.out.println("Enter the valid input");
		}
	}
	
	public static void callFaceBook() {
		
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
	
	public static void callInsta() {
		
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
		
	}
	
	public static void callLinkdIn() {
		
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
