package BibliotecaUniajc;

public class Novela extends LibroUniajc {

    private String genero;

    // constructor
    public Novela(String titulo, String autor, int copiasTotales, int copiasPrestadas, String genero) {

        super(titulo, autor, copiasTotales, copiasPrestadas);
        this.genero = genero;
    }

    // mostrar información
    @Override
    public String toString() {
        return super.toString() +
               "\nGenero: " + genero;
    }
}
