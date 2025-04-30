public class Libro extends RecursoBibliografico {
    private String autor;
    private boolean prestado;

    public Libro(String titulo, String id, String autor) {
        super(titulo, id);
        this.autor = autor;
        this.prestado = false;
    }

    public boolean isPrestado() {
        return prestado;
    }

    public void prestar() {
        this.prestado = true;
    }

    public void devolver() {
        this.prestado = false;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Libro: " + titulo + " | Autor: " + autor + " | ISBN: " + id + " | Prestado: " + prestado);
    }
}