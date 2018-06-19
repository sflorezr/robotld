Feature: Logueo desde el inicio

Scenario: Logeo desde el inicio usuario normal
	Given Estando en pagina de logeo
	And Tengo datos a ingresar "src/test/resources/datadriven/usuarios.xls"
	When  Logueo usuairo normal

