Feature: Store Credit PDR

Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro

Scenario: Limpia Carro cliente
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"	
	When Logueo usuairo normal	 
	And Limpia carro

Scenario: Store Credit Mayor Compra usuario normal
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR menor normal "250000"
	 And Logueo e Ir a Pasarela "normal" mayor a "250000"
	 Then No encuentra Pasarela "Tu saldo a favor cubre el valor de tu compra."	 	 
	 
Scenario: Store Credit Mayor Compra usuario normal verifica pasarela con union de carro
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR mayor normal "140000"
	 And  Logueo e Ir a Pasarela "normal" mayor a "250000"
	 Then Verifica Pasarela	 
	 And Pagar Ahora Store Credit 
	 
Scenario: Store Credit Compra usuario normal tarjeta credito con union de carro
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TC "src/test/resources/datadriven/TarjetaCredito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR mayor normal "300000"
	 And Logueo e Ir a Pasarela "normal" mayor a "250000"	 	 
	 And Digito Datos de TC
	 And Pagar Ahora
	 Then Verifico Mensaje Pago

Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro

Scenario: Store Credit Mayor Compra usuario aliada
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR menor aliada "250000"
	 And Logueo e Ir a Pasarela "aliada" mayor a "250000"
	 Then No encuentra Pasarela "Tu saldo a favor cubre el valor de tu compra."	

Scenario: Store Credit Mayor Compra usuario aliada verifica pasarela
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR mayor aliada "200000"
	 And  Logueo e Ir a Pasarela "aliada" mayor a "250000"
	 Then Verifica Pasarela	 	 

Scenario: Store Credit Compra aliada tarjeta debito
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo datos TD "src/test/resources/datadriven/TarjetaDebito.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDR mayor aliada "300000"
	 And  Logueo e Ir a Pasarela "aliada" mayor a "250000"
	 And Ir a PSE	 
	 And Pagar Ahora
	 And Pasos para pago tarjeta debito "feliz"
	 Then Verifico Mensaje Pago Tarjeta Debito "feliz" 	 		