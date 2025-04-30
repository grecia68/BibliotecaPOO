public class Revista extends RecursoBibliografico {
    private int anioPublicacion;
    private int ejemplares;

    public Revista(String titulo, String id, int anioPublicacion, int ejemplares) {
        super(titulo, id);
        this.anioPublicacion = anioPublicacion;
        this.ejemplares = ejemplares;
    }

    public boolean hayEjemplares() {
        return ejemplares > 0;
    }

    public void prestar() {
        if (hayEjemplares()) ejemplares--;
    }

    public void devolver() {
        ejemplares++;
    }

    @Override
    public void mostrarDetalle() {
        System.out.println("Revista: " + titulo + " | ISSN: " + id + " | Año: " + anioPublicacion + " | Ejemplares: " + ejemplares);
    }
}