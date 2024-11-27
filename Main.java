public class Main {
    public static void main(String[] args) {
        
        Libro libro1 = new Libro("El Quijote", "Miguel de Cervantes", 1605, true);
        Libro libro2 = new Libro("Las aventuras de Alicia en el país de las maravillas", "Lewis Carroll", 1865, false);
        Libro libro3 = new Libro("Boulevard", "Flor M. Salvador", 2016, false);
        Libro libro4 = new Libro("Romeo y Julieta", "William Shakespeare", 1597, false);
        Libro libro5 = new Libro("Bajo la misma estrella", "John Green", 2012, true);
        Libro libro6 = new Libro("A todos los chicos de los que me enamoré", "Jenny Han", 2009, true);
        Libro libro7 = new Libro("Orgullo y prejuicio", "Jane Austen", 1813, true);
        Libro libro8 = new Libro("Yo antes de ti", "Jojo Moyes", 2012, false);
        Libro libro9 = new Libro("Cincuenta sombras de Grey", "E.L. James", 2009, false);
        Libro libro10 = new Libro("Cien años de soledad", "Gabriel García Márquez", 1967, true);

        Biblioteca biblioteca = new Biblioteca();

        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);
        biblioteca.agregarLibro(libro4);
        biblioteca.agregarLibro(libro5);
        biblioteca.agregarLibro(libro6);
        biblioteca.agregarLibro(libro7);
        biblioteca.agregarLibro(libro8);
        biblioteca.agregarLibro(libro9);
        biblioteca.agregarLibro(libro10);

        biblioteca.mostrarLibrosDisponibles();
    }
}


