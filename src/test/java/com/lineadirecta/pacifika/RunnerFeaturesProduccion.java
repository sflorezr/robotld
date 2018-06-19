package com.lineadirecta.pacifika;	

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

@CucumberOptions(features ="src/main/resources/features/Produccion/",
plugin = {"pretty", "html:target/cucumber-html-report/pacifika", 
        "junit:target/cucumber-junit-report-pacifika/allcukes.xml",
        "json:target/cucumber-pacifika.json"})
public class RunnerFeaturesProduccion {									  
}