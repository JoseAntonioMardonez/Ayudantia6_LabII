package model;

public class Biblioteca {
    //Atributos
    private String nombre;
    private String direccion;
    private String horarioDeAtencion;

    //Constructor
    public Biblioteca(String nombre, String direccion, String horarioDeAtencion){
        this.nombre=nombre;
        this.direccion=direccion;
        this.horarioDeAtencion=horarioDeAtencion;
    }
    //Métodos
    public String getNombre() {
        return this.nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return this.direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public String getHorarioDeAtencion() {
        return this.horarioDeAtencion;
    }
    public void setHorarioDeAtencion(String horarioDeAtencion) {
        this.horarioDeAtencion = horarioDeAtencion;
    }
    //Método para agregar un nuevo libro a la base de datos.
    public void agregarLibro(){

    }
    //Método para eliminar un libro de la base de datos.
    public void eliminarLibro(){

    }
    //Método para buscar un libro en la base de datos por su autor.
    public void buscarLibroPorAutor(){

    }
    //Método para prestar un libro de la base de datos y actualizar la información en la base de datos.
    public void prestarLibro(){

    }
    //Método para devolver un libro a la base de datos y actualizar la información en la base de datos.
    public void devolverLibro(){

    }
}
