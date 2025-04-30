import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Usuario usuario = new Usuario("Juan");

        List<RecursoBibliografico> recursos = new ArrayList<>();
        recursos.add(new Libro("1984", "ISBN001", "George Orwell"));
        recursos.add(new Libro("El Quijote", "ISBN002", "Miguel de Cervantes"));
        recursos.add(new Libro("Cien Años de Soledad", "ISBN003", "Gabriel García Márquez"));
        recursos.add(new Libro("Harry Potter", "ISBN004", "J.K. Rowling"));
        recursos.add(new Libro("El Hobbit", "ISBN005", "J.R.R. Tolkien"));

        recursos.add(new Revista("Ciencia Hoy", "ISSN001", 2023, 2));
        recursos.add(new Revista("Historia Viva", "ISSN002", 2022, 1));
        recursos.add(new Revista("National Geographic", "ISSN003", 2024, 3));

        while (true) {
            System.out.println("\n--- Menú Biblioteca ---");
            System.out.println("1. Ver recursos");
            System.out.println("2. Prestar recurso");
            System.out.println("3. Devolver recurso");
            System.out.println("4. Ver recursos prestados");
            System.out.println("5. Salir");
            System.out.print("Seleccione una opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine();

            switch (opcion) {
                case 1:
                    for (int i = 0; i < recursos.size(); i++) {
                        System.out.print(i + ". ");
                        recursos.get(i).mostrarDetalle();
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el número del recurso a prestar: ");
                    int prestamo = scanner.nextInt();
                    usuario.prestarRecurso(recursos.get(prestamo));
                    break;
                case 3:
                    System.out.print("Ingrese el número del recurso a devolver: ");
                    int devolucion = scanner.nextInt();
                    usuario.devolverRecurso(recursos.get(devolucion));
                    break;
                case 4:
                    usuario.mostrarRecursosPrestados();
                    break;
                case 5:
                    System.out.println("Gracias por usar el sistema.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }
}