Feature: Compras en efectivo PDP

Scenario Outline: Compra efectivo usuario <usuario> forma <forma>
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 When Logueo usuairo normal 
#	 And Selecciona articulos desde PDR 
#	 And Ir a Pasarela "<usuario>"
#	 And Selecciono "<forma>"
#	 And Pagar Ahora
#	 And Guarda orden
#	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	
#	 
Examples: 
	|usuario|forma |
	|normal |efecty|
	|normal |baloto|
	|aliada |efecty|
	|aliada |baloto|
	|normaln|efecty|
	|normaln|baloto|
	|aliadan|efecty|
	|aliadan|baloto|	
#
#	
#	 
Scenario Outline: Compra efectivo usuario normal Baloto con descuento fijo
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"		
#	 When Logueo usuairo normal 
#	 And Selecciona articulos desde PDR 
   #And digito vaucher de tipo "fijo"	 
#	 And Ir a Pasarela "normal"
#	 And Selecciono "baloto"
#	 And Pagar Ahora
#	 And Guarda orden
#	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	 
#	 
	 Examples:
	 	|usuario|forma |voucher    |
	 	|normal |efecty|fijo       |
	 	|normal |baloto|porcentaje |
	 	|normal |efecty|freeshiping|
	 	|aliada |baloto|fijo       |
	 	|aliada |efecty|porcentaje |
	 	|aliada |baloto|freeshiping|
	
	Scenario Outline: Store Credit Mayor Compra usuario <usuario> verifica pasarela
	Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 When Selecciona articulos desde PDR mayor normal "140000"
#	 And  Logueo e Ir a Pasarela "<usuario>" mayor a "100000"
#	 Then Verifica Pasarela	 	 
	Examples: 
	 |usuario |
	 |normal  |
	 |aliada  |	 
#	  
#	 