public class Bicicleta implements Transporte {

    public static final int palet=5;
    public static final int envoltorio_carton=10;
    public static final int caja_madera=15;
    @Override
    public float coste_total(int CP) {
        if (CP < 30000) {
            System.out.println("El coste de tu envio en bici es de 10€");
        } else {
            System.out.println("El coste de tu envio en bici es de 15€");
        }
        return 0;
    }

    @Override
    public int tipoEmbalaje(Float x, Float y, Float z, Float peso) {

        if (peso<=palet){
            System.out.println("Tu embalaje es un palet");
        }
        if (peso>palet && peso<=envoltorio_carton){
            System.out.println("Tu embalaje es un carton");
        }
        if (peso>envoltorio_carton && peso<=caja_madera){
            System.out.println("Tu embalaje es un madero");
        }

        return 0;
    }
}
