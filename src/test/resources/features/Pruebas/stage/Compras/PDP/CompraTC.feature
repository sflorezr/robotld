Feature: Compra con TC PDP

#Scenario: Limpia Carro cliente
#	Given Estando en pagina de logeo
#	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
#	When Logueo usuairo normal	 
#	And Limpia carro
#
Scenario: comprar con tarjeta de credito con usuario normal con descuento
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo datos TC "src/test/resources/datadrivenDev/TarjetaCredito.csv"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"		
#	 When Logueo usuairo normal
#	 And Selecciona articulos desde PDP	
#
Scenario: comprar con tarjeta de credito con usuario normal
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo datos TC "src/test/resources/datadrivenDev/TarjetaCredito.csv"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 When Selecciona articulos desde PDR
#	 And Logueo e Ir a Pasarela "normal"
#	 And Digito Datos de TC 
#	 And Pagar Ahora intentos "5"
#	 And Guarda orden
#	 Then Verifico Mensaje Pago	
#	
#
Scenario: comprar con tarjeta de credito con usuario normal no feliz
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo datos TC "src/test/resources/datadrivenDev/TarjetaCredito.csv"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"	 
#	 When Selecciona articulos desde PDR
#	 And Logueo e Ir a Pasarela "normal"	 
#	 And Digito Datos de TC no feliz
#	 And Pagar Ahora
#	 Then Verifico Mensaje Pago no feliz
#
#Scenario: Limpia Carro aliada
#	Given Estando en pagina de logeo
#	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
#	When Logueo usuairo aliada	 
#	And Limpia carro
#	
Scenario: comprar con tarjeta de credito con usuario aliada solo agrega al carro
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"	
#	 When Logueo usuairo aliada
#	 And Selecciona articulos desde PDP
#	
Scenario: comprar con tarjeta de credito con usuario aliada con union del carrito
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo datos TC "src/test/resources/datadrivenDev/TarjetaCredito.csv"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 When Selecciona articulos desde PDR
#	 And Logueo e Ir a Pasarela "aliada"
#	 And Digito Datos de TC 
#	 And Pagar Ahora intentos "5"
#	 And Guarda orden
#	 Then Verifico Mensaje Pago			
#	 
Scenario Outline: comprar con tarjeta de credito con usuarios con descuento
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo datos TC "src/test/resources/datadrivenDev/TarjetaCredito.csv"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"		
#	 When Selecciona articulos desde PDR
#	 And digito vaucher de tipo "<voucher>"
#	 And Logueo e Ir a Pasarela "<tipo>"
#	 And Digito Datos de TC 
#	 And Pagar Ahora intentos "5"
#	 And Guarda orden
#	 Then Verifico Mensaje Pago
#	 
	 	 Examples: 
	 |tipo	 |voucher     |
	 |aliada |fijo        |
	 |aliada |porcentaje  |
	 |aliada |freeshiping |
	 |normal |fijo        |
	 |normal |porcentaje  |
	 |normal |freeshiping |			 
#	 
Scenario: comprar con tarjeta de credito con usuario aliada no feliz
	 Given Estando en Home
#	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
#	 And Teniendo datos TC "src/test/resources/datadrivenDev/TarjetaCredito.csv"
#	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
#	 When Selecciona articulos desde PDR
#	 And Logueo e Ir a Pasarela "aliada"	 
#	 And Digito Datos de TC no feliz
#	 And Pagar Ahora
#	 Then Verifico Mensaje Pago no feliz	 