public class Main {
    /**
     * Proyecto del patron Factory
     *
     * @author David Seoane
     * @version 0.2
     */
    static Transporte salida;
    public static void main(String[] args) {

        salida = Factoria.getProducto(Factoria.BICICLETA);
        salida.coste_total(200);
        salida.tipoEmbalaje(4F, 4.2F, 4.18F, 7.6F);

        salida = Factoria.getProducto(Factoria.CAMION);
        salida.coste_total(70000);
        salida.tipoEmbalaje(4F, 4.2F, 4.18F, 1.6F);

        //Ejemplo de como se utilizaria para generar un Barco de transporte//
        salida = Factoria.getProducto(Factoria.BARCO);
        salida.coste_total(36206);
        salida.tipoEmbalaje(9F, 4.2F, 4.18F, 14F);
    }


}
