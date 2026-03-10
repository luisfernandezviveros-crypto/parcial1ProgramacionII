# Parcial 1 - Programacion II

## Descripcion

Aplicacion Java para gestionar libros en una biblioteca simple.

- Implementa Programacion Orientada a Objetos (POO) y herencia.
- Maneja libros generales y libros especializados (texto, universitarios, novelas).
- Incluye operaciones de prestamo, devolucion y calculo de copias disponibles.
- Muestra informacion en consola usando toString() en cada clase.

## Estructura de carpetas

- `src/main/java/BibliotecaUniajc`

## Clases

### Libro

- Atributos: `titulo`, `autor`, `copiasTotales`, `copiasPrestadas`.
- Constructores: vacio y con parametros.
- Metodos:
  - `boolean prestamo()`
  - `boolean devolucion()`
  - `int obtenerCopiasDisponibles()`
  - `String toString()`

### LibroTexto

- Extiende `Libro`.
- Atributo extra: `curso`.
- Sobrescribe `toString()` para incluir `curso`.

### LibroTextoUNIAC

- Extiende `LibroTexto`.
- Atributo extra: `facultad`.
- Sobrescribe `toString()` para incluir `facultad`.

### Novela

- Extiende `Libro`.
- Atributo extra: `genero`.
- Sobrescribe `toString()` para incluir `genero`.

### Main

- Clase principal con `public static void main(String[] args)`.
- Crea instancias de `Libro`, `LibroTexto`, `LibroTextoUNIAC` y `Novela`.
- Imprime las instancias y demuestra la herencia y el comportamiento de los metodos.

## Ejecucion

1. `cd demo`
2. `mvn compile`
3. `java -cp target/classes BibliotecaUniajc.Main`

## Diagrama de Clases (Mermaid)

```mermaid
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



## 1) Situaciones donde no se podría realizar herencia

### Caso 1: clase final
Yo explico que si declaro la clase base como `final`, no se puede heredar de ella.  
Por ejemplo:

```java
package BibliotecaUniajc;

public final class Libro {
    // ...
}

Luego, al intentar:

obtengo el error: cannot inherit from final Libro.

Caso 2: constructor privado
También digo que si Libro tiene sólo constructor privado, las subclases no pueden invocar super(...).

Y en la subclase:

El error sería: Libro(String,String,int,int) has private access.

2) Dos nuevos atributos que puedo agregar
String isbn en Libro: me permite identificar unívocamente cada libro.
int anioPublicacion en Libro: indica el año de edición/presión.
Son atributos reales en un sistema de biblioteca y tienen sentido.

3) Método adicional que tiene sentido
Propongo un método en Libro:

Y luego en LibroTexto sobreescribirlo así:

En LibroTextoUNIAC añado facultad, y en Novela añado genero.

4) Comentario personal
Yo nombro que el código actual funciona bien, pero esta actividad es analizar potenciales problemas de herencia:

final bloquea herencia
constructor private hace imposible construir subclase
También señalo que agregando isbn, anioPublicacion y obtenerDescripcion() se mejora el dominio y facilita pruebas y salida en consola. ``````

