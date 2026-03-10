package BibliotecaUniajc;

public class LibroTexto extends Libro {

    private String curso;

    // constructor
    public LibroTexto(String titulo, String autor,  int copiasTotales, int copiasPrestadas, String curso) {

        super(titulo, autor, copiasTotales, copiasPrestadas);
        this.curso = curso;
    }

    // mostrar información
    public String toString() {
        return super.toString() +
               "\nCurso: " + curso;
    }
}
