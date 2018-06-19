Feature: Compras en efectivo

Scenario: Compra efectivo usuario normal Baloto
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
	 And Ir a Pasarela "normal"
	 And Selecciono "baloto"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	
	 
Scenario: Compra efectivo usuario normal solo agrego al carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 	  	
	 
Scenario: Compra efectivo usuario normal efecty union de carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
	 And Ir a Pasarela "normal"
	 And Selecciono "efecty"
	 And Pagar Ahora
	 And Guarda orden		 	
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."
	 
Scenario: Compra efectivo usuario normal Baloto con descuento fijo
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
   And digito vaucher de tipo "fijo"	 
	 And Ir a Pasarela "normal"
	 And Selecciono "baloto"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	 
	 
Scenario: Compra efectivo usuario normal efecty con descuento porcentaje
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
   And digito vaucher de tipo "porcentaje"	 
	 And Ir a Pasarela "normal"
	 And Selecciono "efecty"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."		 
 
Scenario: Compra efectivo usuario normal Baloto con descuento freeshipping
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
   And digito vaucher de tipo "freeshipping"	 
	 And Ir a Pasarela "normal"
	 And Selecciono "baloto"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."
	 
	 
Scenario: Compra efectivo usuario aliada solo agrego al carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP	 	

Scenario: Compra efectivo usuario aliada baloto union de carro
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
	 And Ir a Pasarela "aliada"
	 And Selecciono "baloto"
	 And Pagar Ahora
	 And Guarda orden	 
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente." 
	 
Scenario: Compra efectivo usuario aliada efecty
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
	 And Ir a Pasarela "aliada"
	 And Selecciono "efecty"
	 And Pagar Ahora
	 And Guarda orden	 
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."

Scenario: Compra efectivo usuario aliada efecty con descuento fijo
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
	 And digito vaucher de tipo "fijo"	 
	 And Ir a Pasarela "aliada"
	 And Selecciono "efecty"
	 And Pagar Ahora
	 And Guarda orden	 
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente." 	 
	 
Scenario: Compra efectivo usuario aliada baloto con descuento porcentaje
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
	 And digito vaucher de tipo "porcenjate"	 
	 And Ir a Pasarela "aliada"
	 And Selecciono "baloto"
	 And Pagar Ahora
	 And Guarda orden	 
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	 
	 
Scenario: Compra efectivo usuario aliada baloto con descuento freeshipping
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"
	 When Logueo usuairo normal 
	 And Selecciona articulos desde PDP 
	 And digito vaucher de tipo "freeshipping"	 
	 And Ir a Pasarela "aliada"
	 And Selecciono "baloto"
	 And Pagar Ahora
	 And Guarda orden	 
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."