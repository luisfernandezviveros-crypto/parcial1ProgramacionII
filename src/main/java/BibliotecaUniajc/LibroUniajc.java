package BibliotecaUniajc;
public class LibroUniajc {
    // Atributos de la clase 
    private String titulo;
    private String autor;
    private int copiasTotales;
    private int  copiasPrestadas;

    // construtores 
    public LibroUniajc() {
    }
    public LibroUniajc(String titulo, String autor, int copiasTotales, int copiasPrestadas) {
        this.titulo = titulo;
        this.autor = autor;
        this.copiasTotales = copiasTotales;
        this.copiasPrestadas = copiasPrestadas;
    }

    // metodo para registrar prestamo
    public boolean prestamo(){
        if(copiasPrestadas < copiasTotales){
            copiasPrestadas++;
            return true;
        }
        return false;
    }

    // metodo para registrar devolución
    public boolean devolucion(){
        if(copiasPrestadas > 0){
            copiasPrestadas--;
            return true;
        }
        return false;
    }

    public int obtenerCopiasDisponibles() {
        return copiasTotales - copiasPrestadas;
    }

    // Mostrar información del libro
    public String toString() {
        return "\n*** LIBRO REGISTRADO ***" +
               "\nTitulo: " + titulo +
               "\nAutor: " + autor +
               "\nCopias totales: " + copiasTotales +
               "\nCopias prestadas: " + copiasPrestadas +
               "\nCopias disponibles: " + obtenerCopiasDisponibles();
    }
}
