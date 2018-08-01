package com.lineadirecta.pacifika.pageobjets;

import org.openqa.selenium.WebElement;
import net.serenitybdd.core.Serenity;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import net.serenitybdd.screenplay.targets.Target;

@DefaultUrl("https://stage.pacifika.com/")
public class BusquedaDeArticulosPorSubcategoriaPage extends PageObject {
	
	public void MenuPrincipal(String opcion){
//        WebDriver driver = getDriver();		
//        WebElement hover=null;        
//		Actions action = new Actions(driver);     
	//waitFor(10).seconds();
		switch(opcion) {
		case "Inicio":
			findBy(".//*[@id='navbar']/ul/li[1]/span/a").and().click();				    
		break;
		case "Mujer":
//	        hover = driver.findElement(By.xpath(""));      
//	        action.moveToElement(hover).build().perform();	
			WebElement weMenuMujer = findBy("//*[@id='navbar']/ul/li[2]/div/a");
	        waitFor(1).second();
	        //action.moveToElement(weMenuMujer).perform();
	        withAction().moveToElement(weMenuMujer).build().perform();
	        waitFor(1).second();	       
		break;			
		case "Hombre":
			waitFor(1).seconds();
			WebElement menu = findBy(".//*[@id='navbar']/ul/li[3]/div/a");
	        waitFor(1).second();
	        //action.moveToElement(weMenuMujer).perform();
	        withAction().moveToElement(menu).build().perform();			
	        //hover = driver.findElement(By.xpath(".//*[@id='navbar']/ul/li[3]/div/a"));      
	        //action.moveToElement(hover).build().perform();	
	        waitFor(1).seconds();			
		break;
		case "Denim":
			findBy(".//*[@id='navbar']/ul/li[4]/span/a").and().click();
		break;			
		//case "Nuevos":
		//break;	
		 //   //*[@id="navbar"]/ul/li[6]/span/a
		 case "Sales":
		      findBy("//*[@id='navbar']/ul/li[6]/span/a").and().click();
		 break;	
		case "Black Friday":
			findBy(".//*[@id='navbar']/ul/li[6]/span/a").and().click();
		break;				
		}
		Serenity.takeScreenshot();
	}
	public void Subcategoria(String opcion,String subcategoria){
		switch(subcategoria){
					
		case "buzosychaquetas":
			if (opcion.equals("Mujer")){
			findBy(".//*[@id='navbar']/ul/li[2]/ul/div/div/ul[1]/li[1]/a").and().click();
			}else{
			findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[1]/li[4]/a").and().click();	
			}			
		break;
		case "blusasycamisas":
			findBy(".//*[@id='navbar']/ul/li[2]/ul/div/div/ul[1]/li[2]/a").and().click();
			break;
		case "camisetas":
			if (opcion.equals("Mujer")){
				findBy(".//*[@id='navbar']/ul/li[2]/ul/div/div/ul[1]/li[3]/a").and().click();
			}else{
				findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[1]/li[1]/a").and().click();
			}			
			break;
		case "faldasyvestidos":
			findBy(".//*[@id='navbar']/ul/li[2]/ul/div/div/ul[1]/li[4]/a").and().click();
			break;
		case "shorts":
			waitFor(3).second();
	        //action.moveToElement(weMenuMujer).perform();
//	        withAction().moveToElement(weMenuMujer).moveToElement(findBy("//*[@id='navbar']/ul/li[2]/ul/div/div/ul[2]/li[2]/a")).click().build().perform();			
			findBy("//*[@id='navbar']/ul/li[2]/ul/div/div/ul[2]/li[2]/a").and().click();
			break;									
		case "Jeans":
			if (opcion.equals("Mujer")){
				findBy(".//*[@id='navbar']/ul/li[2]/ul/div/div/ul[2]/li[2]/a").and().click();
			}else{
				findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[2]/li[1]/a").and().click();
			}			
			break;	
		case "pijamas":
			findBy(".//*[@id='navbar']/ul/li[2]/ul/div/div/ul[2]/li[3]/a").and().click();
			break;	
		case "ropainterior":
			if (opcion.equals("Mujer")){
			findBy(".//*[@id='navbar']/ul/li[2]/ul/div/div/ul[2]/li[4]/a").and().click();
			}else{
			findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[2]/li[4]/a").and().click();
			}
			break;
		case "camisas":
			findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[1]/li[2]/a").and().click();
			break;		
		case "polos":
			findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[1]/li[3]/a").and().click();
			break;	
		case "bermudas":
			findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[2]/li[3]/a").and().click();
			break;
		case "ropadormir":
			findBy(".//*[@id='navbar']/ul/li[3]/ul/div/div/ul[3]/li/a").and().click();
			break;
		case "nuevohombre":
			findBy(".//*[@id='navbar']/ul/li[5]/ul/div/div/ul[1]/li[1]/a").and().click();
			break;
		case "nuevomujer":
			findBy(".//*[@id='navbar']/ul/li[5]/ul/div/div/ul[1]/li[2]/a").and().click();
			break;	
	 
		}	
		Serenity.takeScreenshot();
	}
	public void seleccionatalla(String talla,String posicion,String tipo){
		waitFor(3).seconds();		
		String tal=talla;
		String code;
		waitFor(2).seconds();	
		code="(//A[@href='#'][text()='"+tal+"'][text()='"+tal+"'])["+posicion+"]";
		findBy(code).and().click();
		Serenity.takeScreenshot();
		        
	}
	public void anadiralcarrito(String codigo){
		waitFor(3).seconds();
		findBy(".//*[@id='addToCartQuickBuy_"+codigo+"']").and().click();	
		Serenity.takeScreenshot();
	}
	public void abrirpaginadeproducto(String posicion){
		waitFor(2).seconds();
		findBy("html/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div["+posicion+"]/div/a[1]/img").waitUntilEnabled().waitUntilClickable().and().click();
		Serenity.takeScreenshot();
	}
	public void anadealcarrocontalla(String tallatipo){
		String p=null;
		switch (tallatipo){
			case "Mujer6":
			case "Hombre30":
			case "HombreS":
			case "Hombres":
			case "MujerXS":
			case "Mujerxs":
				p="1";
				break;
			case "Mujer8":
			case "Hombre32":
			case "HombreM":
			case "Hombrem":
			case "MujerS":
			case "Mujers":
				p="2";
				break;
			case "Mujer10":
			case "Hombre34":
			case "HombreL":
			case "Hombrel":
			case "MujerM":
			case "Mujerm":
				p="3";
				break;			
			case "Mujer12":
			case "Hombre36":
			case "HombreXL":
			case "Hombrexl":
			case "MujerL":
			case "Mujerl":
				break;	
			default: p="1";
		}
		findBy(".//*[@id='variant']/li["+p+"]/a").and().click();
		Serenity.takeScreenshot();
	}
	public void CerrarMiniCar(){
		waitFor(3).seconds();
		findBy(".//*[@id='CartContainer']/div[1]/div/div").and().click();	
		waitFor(2).seconds();
		Serenity.takeScreenshot();
	}
	public int ValorXproduc(String posicion){
		int i=0;
		//JOptionPane.showMessageDialog(null, findBy("/html/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div["+posicion+"]/div/div[1]/a/div/span").and().getText().replace("$","").replace(".",""));			
		i=Integer.parseInt(findBy("/html/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div["+posicion+"]/div/div[1]/a/div/span").and().getText().replace("$","").replace(".",""));
		//findBy("/html/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div["+posicion+"]/div/div[1]/a/div/span").and().click();
		Serenity.takeScreenshot();
		return(i);
	}
	
