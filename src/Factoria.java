public class Factoria {

    public static final int BICICLETA = 1;
    public static final int CAMION = 2;


    public static Transporte getProducto(int medio_de_envio) {

        switch (medio_de_envio) {
            case BICICLETA:
                return new Bicicleta();
            case CAMION:
                return new Camion();
            default:
                return null;
        }

    }


}
