<<<<<<< HEAD
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Pruebas/dev/Compras/PDP/1StoreCredit.feature");
formatter.feature({
  "name": "Store Credit",
=======
$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/test/resources/features/Pruebas/dev/Vaucher/RedimirVaucher.feature");
formatter.feature({
  "name": "redimir un Vaucher dev",
>>>>>>> c958f37ef6e89d710aef208f8b31b85da9467c39
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
<<<<<<< HEAD
  "name": "Store Credit Mayor Compra usuario aliada",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Ruta"
    }
  ]
=======
  "name": "redimir un vaucher usuario normal y aumenta en el carro",
  "description": "",
  "keyword": "Scenario"
>>>>>>> c958f37ef6e89d710aef208f8b31b85da9467c39
});
formatter.step({
  "name": "Estando en Home",
  "keyword": "Given "
});
formatter.match({
  "location": "AgregarArticuloDefinition.estando_en_Home()"
<<<<<<< HEAD
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
=======
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "redimir un vaucher usuario normal, disminuye cantidad y une carrito",
  "description": "",
  "keyword": "Scenario"
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
formatter.scenario({
  "name": "redimir un vaucher usuario normal y baja un articulo",
  "description": "",
  "keyword": "Scenario"
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
formatter.scenario({
  "name": "redimir un vaucher usuario aliada y aumenta articulos",
  "description": "",
  "keyword": "Scenario"
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
formatter.scenario({
  "name": "redimir un vaucher usuario aliada , disminuye articulos y une carrito",
  "description": "",
  "keyword": "Scenario"
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
formatter.scenario({
  "name": "redimir un vaucher usuario aliada y baja un articulo",
  "description": "",
  "keyword": "Scenario"
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
formatter.scenario({
  "name": "redimir un vaucher sin logueo",
  "description": "",
  "keyword": "Scenario"
>>>>>>> c958f37ef6e89d710aef208f8b31b85da9467c39
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
formatter.scenario({
  "name": "redimir un vaucher sin logueo aumentando",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
<<<<<<< HEAD
  "name": "Logueo e Ir a Pasarela \"aliada\" mayor a \"250000\"",
  "keyword": "And "
});
formatter.match({
  "location": "LogueoDesdeInicioDefinition.logueo_e_Ir_a_Pasarela_mayor_a(String,int)"
=======
  "name": "Estando en Home",
  "keyword": "Given "
});
formatter.match({
  "location": "AgregarArticuloDefinition.estando_en_Home()"
>>>>>>> c958f37ef6e89d710aef208f8b31b85da9467c39
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "redimir un vaucher sin logueo disminuyendo",
  "description": "",
  "keyword": "Scenario"
});
formatter.step({
<<<<<<< HEAD
  "name": "No encuentra Pasarela \"Tu saldo a favor cubre el valor de tu compra.\"",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreCreditDefinition.no_encuentra_Pasarela(String)"
=======
  "name": "Estando en Home",
  "keyword": "Given "
});
formatter.match({
  "location": "AgregarArticuloDefinition.estando_en_Home()"
>>>>>>> c958f37ef6e89d710aef208f8b31b85da9467c39
});
formatter.result({
  "status": "passed"
});
<<<<<<< HEAD
=======
formatter.scenario({
  "name": "redimir un vaucher sin logueo baja un articulo",
  "description": "",
  "keyword": "Scenario"
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
>>>>>>> c958f37ef6e89d710aef208f8b31b85da9467c39
});