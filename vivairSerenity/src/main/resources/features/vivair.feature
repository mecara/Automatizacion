

@tag
Feature: Yo como usuario requiero consultar los vuelos disponibles en la fecha requerida

  @tag1
  Scenario: Diligenciar formulario
    Given el usuario ingresa a la pagina principal de vivaair
    When ingresa  al formulario da clic en el checbox de solo ida
    And  se diligencian los datos del formulario 
    |	origen 	| destino	|	fecha_ida		|	num_pasajeros	|	moneda|
    |		MDE		|		CUZ		|	2019-10-17	|				2				|	USD		| 
    Then doy clic en buscar vuelos valido los vuelos disponibles
    