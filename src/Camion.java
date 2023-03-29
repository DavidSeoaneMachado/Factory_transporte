public class Camion implements Transporte {

    public static final int palet = 5;
    public static final int envoltorio_carton = 10;
    public static final int caja_madera = 15;

    @Override
    public float coste_total(int CP) {
        int coste = 0;
        if (CP < 30000) {
            System.out.println("El coste de tu envio en camion es de 100€");
            coste = 100;
        } else {
            System.out.println("El coste de tu envio en camion es de 150€");
            coste = 150;
        }
        return coste;
    }

    @Override
    public int tipoEmbalaje(Float x, Float y, Float z, Float peso) { //En este caso utilizo solo el peso para determinar el embalaje

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
