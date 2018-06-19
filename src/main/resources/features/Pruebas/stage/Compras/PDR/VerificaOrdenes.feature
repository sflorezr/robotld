Feature: Verifica Orden

Scenario: verifico ordenes
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	And Busco compras "src/test/resources/datadriven/orden.xls"
	Then Verifica ordenes