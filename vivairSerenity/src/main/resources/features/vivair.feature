

@tag
Feature: Yo como usuario requiero consultar los vuelos disponibles en la fecha requerida

  @tag1
  Scenario: Diligenciar formulario
    Given el usuario ingresa a la pagina principal de vivaair
    When se diligencian los datos del formulario y selecciono solo ida
    |	origen 				| destino						|	fecha_ida		|	num_pasajeros	|	moneda|
    |		Medellin		|		Barranquilla		|	29-10-2019	|				2				|	USD		| 
    Then doy clic en buscar vuelos valido los vuelos disponibles
    