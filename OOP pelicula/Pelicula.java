public class Pelicula {
    private String identificador;
    private String nombre;
    private int año;
    private String genero;
    private String protagonistaPrincipal;

    public Pelicula(String identificador, String nombre, int año, String genero, String protagonistaPrincipal) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.año = año;
        this.genero = genero;
        this.protagonistaPrincipal = protagonistaPrincipal;
    }

    public String getIdentificador() {
        return identificador;
    }

    public void setIdentificador(String identificador) {
        this.identificador = identificador;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getProtagonistaPrincipal() {
        return protagonistaPrincipal;
    }

    public void setProtagonistaPrincipal(String protagonistaPrincipal) {
        this.protagonistaPrincipal = protagonistaPrincipal;
    }

    public void imprimir() {
        System.out.println("Identificador: " + identificador);
        System.out.println("Nombre: " + nombre);
        System.out.println("Año: " + año);
        System.out.println("Género: " + genero);
        System.out.println("Protagonista principal: " + protagonistaPrincipal);
    }
}
