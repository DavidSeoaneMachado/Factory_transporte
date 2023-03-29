
public class Barco implements Transporte {

    public static final int palet = 5;
    public static final int envoltorio_carton = 10;
    public static final int caja_madera = 15;

    @Override
    public float coste_total(int CP) {
        int coste = 0;
        if (CP < 30000) {
            System.out.println("El coste de tu envio en camion es de 1000€");
            coste = 1000;
        } else {
            System.out.println("El coste de tu envio en camion es de 1500€");
            coste = 1500;
        }
        return coste;
    }

    @Override
    public int tipoEmbalaje(Float x, Float y, Float z, Float peso) {
        return 0;


    }
}
