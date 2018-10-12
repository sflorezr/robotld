Feature: Compras en efectivo PDP

#@ejecutar
Scenario Outline: Compra efectivo usuario <usuario> forma <forma>
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 #When Logueo usuairo normal 
	 When Logueo usuairo "<usuario>"
	 And Selecciona articulos desde PDP 
	 And Ir a Pasarela "<usuario>"
	 And Selecciono "<forma>"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	
	 
Examples: 
	|usuario|forma |
	|normal |efecty|
	|normal |baloto|
	|aliada |efecty|
	|aliada |baloto|
	#|normaln|efecty|
	#|normaln|baloto|
	#|aliadan|efecty|
	#|aliadan|baloto|	

	
#@ejecutar	 
Scenario Outline: Compra efectivo usuario normal Baloto con descuento fijo
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"		
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
   And digito vaucher de tipo "fijo"	 
	 And Ir a Pasarela "normal"
	 And Selecciono "baloto"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	 
	 
	 Examples:
	 	|usuario|forma |voucher    |
	 	|normal |baloto|fijo       |
	 	#|normal |efecty|fijo       |
	 	#|normal |baloto|porcentaje |
	 	#|normal |efecty|freeshiping|
	 	#|aliada |baloto|fijo       |
	 	#|aliada |efecty|porcentaje |
	 	#|aliada |baloto|freeshiping|
	
@ejecutar	
Scenario Outline: Store Credit Mayor Compra usuario <usuario> verifica pasarela
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDP mayor normal "140000"
	 And  Logueo e Ir a Pasarela "<usuario>" mayor a "100000"
	 Then Verifica Pasarela	 	 
	Examples: 
	 |usuario |
	 |normal  |
	 |aliada  |	 
	  
	 