package com.xworkz.shoopingapps;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonFlipkartScanner {

	public static void main(String[] args) {
		System.out.println("Enter the Browser to launchFie");
		
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		
		if (choice.equalsIgnoreCase("chrome")) {
			launchChrome();	
			
		}else if (choice.equalsIgnoreCase("firefox")) {
			launchFirefox();	
			
		}else {
			System.out.println("Enter the valid input");
			
		}
	}
	
	
	public static void launchChrome() {
		System.out.println("Entering Chrome");
		
		WebDriver amzn = new ChromeDriver();
		amzn.manage().window().maximize();
		amzn.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=4986175491460670870&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAy4eNBhCaARIsAFDVtI0aut8pBZBTnhVjq6mlALKljAVb70_YuQglv2vQr195j-sli-nCw-MaAi0bEALw_wcB");
		amzn.close();
	}
	
	public static void launchFirefox() {
		System.out.println("Entering Firefox");
		
		WebDriver flipkrt = new FirefoxDriver();
		flipkrt.get("https://www.flipkart.com/");
		flipkrt.close();
	}


}
