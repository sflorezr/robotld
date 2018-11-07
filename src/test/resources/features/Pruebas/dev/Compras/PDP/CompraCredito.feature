Feature: compra con credito aliad@ PDP

#Caso no feliz con usuario normal
#@ejecutar 
Scenario: compra con credito caso no feliz usuario normal
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo normal	 
	And Selecciona articulos desde PDP	
	And Ir a Pasarela "normal"
	And Selecciono credito no feliz		

#Caso feliz con usuario aliad@ nuevo y ya existente
#
#@ejecutar
Scenario Outline: compra con credito aliad@ <usuario>
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Selecciona articulos desde PDP	
	And Ir a Pasarela "<usuario>"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"

Examples:
 |usuario|
 |aliada |
 #|aliadan|
 
#
#Caso feliz con diferentes voucher y aliad@ existente y nueva
#
#@ejecutar
Scenario Outline: compra con credito aliad@ con voucher
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Selecciona articulos desde PDP
	And digito vaucher de tipo "<voucher>"	
	And Ir a Pasarela "aliada"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"	

Examples: 
 |voucher    |
 |fijo       |
 |porcentaje |
 |freeshiping|

Scenario Outline: compra con credito aliad@ nueva con voucher
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Selecciona articulos desde PDP
	And digito vaucher de tipo "<voucher>"	
	And Ir a Pasarela "aliadan"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"	

Examples: 
 |voucher    |
 |fijo       |
 |porcentaje |
 |freeshiping|
#
#Caso feliz con SC 
#El SC cargado debe ser mayor o igual a $100.000
#
#@ejecutar
Scenario: compra con credito aliad@ con sc
	Given Estando en Home
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"	
	When Selecciona articulos desde PDP	
	And Logueo e Ir a Pasarela "aliada" mayor a "100000"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"	
#
#Caso no feliz compra con cupo inferior al valor de la orden
#	
@ejecutar
Scenario: compra con credito aliad@ con mayor al cupo
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Limpia carro
	And Selecciona articulos desde PDP mayor aliada "300000"
	And Ir a Pasarela "aliada"
	And Selecciono credito
	And Pagar Ahora
	And Selecciono credito no feliz	con mensaje "¡Ups! parece que tu cupo no es suficiente para esta compra. Puedes cambiar el método de pago o diferir tu compra en varias transacciones."
	