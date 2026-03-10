package BibliotecaUniajc;

public class Main {

    public static void main(String[] args) {
        System.out.println("Parcial 1 - Programacion II");

        System.out.println("*** INICIO ***");
        System.out.println();

        LibroUniajc libro1 = new LibroUniajc("Batman","LR",10,2);

        LibroTxt libro2 = new LibroTxt("Programacion","Ana",8,1,"Programacion II");

        LibroTxtU libro3 = new LibroTxtU("Estructura de Datos","Luis Gomez",6,2,"Estructuras","Ingenieria");

        Tele novela1 = new Tele("El misterio", "Juan ",5,1,"Suspenso");

        System.out.println(libro1);
        System.out.println(libro2);
        System.out.println(libro3);
        System.out.println(novela1);

        System.out.println();
        System.out.println("*** FIN ***");
    }
}
