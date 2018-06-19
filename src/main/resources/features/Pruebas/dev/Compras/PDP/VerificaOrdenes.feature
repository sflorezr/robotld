Feature: Verifica Orden

Scenario: verifico ordenes
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadrivenDev/usuarios.xls"
	And Busco compras "src/test/resources/datadrivenDev/orden.xls"
	Then Verifica ordenes