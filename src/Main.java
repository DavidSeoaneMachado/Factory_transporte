public class Main {
    static Transporte salida;
    public static void main(String[] args) {

        salida = Factoria.getProducto(Factoria.BICICLETA);
        salida.coste_total(200);
        salida.tipoEmbalaje(4F, 4.2F, 4.18F, 7.6F);

        salida = Factoria.getProducto(Factoria.CAMION);
        salida.coste_total(70000);
        salida.tipoEmbalaje(4F, 4.2F, 4.18F, 1.6F);
    }


}
