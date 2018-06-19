Feature: Compra Contra Entrega

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

Scenario: Compra contra entrega usuario normal
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDP menor normal "250000"	 
	 And Logueo e Ir a Pasarela "normal"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"
	 	  	 
 Scenario: Compra contra entrega usuario aliada
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo aliada	 
	 And Selecciona articulos desde PDP menor normal "250000"
	 And Ir a Pasarela "aliada"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"
	 	 
Scenario: Compra contra entrega usuario normal con vaucher
	 Given Estando en pagina de logeo
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDP menor normal "250000"
	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "normal"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"

Scenario: Compra contra entrega usuario normal caso no feliz municipio sin contra entrega con vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 When Selecciona articulos desde PDP menor normal "250000"
	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "normal" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 
	 
Scenario: Compra contra entrega usuario normal caso no feliz municipio sin contra entrega 
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 When Selecciona articulos desde PDP menor normal "250000"
	 And Logueo e Ir a Pasarela "normal" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 	 

Scenario: Compra contra entrega usuario aliada caso no feliz municipio sin contra entrega con vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 When Selecciona articulos desde PDP menor aliada "250000"
	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "alaida" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 	 
	 
Scenario: Compra contra entrega usuario aliada caso no feliz municipio sin contra entrega 
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 When Selecciona articulos desde PDP menor aliada "250000"
	 And Logueo e Ir a Pasarela "alaida" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz		 	 

Scenario: Compra contra entrega usuario normal caso no feliz
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDP mayor normal "250000"
	 And Logueo e Ir a Pasarela "normal"
	 And Selecciono Forma pago contra entrega no feliz
	 
Scenario: Compra contra entrega usuario aliada caso no feliz
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDP mayor aliada "250000"
	 And Logueo e Ir a Pasarela "aliada"
	 And Selecciono Forma pago contra entrega no feliz	  		 	
	 	 