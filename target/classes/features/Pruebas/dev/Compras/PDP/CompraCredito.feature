Feature: compra con credito aliad@

@ejecutar
Scenario: compra con credito caso no feliz usuario normal
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo normal	 
	And Selecciona articulos desde PDP	
	And Ir a Pasarela "normal"
	And Selecciono credito no feliz		

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
	And Selecciono credito no feliz	con mensaje "¡Ups! parece que tu cupo no es suficiente para esta compra. Puedes cambiar de método de pago o diferir tu compra en varias transacciones"
	
Scenario: compra con credito aliad@
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Selecciona articulos desde PDP	
	And Ir a Pasarela "aliada"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"

Scenario: compra con credito aliad@ con vaucher fijo
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Selecciona articulos desde PDP
	And digito vaucher de tipo "fijo"	
	And Ir a Pasarela "aliada"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"	
	
Scenario: compra con credito aliad@ con vaucher porcentaje
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Selecciona articulos desde PDP
	And digito vaucher de tipo "porcentaje"	
	And Ir a Pasarela "aliada"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"	
	
Scenario: compra con credito aliad@ con vaucher freeshipping
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	When Logueo usuairo aliada	 
	And Selecciona articulos desde PDP
	And digito vaucher de tipo "freeshipping"	
	And Ir a Pasarela "aliada"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"		

Scenario: compra con credito aliad@ con st
	Given Estando en Home
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"	
	And Selecciona articulos desde PDP	
	And Logueo e Ir a Pasarela "aliada" mayor a "100000"
	And Selecciono credito
	And Pagar Ahora
	And Guarda orden
	Then Verifico Mensaje Pago Final "¡Ya compraste con tu crédito Aliad@.!"	
	

	