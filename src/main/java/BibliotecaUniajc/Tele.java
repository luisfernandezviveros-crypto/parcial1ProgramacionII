package BibliotecaUniajc;

public class Tele extends LibroUniajc {

    private String genero;

    // constructor
    public Tele(String titulo, String autor, int copiasTotales, int copiasPrestadas, String genero) {

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
