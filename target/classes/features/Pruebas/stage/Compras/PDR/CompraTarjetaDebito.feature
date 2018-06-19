Feature: Compra con Tarjeta debito

Scenario: Limpia Carro cliente
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"	
	When Logueo usuairo normal	 
	And Limpia carro

	Scenario: comprar con Tarjeta debito con usuario normal caso feliz solo agrego al carro
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo normal
	 And Selecciona articulos desde PDR

Scenario: comprar con Tarjeta debito con usuario normal caso feliz con union de carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadriven/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR
	 And Logueo e Ir a Pasarela "normal" 	 	 	
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "feliz"

Scenario: comprar con Tarjeta debito con usuario normal caso no feliz
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadriven/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR
	 And Logueo e Ir a Pasarela "normal" 	 	 	
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "no feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "no feliz"	 	 

Scenario: comprar con Tarjeta debito con usuario normal caso feliz con descuento con union de carrito
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadriven/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 When Selecciona articulos desde PDR
#	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "normal" 	 	 	
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "feliz"	 
	
Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro	

Scenario: comprar con Tarjeta debito con usuario aliada caso feliz solo agrego al carro
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo aliada
	 And Selecciona articulos desde PDP

Scenario: comprar con Tarjeta debito con usuario aliada caso feliz union de carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadriven/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR
	 And Logueo e Ir a Pasarela "aliada" 	 	 	
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "feliz"
	 
	Scenario: comprar con Tarjeta debito con usuario aliada caso no feliz
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadriven/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDP
	 And Logueo e Ir a Pasarela "aliada" 	 	 	
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "no feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "no feliz"	 	 

Scenario: comprar con Tarjeta debito con usuario aliada caso feliz con descuento con union de carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadriven/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"
	 When Selecciona articulos desde PDR
	# And digito vaucher de tipo "freeshiping"
	 And Logueo e Ir a Pasarela "aliada" 	 	 	
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "feliz"