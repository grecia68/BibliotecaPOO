import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private String nombre;
    private List<RecursoBibliografico> recursosPrestados;

    public Usuario(String nombre) {
        this.nombre = nombre;
        this.recursosPrestados = new ArrayList<>();
    }

    public void prestarRecurso(RecursoBibliografico recurso) {
        if (recurso instanceof Libro) {
            Libro libro = (Libro) recurso;
            if (!libro.isPrestado()) {
                libro.prestar();
                recursosPrestados.add(libro);
                System.out.println("Libro prestado con éxito.");
            } else {
                System.out.println("El libro ya está prestado.");
            }
        } else if (recurso instanceof Revista) {
            Revista revista = (Revista) recurso;
            if (revista.hayEjemplares()) {
                revista.prestar();
                recursosPrestados.add(revista);
                System.out.println("Revista prestada con éxito.");
            } else {
                System.out.println("No hay ejemplares disponibles.");
            }
        }
    }

    public void devolverRecurso(RecursoBibliografico recurso) {
        if (recursosPrestados.remove(recurso)) {
            if (recurso instanceof Libro) {
                ((Libro) recurso).devolver();
            } else if (recurso instanceof Revista) {
                ((Revista) recurso).devolver();
            }
            System.out.println("Recurso devuelto con éxito.");
        } else {
            System.out.println("Este recurso no está prestado por el usuario.");
        }
    }

    public void mostrarRecursosPrestados() {
        System.out.println("Recursos prestados por " + nombre + ":");
        for (RecursoBibliografico r : recursosPrestados) {
            r.mostrarDetalle();
        }
    }
}