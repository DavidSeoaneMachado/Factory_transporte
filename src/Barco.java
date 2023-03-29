
public class Barco implements Transporte {

    public static final int palet = 5;
    public static final int envoltorio_carton = 10;
    public static final int caja_madera = 15;

    @Override
    public float coste_total(int CP) {
        int coste = 0;
        if (CP < 30000) {
            System.out.println("El coste de tu envio en barco es de 1000€");
            coste = 1000;
        } else {
            System.out.println("El coste de tu envio en barco es de 1500€");
            coste = 1500;
        }
        return coste;
    }

    @Override
    public int tipoEmbalaje(Float x, Float y, Float z, Float peso) {

        int embalaje = palet;

        if (peso <= palet) {
            System.out.println("Tu embalaje es un palet");
            embalaje = 1;
        }
        if (peso > palet && peso <= envoltorio_carton) {
            System.out.println("Tu embalaje es un carton");
            embalaje = envoltorio_carton;
        }
        if (peso > envoltorio_carton && peso <= caja_madera) {
            System.out.println("Tu embalaje es un madero");
            embalaje = caja_madera;
        }
        return embalaje;
    }
}
