Feature: Compra Contra Entrega PDP

# Compra generada con la ruta feliz con usuarios nuevos y existentes , selecciona productos desde la PDP menores a $250.000 , los productos no deben superar este tope
# Menor : acción del monto es  inferior o igual a $250.000 
# Envia correo y crea ordenes en hybris 

# Nota: Se recomienda al actualizar el datadriven colocar los registros que tiene SC en las últimas posiciones
#@ejecutar
Scenario Outline: Compra contra entrega usuario normal
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDP menor normal "250000"	 
	 And Logueo e Ir a Pasarela "<usuario>"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"

Examples:
 	|usuario|
 	|normal |
 	|aliada |
 	#|normaln|
 	#|aliadan|
	
	
	##  Compras con SC  con clientes y aliad@s existente  
	## La constante mayor, indica el valor que debe tener el SC y el número indica el monto
	 	  	 
Scenario Outline: Compra contra entrega usuario normal con SC
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 When Selecciona articulos desde PDP menor normal "250000"	 
	 And Logueo e Ir a Pasarela "<usuario>" mayor a "100000"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"

Examples:
 	|usuario|
 	|normal |
 	|aliada |

Scenario Outline: Compra contra entrega usuario normal con SC y vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"	
	 When Selecciona articulos desde PDP menor normal "250000"	 
	 And digito vaucher de tipo "fijo"
	 And Logueo e Ir a Pasarela "<usuario>" mayor a "100000"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"

Examples:
 	|usuario|
 	|normal |
 	|aliada |
 	 
 # Compras con COD con  los tipos de voucher como liente y aliad@  ya existentes en la BD 
 @ejecutar	
Scenario Outline: Compra contra entrega usuario normal con voucher <vocher>
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"	
	 When Selecciona articulos desde PDP menor normal "250000"
	 And digito vaucher de tipo "<voucher>"
	 And Logueo e Ir a Pasarela "normal"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"
	 
Examples:
 |voucher    |
 |fijo       |
 |porcentaje |
 |freeshiping|
 

Scenario Outline: Compra contra entrega usuario aliada con voucher <vocher>
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"	
	 When Selecciona articulos desde PDP menor normal "250000"
	 And digito vaucher de tipo "<voucher>"
	 And Logueo e Ir a Pasarela "aliada"
	 And Selecciono Forma pago contra entrega
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "¡Tu pedido va en camino!"
	 
Examples:
 |voucher    |
 |fijo       |
 |porcentaje |
 |freeshiping|

#  Escenarios para verificar que el municipio no tiene configurado COD por este movtio no se generan ordenes 
#  Archivo de municipios en este va configurado por codigo de DANE la ciudad si teiene COD o nó, dependiendo de este el robot lo toma o nó, ya que no ingresa a la tabla city 



Scenario: Compra contra entrega usuario normal caso no feliz municipio sin contra entrega con vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 And Tengo municipios "src/test/resources/datadriven/municipios.csv"
	 When Selecciona articulos desde PDP menor normal "250000"
	 And digito vaucher de tipo "porcentaje"
	 And Logueo e Ir a Pasarela "normal" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 
	 
Scenario: Compra contra entrega usuario normal caso no feliz municipio sin contra entrega 
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"		
	 And Tengo municipios "src/test/resources/datadriven/municipios.csv"
	 When Selecciona articulos desde PDP menor normal "250000"
	 And Logueo e Ir a Pasarela "normal" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 	 

Scenario: Compra contra entrega usuario aliada caso no feliz municipio sin contra entrega con vaucher
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 And teniendo datos en lista "src/test/resources/datadriven/vaucher.xls"	
	 And Tengo municipios "src/test/resources/datadriven/municipios.csv"	
	 When Selecciona articulos desde PDP menor aliada "250000"
	 And digito vaucher de tipo "fresshiping"
	 And Logueo e Ir a Pasarela "alaida" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz	 	 
	 
Scenario: Compra contra entrega usuario aliada caso no feliz municipio sin contra entrega 
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	 And Tengo datos a verificar "src/test/resources/datadriven/logistica.csv"
	 And Tengo municipios "src/test/resources/datadriven/municipios.csv"
	 When Selecciona articulos desde PDP menor aliada "250000"
	 And Logueo e Ir a Pasarela "alaida" con municipio sin contra entrega
	 And Selecciono Forma pago contra entrega no feliz		 	 

# Validar tope de COD con usuario normal y aliad@ ya existentes , el tope para la búsqueda es mayor a $250.000 

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
	 	 