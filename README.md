# 🚀 PRÁCTICA: SISTEMA DE GESTIÓN DE BIBLIOTECA CON POO Y HERENCIA EN JAVA

### Objetivo:
Desarrollar un sistema de gestión de biblioteca en java aplicando los fundamentos de Programación orientados a objetos (POO) y herencia, utilizando GitHub para control de versiones y Microsoft Planner para gestión de tareas.

### Descripción del sistema:
el programa simulará una biblioteca con dos tipos de recursos:
1. Libros (título, autor, ISBN y estado de préstamo)
2. Revistas (título, ISSN, año de publicación y número de ejemplares)

Ambos tipos heredarán de una clase abstracta recursosBinliografico. Además, se implementará una clase usuario para gestionar préstamos y devoluciones.

Este código en Java implementa un sistema de gestión de biblioteca básico donde un usuario puede ver, prestar y devolver recursos bibliográficos como libros y revistas.

### Estructura del código principal:
> Scanner scanner: permite leer la entrada del usuario.

> Usuario usuario = new Usuario("Juan");: crea un objeto de tipo Usuario llamado "Juan".

> List<RecursoBibliografico> recursos: lista que almacena libros y revistas (heredan de una clase base RecursoBibliografico, que no está mostrada pero se asume).

### Carga de recursos:
Se agregan 5 libros y 3 revistas al sistema con títulos, identificadores y autores (o año y volumen para revistas.

### Menú interactivo :
Se muestra un menú con 5 opciones:

- Opción 1 – Ver recursos: muestra todos los recursos disponibles con sus detalles.

- Opción 2 – Prestar recurso: el usuario indica el índice del recurso y lo presta.

- Opción 3 – Devolver recurso: el usuario indica qué recurso devolver.

- Opción 4 – Ver recursos prestados: muestra los recursos actualmente en préstamo por el usuario.

- Opción 5 – Salir: termina el programa y cierra el Scanner.

### Clases:
> RecursoBibliografico (clase base abstracta o interfaz)

> Libro y Revista (subclases de RecursoBibliografico)

> Usuario con métodos prestarRecurso(), devolverRecurso(), y mostrarRecursosPrestados().

### Capturas
<img src="">

