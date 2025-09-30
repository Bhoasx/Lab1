public class Main {
    public static void main(String[] args) {
        Vect v1 = new Vect(3, 4);
        Vect v2 = new Vect(1, 2);

        System.out.println("v1: " + v1);
        System.out.println("v2: " + v2);
        System.out.println("Magnitud de v1: " + v1.magnitud());
        System.out.println("Suma v1 + v2: " + v1.suma(v2));
        System.out.println("Producto escalar v1 · v2: " + v1.productoEscalar(v2));
    }
}