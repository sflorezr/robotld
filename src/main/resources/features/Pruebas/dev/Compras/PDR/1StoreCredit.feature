Feature: Store Credit

Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro

Scenario: Limpia Carro cliente
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo normal	 
	And Limpia carro
@Ejecutar

Scenario: Store Credit Mayor Compra usuario normal
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR menor normal "250000"
	 And Logueo e Ir a Pasarela "normal" mayor a "250000"
	 Then No encuentra Pasarela "Tu saldo a favor cubre el valor de tu compra."
	 And Pagar Ahora Store Credit
	 And Verifico Mensaje Pago Final Store Credit 
	 
Scenario: Store Credit Mayor Compra usuario normal verifica pasarela con union de carro
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR mayor normal "140000"
	 And  Logueo e Ir a Pasarela "normal" mayor a "200000"
	 Then Verifica Pasarela	 	 
	 

Scenario: Store Credit Mayor Compra usuario aliada
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR menor aliada "250000"
	 And Logueo e Ir a Pasarela "aliada" mayor a "250000"
	 Then No encuentra Pasarela "Tu saldo a favor cubre el valor de tu compra."
	 And Pagar Ahora Store Credit
	 And Verifico Mensaje Pago Final Store Credit 

Scenario: Store Credit Mayor Compra usuario aliada verifica pasarela
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR mayor aliada "200000"
	 And  Logueo e Ir a Pasarela "aliada" mayor a "200000"
	 Then Verifica Pasarela	 	 

	 
		 