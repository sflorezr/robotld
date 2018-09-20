Feature: Logistica
@Ejecutar
Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro
	
Scenario: Limpia Carro cliente
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"	
	When Logueo usuairo normal	 
	And Limpia carro

Scenario: Limpia Carro aliadan
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"	
	When Logueo usuairo "aliadan"	 
	And Limpia carro		
	
Scenario: verifica logisticas usuario normal
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And Tengo datos a verificar "src/test/resources/datadrivenProduccion/logistica.csv"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"
	When Logueo usuairo normal	
	And Selecciona articulos desde PDR
	And tengo cantidad
	And Ir a orden
	And Ir a CheckOut
	And Ir a Logistica "normal"
	And Verifica Datos logistica usuario normal	

Scenario: verifica logisticas usuario aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And Tengo datos a verificar "src/test/resources/datadrivenProduccion/logistica.csv"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"
	When Logueo usuairo aliada
	And Selecciona articulos desde PDR	
	And tengo cantidad
	And Ir a orden
	And Ir a CheckOut
	And Ir a Logistica "aliada"
	And Verifica Datos logistica usuario aliada
	

Scenario: verifica logisticas usuario aliada mayor 
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And Tengo datos a verificar "src/test/resources/datadrivenProduccion/logistica.csv"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"
	When Logueo usuairo aliada	
	And Selecciona articulos desde PDR cantidad mayor normal "10"	
	And tengo cantidad
	And Ir a orden
	And Ir a CheckOut
	And Ir a Logistica "aliada"
	And Verifica Datos logistica usuario aliada	

# Las aliadas siempre deben estar creadas 

Scenario: verifica logisticas usuario aliada nueva
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And Tengo datos a verificar "src/test/resources/datadrivenProduccion/logistica.csv"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"
	When Logueo usuairo "aliadan"
	And Selecciona articulos desde PDR	
	And tengo cantidad
	And Ir a orden
	And Ir a CheckOut
	And Ir a Logistica "aliadan"
	And Verifica Datos logistica usuario aliada
		

Scenario: verifica logistica usuario nuevo
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	 And Tengo datos a verificar "src/test/resources/datadrivenProduccion/logistica.csv"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"
	 When Selecciona articulos desde PDR	
	 And tengo cantidad 
	 And Logueo e Ir a Pasarela "normaln"
	 And Vuelvo a ubicacion
	 And Verifica Datos logistica usuario normal	 
	 
	 
# Devolver al carro aliada 
@Ejecutar
Scenario: verifica logisticas usuario aliada_devolver
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And Tengo datos a verificar "src/test/resources/datadrivenProduccion/logistica.csv"
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"
	When Logueo usuairo aliada
	And Selecciona articulos desde PDR	
	And tengo cantidad
	And Ir a orden
	And Ir a CheckOut
	And Ir a Logistica "aliada"
	And Verifica Datos logistica usuario aliada
	And Volver al Home 
	And Selecciona articulos desde PDR cantidad mayor normal "10"	
	And tengo cantidad
	And Ir a orden
	And Ir a CheckOut
	And Ir a Logistica "aliada"
	And Verifica Datos logistica usuario aliada	
	