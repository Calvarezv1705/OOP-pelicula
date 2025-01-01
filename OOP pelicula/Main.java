public class Main {

    public static void main(String[] args) {
        int max_peliculas = 10;
        Tienda netflix = new Tienda(max_peliculas);

        Pelicula p1 = new Pelicula("001", "The Good, the Bad and the Ugly", 1966, "Western", "Clint Eastwood");
        netflix.adicionar(p1);

        Pelicula p2 = new Pelicula("002", "Django Unchained", 2012, "Western", "Jamie Foxx");
        netflix.adicionar(p2);

        Pelicula p3 = new Pelicula("003", "Inception", 2010, "Science Fiction", "Leonardo DiCaprio");
        netflix.adicionar(p3);

        p2.imprimir();

        System.out.println("Películas del género 'Western':");
        boolean encontradas = netflix.buscarPeliculaPorGenero("Western");
        if (!encontradas) {
            System.out.println("No se encontraron películas del género 'Western'.");
        }
    }
}
