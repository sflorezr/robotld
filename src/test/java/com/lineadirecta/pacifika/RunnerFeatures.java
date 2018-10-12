package com.lineadirecta.pacifika;	

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;

@RunWith(CucumberWithSerenity.class)

// ..:: DEV ::..
//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/Compras/PDR/CompraCredito.feature",

//@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDP/CompraContraEntrega.feature",tags= {"@ejecutar"},
//@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDR/CompraContraEntrega.feature",tags= {"@ejecutar"},

//@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDP/CompraEfectivo.feature", tags={"@ejecutar"},
//@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDR/CompraEfectivo.feature", tags={"@ejecutar"},

@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDP/CompraTarjetaDebito.feature", tags={"@ejecutar"},
//@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDR/CompraTarjetaDebito.feature", tags={"@ejecutar"},

//@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDP/1StoreCredit.feature", tags={"@ejecutar"},
//@CucumberOptions(features ="src/test/resources/features/Pruebas/dev/Compras/PDP/CompraTC.feature", tags= {"@ejecutar"},

//tags= {"@Ejecutar"},2//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/Compras/PDR/CompraContraEntrega.feature",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/Compras/PDR/CompraContraEntrega.feature",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/Compras/PDR/CompraTarjetaDebito.feature",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/Compras/PDR/",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/",
//@CucumberOptions(features ="src/main/resources/features/Producccion/")
//@CucumberOptions(features ="src/main/resources/features/Pruebas/dev/Compras/PDR/CompraTarjetaDebito.feature",
//tags= {"@Ejecutar"},
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Logistica/",
//tags= {"@Ejecutar"},

// ..:: STAGE ::..
//@CucumberOptions(features ="src/test/resources/features/Pruebas/stage/Compras/PDP/CompraContraEntrega.feature",tags= {"@ejecutar"},

//@CucumberOptions(features ="src/test/resources/features/Pruebas/stage/Compras/PDP/CompraEfectivo.feature",tags= {"@ejecutar"},

//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDP/",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/1StoreCredit.feature",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/VerificaOrdenes.feature",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/CompraTC.feature",tags= {"@Ejecutar"},
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/CompraTarjetaDebito.feature",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/CompraContraEntrega.feature",
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/CompraCredito.feature",tags= {"@ejecutar"},
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/CompraEfectivo.feature",
//tags= {"@Ejecutar"},
//@CucumberOptions(features ="src/main/resources/features/Pruebas/stage/Compras/PDR/VerificaOrdenes.feature",
plugin = {"pretty", "html:target/cucumber-html-report/pacifika", 
        "junit:target/cucumber-junit-report-pacifika/allcukes.xml",
        "json:target/cucumber-pacifika.json"})
public class RunnerFeatures {									  
}