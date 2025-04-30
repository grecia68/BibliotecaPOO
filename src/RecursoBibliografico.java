public abstract class RecursoBibliografico {
    protected String titulo;
    protected String id;

    public RecursoBibliografico(String titulo, String id) {
        this.titulo = titulo;
        this.id = id;
    }

    public abstract void mostrarDetalle();
}