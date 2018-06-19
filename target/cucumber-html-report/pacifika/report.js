$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("src/main/resources/features/Pruebas/dev/Compras/PDP/CompraContraEntrega.feature");
formatter.feature({
  "name": "Compra Contra Entrega PDP",
  "description": "",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "name": "Compra contra entrega usuario normal",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "Estando en Home",
  "keyword": "Given "
});
formatter.step({
  "name": "Tengo datos a ingresar \"src/test/resources/datadrivenDev/usuarios.xls\"",
  "keyword": "And "
});
formatter.step({
  "name": "Teniendo articulos a seleccionar \"src/test/resources/datadrivenDev/articulos.csv\"",
  "keyword": "And "
});
formatter.step({
  "name": "Selecciona articulos desde PDP menor normal \"250000\"",
  "keyword": "When "
});
formatter.step({
  "name": "Logueo e Ir a Pasarela \"\u003cusuario\u003e\"",
  "keyword": "And "
});
formatter.step({
  "name": "Selecciono Forma pago contra entrega",
  "keyword": "And "
});
formatter.step({
  "name": "Pagar Ahora",
  "keyword": "And "
});
formatter.step({
  "name": "Guarda orden",
  "keyword": "And "
});
formatter.step({
  "name": "Verifico Mensaje Pago Final \"¡Tu pedido va en camino!\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "usuario"
      ]
    },
    {
      "cells": [
        "normal"
      ]
    },
    {
      "cells": [
        "aliada"
      ]
    },
    {
      "cells": [
        "normaln"
      ]
    },
    {
      "cells": [
        "aliadan"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Compra contra entrega usuario normal",
  "description": "",
  "keyword": "Scenario Outline"
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
  "name": "Selecciona articulos desde PDP menor normal \"250000\"",
  "keyword": "When "
});
