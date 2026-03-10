package BibliotecaUniajc;

public class LibroTxtU extends LibroTxt {

    private String facultad;

    // constructor
    public LibroTxtU(String titulo, String autor,
                     int copiasTotales, int copiasPrestadas,
                     String curso, String facultad) {

        super(titulo, autor, copiasTotales, copiasPrestadas, curso);
        this.facultad = facultad;
    }

    // mostrar información
    public String toString() {
        return super.toString() +
               "\nFacultad: " + facultad;
    }
}