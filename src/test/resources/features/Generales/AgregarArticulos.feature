Feature: agrega articulos desde pagina de resultados

Scenario: agrega articulos desde pagina de resultados
	Given Estando en Home
	And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	When Selecciona articulos desde PDR
	Then Cerrar minicarro

Scenario: agregar articulos desde pagina de producto
	Given Estando en Home
	And Teniendo articulos a seleccionar "src/test/resources/datadriven/articulos.csv"
	When Selecciona articulos desde PDP
	Then Cerrar minicarro	