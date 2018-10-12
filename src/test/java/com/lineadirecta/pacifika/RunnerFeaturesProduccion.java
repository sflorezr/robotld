package com.lineadirecta.pacifika;	

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

//@CucumberOptions(features ="src/main/resources/features/Produccion/",
@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/Compras/PDP/1StoreCredit.feature",tags= {"@RutaCritica"},
plugin = {"pretty", "html:target/cucumber-html-report/pacifika", 
        "junit:target/cucumber-junit-report-pacifika/allcukes.xml",
        "json:target/cucumber-pacifika.json"})
public class RunnerFeaturesProduccion {									  
}