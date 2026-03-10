# parcial1ProgramacionII

Descripcion

Aplicacion Java para gestionar libros en una biblioteca simple.
Muestra herencia de clases: Libro, LibroTexto, LibroTextoUNIAC y Novela.
Usa metodos de prestamo, devolucion, obtenerCopiasDisponibles y toString para imprimir informacion.

Estructura de carpetas
src/main/java/BibliotecaUniajc
Clases

Libro
Atributos titulo, autor, copiasTotales y copiasPrestadas.
Incluye constructor y los metodos prestamo, devolucion, obtenerCopiasDisponibles y toString.

LibroTexto
Extiende Libro y agrega el atributo curso.

LibroTextoUNIAC
Extiende LibroTexto y agrega el atributo facultad.

Novela
Extiende Libro y agrega el atributo genero.

Main
Metodo main que crea e imprime objetos de Libro, LibroTexto, LibroTextoUNIAC y Novela.

Ejecucion
cd demo
mvn compile
java -cp target/classes BibliotecaUniajc.Main
Diagrama de clases

Archivo generado: diagrama_clases.puml
Herencia: Libro <- LibroTexto <- LibroTextoUNIAC y Libro <- Novela.
La clase Main instancia todas las clases del sistema.

Objetivo

Practicar programacion orientada a objetos e herencia en Java.
Implementar una clase base y subclases con atributos y metodos propios.
Mostrar la ejecucion en consola utilizando el metodo toString de cada objeto.

## Diagrama de Clases

### Mermaid
classDiagram
    class Libro {
        - String titulo
        - String autor
        - int copiasTotales
        - int copiasPrestadas
        + Libro()
        + Libro(String, String, int, int)
        + boolean prestamo()
        + boolean devolucion()
        + int obtenerCopiasDisponibles()
        + String toString()
    }

    class LibroTexto {
        - String curso
        + LibroTexto(String, String, int, int, String)
        + String toString()
    }

    class LibroTextoUNIAC {
        - String facultad
        + LibroTextoUNIAC(String, String, int, int, String, String)
        + String toString()
    }

    class Novela {
        - String genero
        + Novela(String, String, int, int, String)
        + String toString()
    }

    class Main {
        + static void main(String[] args)
    }

    LibroTexto --|> Libro : extends
    LibroTextoUNIAC --|> LibroTexto : extends
    Novela --|> Libro : extends

    Main "1" --> "1..*" Libro : crea
    Main "1" --> "1..*" LibroTexto : crea
    Main "1" --> "1..*" LibroTextoUNIAC : crea
    Main "1" --> "1..*" Novela : crea