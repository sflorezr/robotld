Feature: redimir un Vaucher
	
Scenario: redimir un vaucher usuario normal y aumenta en el carro
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Logueo usuairo normal
	And Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales
	And Aumenta articulos
	And digito vaucher y verifico totales

Scenario: redimir un vaucher usuario normal, disminuye cantidad y nue carrito
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Logueo usuairo normal
	And Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales
	And disminuye articulos
	And digito vaucher y verifico totales		
	
Scenario: redimir un vaucher usuario normal y baja un articulo
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Logueo usuairo normal
	And Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales
	And Baja un articulo
	And digito vaucher y verifico totales		

Scenario: redimir un vaucher usuario aliada y aumenta articulos
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Logueo usuairo aliada
	And Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales	
	And Aumenta articulos
	And digito vaucher y verifico totales	

Scenario: redimir un vaucher usuario aliada , disminuye articulos y une carrito
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Logueo usuairo aliada
	And Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales	
	And disminuye articulos
	And digito vaucher y verifico totales		
	
Scenario: redimir un vaucher usuario aliada y baja un articulo
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenProduccion/usuarios.xls"
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Logueo usuairo aliada
	And Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales	
	And Baja un articulo
	And digito vaucher y verifico totales			
	
Scenario: redimir un vaucher sin logueo
	Given Estando en Home
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales	

Scenario: redimir un vaucher sin logueo aumentando
	Given Estando en Home
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales	
	And Aumenta articulos
	And digito vaucher y verifico totales	

Scenario: redimir un vaucher sin logueo disminuyendo
	Given Estando en Home
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales	
	And disminuye articulos
	And digito vaucher y verifico totales			

Scenario: redimir un vaucher sin logueo baja un articulo
	Given Estando en Home
	And teniendo datos en lista "src/test/resources/datadrivenProduccion/vaucher.xls"		
	And Teniendo articulos a seleccionar "src/test/resources/datadrivenProduccion/articulos.csv"		
	When Selecciona articulos desde PDR
	And Estando en orden  
	And digito vaucher y verifico totales	
	And Baja un articulo
	And digito vaucher y verifico totales				