

@tag
Feature: Yo como usuario requiero consultar los hoteles disponibles en la fecha seleccionada

  @tag1
  Scenario: Llenar los datos del formulario y buscar las reservas de hotel
    Given EL usuario ingresa a la pagina de dx hotels
    When Se llenan todo los datos requeridos requeridos en la consulta
		|		location			|			check_in			|			check_out		|		rooms		|		adults		| 	children	|
		|	New York City		|			07/11/2019		|		10/11/2019		|			1			|			2				|				1		 	|
    Then Se da clic en el boton buscar 
    And selecciono la reserva mas barata
