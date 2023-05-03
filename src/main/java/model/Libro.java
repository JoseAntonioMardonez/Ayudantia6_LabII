package model;

public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    private String fechaDePublicacion;
    private String genero;

    //Constructor
    public Libro(String titulo, String autor, String fechaDePublicacion, String genero){
        this.titulo=titulo;
        this.autor=autor;
        this.fechaDePublicacion=fechaDePublicacion;
        this.genero=genero;
    }
    //Métodos
    public String getTitulo() {
        return this.titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getAutor() {
        return this.autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String getFechaDePublicacion() {
        return this.fechaDePublicacion;
    }
    public void setFechaDePublicacion(String fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }
    public String getGenero() {
        return this.genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    //Método toString
    public String toString(){
        return titulo+", "+autor+", "+fechaDePublicacion+", "+genero;
    }

}