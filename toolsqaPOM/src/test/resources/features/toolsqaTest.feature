#language:es
#encoding:iso-8859-1
Característica: Yo como usuario requiero ingresar al formulario de toolsQA y diligenciar el formulario

  Escenario: Diligenciar formulario
    Dado el usuario ingresa a la pagina principal de toolsqa
    Cuando ingresa los datos del formulario
      | firstName | lastName |sex |experience|date				|profession		|photo																													|tool					|continents		|commands						|
      | Melissa   | Calero   |F		|7				 |2019/07/01	|Manual Tester|C:\\Users\\melicara\\Documents\\PERSONAL\\Mapa mental etica.png|Selenium IDE	|South America|WebElement Commands|
      | Jorge     | Calero   |M		|7				 |2019/07/01	|Manual Tester|C:\\Users\\melicara\\Documents\\PERSONAL\\Mapa mental etica.png|Selenium IDE	|South America|WebElement Commands|
    Y se da clic en el link para descargar el primer archivo
    Y se da clic para enviar el formulario
    Entonces valido que aparezca el nombre de Automation Practice Form