package BibliotecaUniajc;

public class Main {

    public static void main(String[] args) {
        System.out.println("Parcial 1 - Programacion II");

        System.out.println("*** INICIO ***");
        System.out.println();

        Libro libro1 = new Libro("Batman","LR",10,2);

        LibroTexto libro2 = new LibroTexto("Programacion","Ana",8,1,"Programacion II");

        LibroTextoUNIAC libro3 = new LibroTextoUNIAC("Estructura de Datos","Luis Gomez",6,2,"Estructuras","Ingenieria");

        Novela novela1 = new Novela("El misterio", "Juan ",5,1,"Suspenso");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(novela1);

        System.out.println();
        System.out.println("*** FIN ***");
    }
}
