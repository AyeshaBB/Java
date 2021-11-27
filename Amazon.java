package com.xworkz.shoopingapps;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon {

	public static void main(String[] args) {

//				System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\Selenium Files\\Chrome Driver Files");

				WebDriver driver = new ChromeDriver();
				
				System.out.println("Chrome loaded");
				
				driver.manage().window().maximize();
				
				driver.get("https://www.amazon.in/?&ext_vrnc=hi&tag=googhydrabk1-21&ref=pd_sl_7hz2t19t5c_e&adgrpid=58355126069&hvpone=&hvptwo=&hvadid=486386870127&hvpos=&hvnetw=g&hvrand=4986175491460670870&hvqmt=e&hvdev=c&hvdvcmdl=&hvlocint=&hvlocphy=1007768&hvtargid=kwd-10573980&hydadcr=14453_2154373&gclid=Cj0KCQiAy4eNBhCaARIsAFDVtI0aut8pBZBTnhVjq6mlALKljAVb70_YuQglv2vQr195j-sli-nCw-MaAi0bEALw_wcB");
				
				driver.close();


	}

}
