public class Tienda {
    private Pelicula[] arrpelis;
    private int max_peliculas;
    private int num_peliculas;

    public Tienda(int max_peliculas) {
        this.max_peliculas = max_peliculas;
        this.arrpelis = new Pelicula[max_peliculas];
        this.num_peliculas = 0;
    }

    public boolean adicionar(Pelicula p) {
        if (num_peliculas < max_peliculas) {
            arrpelis[num_peliculas] = p;
            num_peliculas++;
            return true;
        }
        return false;
    }

    public boolean buscarPeliculaPorGenero(String genero) {
        boolean encontrada = false;
        for (int i = 0; i < num_peliculas; i++) {
            if (arrpelis[i].getGenero().equalsIgnoreCase(genero)) {
                arrpelis[i].imprimir();
                encontrada = true;
            }
        }
        return encontrada;
    }
}
