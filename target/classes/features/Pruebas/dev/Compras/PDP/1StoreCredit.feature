Feature: Store Credit


Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro


Scenario: Store Credit Mayor Compra usuario aliada
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDP menor aliada "250000"
	 And Logueo e Ir a Pasarela "aliada" mayor a "250000"
	 Then No encuentra Pasarela "Tu saldo a favor cubre el valor de tu compra."	


Scenario: Store Credit Mayor Compra usuario aliada verifica pasarela
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDP mayor aliada "200000"
	 And  Logueo e Ir a Pasarela "aliada" mayor a "250000"
	 Then Verifica Pasarela	 	 

