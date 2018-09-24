$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Pruebas/dev/Compras/PDP/1StoreCredit.feature");
formatter.feature({
  "name": "Store Credit",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Store Credit Mayor Compra usuario aliada",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Ruta"
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
  "name": "Selecciona articulos desde PDP menor aliada \"250000\"",
  "keyword": "When "
});
formatter.match({
  "location": "AgregarArticuloDefinition.selecciona_articulos_desde_PDP_menor_aliada(int)"
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
  "name": "No encuentra Pasarela \"Tu saldo a favor cubre el valor de tu compra.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreCreditDefinition.no_encuentra_Pasarela(String)"
});
formatter.result({
  "status": "passed"
});
});