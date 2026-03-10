package BibliotecaUniajc;

public class LibroTxt extends LibroUniajc {

    private String curso;

    // constructor
    public LibroTxt(String titulo, String autor,  int copiasTotales, int copiasPrestadas, String curso) {

        super(titulo, autor, copiasTotales, copiasPrestadas);
        this.curso = curso;
    }

    // mostrar información
    public String toString() {
        return super.toString() +
               "\nCurso: " + curso;
    }
}
