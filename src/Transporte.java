/**
 Esta es una interfaz que representa un transporte.
 Proporciona métodos para calcular el coste total del transporte y el tipo de embalaje necesario.
 */
public interface Transporte {

    /**
     Calcula el coste total del transporte en función del código postal proporcionado.
     @param CP el código postal del destino del transporte.
     @return el coste total del transporte.
     */
    float coste_total(int CP);

    /**
     Calcula el tipo de embalaje necesario en función de las dimensiones y el peso del paquete.
     @param x la longitud del paquete.
     @param y la anchura del paquete.
     @param z la altura del paquete.
     @param peso el peso del paquete.
     @return el tipo de embalaje necesario.
     */
    int tipoEmbalaje(Float x, Float y, Float z, Float peso);
}