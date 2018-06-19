package com.lineadirecta.pacifika.pageobjets;

import org.openqa.selenium.By;

import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://dev.pacifika.local/")
public class Generales extends PageObject{
	public void LogoPacifika(){		
		findBy("html/body/main/nav[2]/div[3]/div/div[1]/div/div/a[1]/img").and().click();
		Serenity.takeScreenshot();
	}

	public void exceptionie() {
		// TODO Auto-generated method stub		
		try{
			Serenity.takeScreenshot();
		find(By.name("overridelink")).waitUntilPresent().and().click();
		}catch(Throwable t){
			
		}
	}
	
}