public class OperAritmeticos {
    public static void main(String[] args) {
        int a = 2 + 2;
        int b = 5 - 2;
        int c = 3 * 3;
        int d = 10 / 3;
        int m = 4 % 3;
        System.out.println(a + " " + b + " " + c + " " + d + " " + m);

        //incremento, decremento
        a+=1;
        b-=1;
        c*=3;
        d/=2;
        System.out.println(a + " " + b + " " + c + " " + d + " " + m);

        //conversionde tipos
      /*  byte x = 1;
        int Y = 15;
        int z = x + (byte) y;
        System.out.println(z);*/

        //Clase Math

        System.out.println("Numero Absoluta de -15" + Math.abs(-15)); //trae el absoluto de numero
        System.out.println("Redondear 10 hacia arriba" + Math.ceil(10.0001)); //redondea el numero hacia arriba
        System.out.println("Redondear 10 hacia abajo" + Math.floor(10.0001)); //redondea el numero hacia arriba

        System.out.println("El numero mayor entre 15 y 25" + Math.max(15, 25));
        System.out.println("El numero menor entre 15 y 25" + Math.min(15, 25));

        double random = Math.random();
        System.out.println("numero aleatorio: " + random * 100);
    }
}
