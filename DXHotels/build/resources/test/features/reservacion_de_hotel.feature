#author: Diana Camacho
#language: es
#encoding: utf-8

Característica: Reserva de hotel
  Yo como usuario de viajes DX Hotels
  Quiero hacer una busqueda de hoteles
  Para reservar una habitación

  Esquema del escenario: Reserva de la tarifa mas economica del hotel
    Dado que el usuario realiza una busqueda de hoteles
      | locacion   | fechaIngreso   | fechaSalida   |
      | <locacion> | <fechaIngreso> | <fechaSalida> |
    Cuando el selecciona el hotel con la tarifa más economica
    Entonces el puede validar el precio total a pagar

    Ejemplos:

      | locacion  | fechaIngreso | fechaSalida |
      | Las Vegas | 25 Oct 2022  | 30 Oct 2022 |

