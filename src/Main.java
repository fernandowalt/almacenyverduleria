public class Main {


    public static void main(String[] args) {
        Producto[] productos = new Producto[8];

        Fruta fruta1 = new Fruta("manzana", 1.23, 150, "verde");
        productos[0] = fruta1;
        Fruta fruta2 = new Fruta("mandarina", 2.35, 130, "naranja");
        productos[1] = fruta2;

        Lacteo lacteo1 = new Lacteo("yogur", 2.50, 200, 45);
        productos[2] = lacteo1;
        Lacteo lacteo2 = new Lacteo("leche", 3.50, 250, 85);
        productos[3] = fruta2;

        Limpieza limpieza1 = new Limpieza("lejia", 5.50, "ácido etanoico", 2);
        productos[4] = limpieza1;
        Limpieza limpieza2 = new Limpieza("detergente", 4.78, "surfactantes.", 2);
        productos[5] = limpieza2;

        NoPerecible noPerecible1 = new NoPerecible("atum", 3.45, 250, 200);
        productos[6] = noPerecible1;
        NoPerecible noPerecible2 = new NoPerecible("sardinas", 2.89, 180, 195);
        productos[7] = noPerecible2;

        for (Producto produc : productos) {
            System.out.println(produc);

        }


    }
}