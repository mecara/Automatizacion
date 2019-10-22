

@tag
Feature: Yo como usuario necesito inrgesar los valores de formulario de Toolsqa para llenarlos

  @llenarFormulario
  Scenario: llenar Formulario
    Given Dado que estoy en el formulario de Toolsqa
    When ingreso los valores al formulario
      | firstName | lastName |sex |experience|date				|profession		|photo																										 |tool					|continents		|commands						|
      | Melissa   | Calero   |F		|7				 |2019/07/01	|Manual Tester|C:\Users\melicara\Documents\PERSONAL\Mapa mental etica.png|Selenium IDE	|South America|WebElement Commands|
      | Jorge     | Calero   |M		|7				 |2019/07/01	|Manual Tester|C:\Users\melicara\Documents\PERSONAL\Mapa mental etica.png|Selenium IDE	|South America|WebElement Commands|
    Then veo el mensaje de Automation Practice Form


