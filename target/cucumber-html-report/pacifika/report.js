$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Pruebas/dev/Compras/PDR/1StoreCredit.feature");
formatter.feature({
  "name": "Store Credit PDR",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Store Credit Compra aliada tarjeta debito",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@ejecutar"
    }
  ]
});
formatter.step({
  "name": "Estando en Home",
  "keyword": "Given "
});
formatter.match({
  "location": "AgregarArticuloDefinition.estando_en_Home()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Tengo datos a ingresar \"src/test/resources/datadrivenDev/usuarios.xls\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.Tengo_datos_a_ingresar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Teniendo datos TD \"src/test/resources/datadrivenDev/TarjetaDebito.csv\"",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.teniendo_datos_TD(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Teniendo articulos a seleccionar \"src/test/resources/datadrivenDev/articulos.csv\"",
  "keyword": "And "
});
formatter.match({
  "location": "AgregarArticuloDefinition.teniendo_articulos_a_seleccionar(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Selecciona articulos desde PDR mayor aliada \"300000\"",
  "keyword": "When "
});
formatter.match({
  "location": "AgregarArticuloDefinition.selecciona_articulos_desde_PDR_mayor_aliada(int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Logueo e Ir a Pasarela \"aliada\" mayor a \"250000\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.logueo_e_Ir_a_Pasarela_mayor_a(String,int)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Ir a PSE",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.Ir_a_PSE()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pagar Ahora",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTCDefinition.pagar_Ahora()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Pasos para pago tarjeta debito \"feliz\"",
  "keyword": "And "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.pasos_para_pago_tarjeta_debito(String)"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Verifico Mensaje Pago Tarjeta Debito \"feliz\"",
  "keyword": "Then "
});
formatter.match({
  "location": "CompraTarjetaDebitoDefinition.Verifico_Mensaje_Pago_Tarjeta_Debito(String)"
});
formatter.result({
  "status": "passed"
});
});