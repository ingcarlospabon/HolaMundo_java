public class texto {
    public static void main(String[] args) {
        String text = new String("Hola mundo con string");

        System.out.println(text);

        int largo = text.length();
        System.out.println(largo);

        String texto = text.replace("Hola", "Adios");
        System.out.println(texto);

        System.out.println(texto.endsWith("undo"));
        System.out.println(texto.startsWith("Adi"));
        System.out.println(texto.contains("und"));
        System.out.println(texto.indexOf("Mund"));
        System.out.println("===========");
        System.out.println(texto.toUpperCase());
        System.out.println(texto.toLowerCase());
        System.out.println("===========");

        
        String malo = "      Chanchito    feliz     ";
        System.out.println(malo);
        System.out.println(malo.trim());
    }
}
