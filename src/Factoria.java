/**
 Esta es una clase Factoria que utiliza el patrón de diseño Factory.
 Proporciona un método estático para obtener diferentes tipos de transporte en función del medio de envío.
 */
public class Factoria {

    /**
     Constante que representa el medio de envío de bicicleta.
     */
    public static final int BICICLETA = 1;
    /**
     Constante que representa el medio de envío de camión.
     */
    public static final int CAMION = 2;
    /**
     Constante que representa el medio de envío de barco.
     */
    public static final int BARCO = 3;

    /**
     Obtiene un objeto de transporte en función del medio de envío especificado.
     @param medio_de_envio el medio de envío del transporte deseado.
     @return el objeto de transporte correspondiente.
     */
    public static Transporte getProducto(int medio_de_envio) {

        switch (medio_de_envio) {
            case BICICLETA:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            case BARCO:
                return new Barco();
            default:
                return null;
        }

    }

}