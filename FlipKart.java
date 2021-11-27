package com.xworkz.shoopingapps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class FlipKart {

	public static void main(String[] args) {

		WebDriver flipkrt = new FirefoxDriver();
		
		System.out.println("Firefox web strated");
		
		flipkrt.get("https://www.flipkart.com/");
		
		flipkrt.close();

	}

}
