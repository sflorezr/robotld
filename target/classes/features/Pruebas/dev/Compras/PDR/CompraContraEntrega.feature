Feature: Compra Contra Entrega PDR

@ejecutar	
Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro
@ejecutar	
Scenario: Limpia Carro cliente
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo normal	 
	And Limpia carro



Scenario: Compra contra entrega usuario normal con Store Credit
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	 When Selecciona articulos desde PDR menor normal "250000"
	 And digito vaucher de tipo "fijo" usuario "normal"	 
	 And  Logueo e Ir a Pasarela "normal" mayor a "10000"	 
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"

Scenario: Compra contra entrega usuario normal
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR menor normal "250000"	 
	 And Logueo e Ir a Pasarela "normal"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"


Scenario: Compra contra entrega usuario aliada con Store Credit
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"
	 When Selecciona articulos desde PDR menor normal "250000"
	 And digito vaucher de tipo "fijo" usuario "aliada"	 
	 And  Logueo e Ir a Pasarela "aliada" mayor a "10000"	 
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!" 
	 
	 Scenario: Compra contra entrega usuario normal con vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR menor normal "250000"
	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "normal"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"
	 
	 
Scenario: Compra contra entrega usuario normal caso no feliz municipio sin contra entrega con vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadrivenDev/logistica.csv"
	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"	
	 And Tengo municipios "src/test/resources/datadrivenDev/municipios.csv"	
	 When Selecciona articulos desde PDR menor normal "250000"
	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "normal" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 
	 
	Scenario: Compra contra entrega usuario normal caso no feliz municipio sin contra entrega 
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadrivenDev/logistica.csv"
	 And Tengo municipios "src/test/resources/datadrivenDev/municipios.csv"
	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"		
	 When Selecciona articulos desde PDR menor normal "250000"
	 And Logueo e Ir a Pasarela "normal" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	
	 
	 Scenario: Limpia Carro cliente
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo normal	 
	And Limpia carro
	
Scenario: Compra contra entrega usuario normal caso no feliz
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR mayor normal "250000"
	 And Logueo e Ir a Pasarela "normal"
	 And Selecciono Forma pago contra entrega no feliz
	 
	 
@ejecutar	 
 Scenario: Compra contra entrega usuario aliada
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Logueo usuairo aliada	 
	 And Selecciona articulos desde PDR menor normal "250000"
	 And Ir a Pasarela "aliada"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"
 
 
	Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro


Scenario: Compra contra entrega usuario aliada caso no feliz municipio sin contra entrega con vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadrivenDev/logistica.csv"
	 And Tengo municipios "src/test/resources/datadrivenDev/municipios.csv"
	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"		
	 When Selecciona articulos desde PDR menor aliada "250000"
	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "aliada" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 
 
Scenario: Limpia Carro aliada
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"	
	When Logueo usuairo aliada	 
	And Limpia carro
		 	 
 
Scenario: Compra contra entrega usuario aliada caso no feliz municipio sin contra entrega 
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadrivenDev/logistica.csv"
	 And Tengo municipios "src/test/resources/datadrivenDev/municipios.csv"
	 When Selecciona articulos desde PDR menor aliada "250000"
	 And Logueo e Ir a Pasarela "aliada" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz		 	 

Scenario: Compra contra entrega usuario aliada caso no feliz
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDR mayor aliada "250000"
	 And Logueo e Ir a Pasarela "aliada"
	 And Selecciono Forma pago contra entrega no feliz	  		 		 	