	public int ValorXproducPDP(){
		int i=0;
		//JOptionPane.showMessageDialog(null, findBy("/html/body/main/div[6]/div[2]/section/div[1]/div[2]/div/div/div[2]/div["+posicion+"]/div/div[1]/a/div/span").and().getText().replace("$","").replace(".",""));			
		i=Integer.parseInt(findBy("/html/body/main/div[6]/div[2]/section[1]/div/div[1]/div/section/div/div[4]/div/h3/span[1]").and().getText().replace("$","").replace(".",""));
		findBy("/html/body/main/div[6]/div[2]/section[1]/div/div[1]/div/section/div/div[4]/div/h3/span[1]").and().click();
		Serenity.takeScreenshot();
		return(i);
	}	
	public int total(){
		waitFor(2).seconds();
		int i=0;
		i= Integer.parseInt(findBy("//*[@id='CartContainer']/div[2]/div/div/div/div[1]/h3/strong").and().getText().replace("$", "").replace(".", ""));
		//findBy("//*[@id='CartContainer']/div[2]/div/div/div/div[1]/h3/strong").and().click();
		Serenity.takeScreenshot();
		return(i);
	}
	public void scroll(Target target) {
		
	}
	public void LimpiaCarro() {
		boolean vali=true;
		waitFor(2).seconds();

		try {
			findBy("//*[@id=\"cart-toggle\"]/span").and().click();
			Serenity.takeScreenshot();
			findBy("//*[@id=\"CartContainer\"]/div[2]/div/div/div/div[2]/a").and().click();
			Serenity.takeScreenshot();
			waitFor(2).seconds();
			try {
				findBy("/html/body/main/div[5]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div/ul/li/form/span/span").and().click();
			}catch(Throwable t) {	
				try {
					findBy("/html/body/main/div[5]/div[2]/div[2]/div[2]/div/div[1]/div/div[1]/div/ul/li/form/span/span").and().click();
					}catch(Throwable tr) {
					}				
			}
			Serenity.takeScreenshot();
			while(vali) {				
				try {
					waitFor(1).seconds();
					findBy("//*[@id=\"removeEntry_0\"]/a/span").and().click();
					Serenity.takeScreenshot();
				}catch(Throwable t) {
					waitFor(1).seconds();
					findBy("/html/body/main/div[2]/div/div/div/a[1]/img").and().click();
					Serenity.takeScreenshot();
					vali=false;
				}
			}
		}catch(Throwable t) {	
			findBy(".//*[@id='CartContainer']/div[1]/div/div").and().click();	
		}
	}
	public int Cantidad() {
		waitFor(2).seconds();
		Serenity.takeScreenshot();
		return(Integer.parseInt(findBy("//*[@id=\"cart-toggle\"]/div[2]/span").and().getTextValue()));
	}
}
