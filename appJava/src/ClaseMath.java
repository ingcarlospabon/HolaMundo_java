public class ClaseMath {
    public static void main(String[] args) {
        System.out.println("Numero Absoluta de -15" + Math.abs(-15)); //trae el absoluto de numero
        System.out.println("Redondear 10 hacia arriba" + Math.ceil(10.0001)); //redondea el numero hacia arriba
        System.out.println("Redondear 10 hacia abajo" + Math.floor(10.0001)); //redondea el numero hacia arriba

        System.out.println("El numero mayor entre 15 y 25" + Math.max(15, 25));
        System.out.println("El numero menor entre 15 y 25" + Math.min(15, 25));

        double random = Math.random();
        System.out.println("numero aleatorio: " + random * 100);
    }
}
