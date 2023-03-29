## Factory Transporte

Aplicación en java que distinge diferentes tipo de transporte para enviar un paquete.

- Instanciar diferentes tipos de transportes: barco, camión y bicicleta
- Por medio del metodo getProducto de la clase Factoria generamos distintos vehiculos en funcion de los datos recibidos.
- Métodos comunes:
  - costeTotal(Integer cp) : Float
    - Recibe el código postal
    - Devuelve el coste 
  - tipoEmbalaje(Float x, Float y, Float z, Float peso): Integer
    - Recibe dimensiones y peso
    - Devuelve tipo de embalaje (que es un entero)
      - 0 - palet
      - 1 - envoltorio cartón
      - 2 - caja de madera
