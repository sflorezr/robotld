Feature: Compra con Tarjeta debito

Scenario: Limpia Carro cliente
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo normal	 
	And Limpia carro

	Scenario: comprar con Tarjeta debito con usuario normal caso feliz solo agrego al carro
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Logueo usuairo normal
	 And Selecciona articulos desde PDR

Scenario: comprar con Tarjeta debito con usuario normal caso feliz con union de carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadrivenDev/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR
	 And Logueo e Ir a Pasarela "normal" 	 	 	
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "feliz"
