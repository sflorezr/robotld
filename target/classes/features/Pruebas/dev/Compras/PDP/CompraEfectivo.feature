Feature: Compras en efectivo


#  Solo funciona con clientes ya existentes
#  Corregir set de datos con la identificación si el cliente  y/o aliad@ es nueva ( campo tipo en archivo usuarios.xls) opciones cliente nuevo =normaln, aliad@ nueva =aliadan, cliente creado =normal, aliada creada=aliada
#  Para  identificar si desea compra ó no con aliad@ , se debe configurar el campo aliada del archivo usuarios.xls con el username de esta o la palabra <NONE> si no se  desea crear la orden con aliada
#  Crear aliada 
#  Para este escenario : tore Credit Mayor Compra usuario aliada verifica pasarela cargar un SC mayor o igual a $240.000,(PDP mayor aliada "240000" , este valor se  puede cambiar) , lo mismo para cliente 
#  Verificar fecha de expiración de los voucher configurados ó número de redenciones 

Scenario Outline: Compra efectivo usuario <usuario> forma <forma>
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDP
	 And Logueo e Ir a Pasarela "<usuario>"
	 And Selecciono "<forma>"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	
	 
Examples: 

	|usuario|forma |
	|normal |efecty|
	|normal |baloto|
	|aliada |efecty|
	|aliada |baloto|
	|normaln|efecty|
	|normaln|baloto|
	|aliadan|efecty|
	|aliadan|baloto|	


	 
Scenario Outline: Compra efectivo usuario <usuario> <forma> con descuento <voucher>
	 Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 And teniendo datos en lista "src/test/resources/datadrivenDev/vaucher.xls"	
	 When Selecciona articulos desde PDP 
   And digito vaucher de tipo "<voucher>"
	 And Logueo e Ir a Pasarela "<usuario>"   	 
	 And Selecciono "<forma>"
	 And Pagar Ahora
	 And Guarda orden
	 Then Verifico Mensaje Pago Final "Tu pago está en estado Pendiente."	 
	 
	 Examples:
	 	|usuario |forma |voucher    |
	 	|normal  |efecty|fijo       |
	 	|normal  |baloto|porcentaje |
	 	|normaln |baloto|porcentaje |
	 	|normal  |efecty|freeshiping|
	 	|aliada  |baloto|fijo       |
	 	|aliada  |efecty|porcentaje |
	 	|aliadan |efecty|porcentaje |
	 	|aliada  |baloto|freeshiping|
	
	
	
	Scenario: Store Credit Mayor Compra usuario normal verifica pasarela
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDP mayor normal "240000"
	 And  Logueo e Ir a Pasarela "normal" mayor a "100000"
	 Then Verifica Pasarela	 	
	
	@Ejecutar  
 	Scenario: Store Credit Mayor Compra usuario aliada verifica pasarela
	Given Estando en Home
	 And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	 And Teniendo articulos a seleccionar "src/test/resources/datadrivenDev/articulos.csv"
	 When Selecciona articulos desde PDP mayor aliada "240000"
	 And  Logueo e Ir a Pasarela "aliada" mayor a "100000"
	 Then Verifica Pasarela	 	 
 
