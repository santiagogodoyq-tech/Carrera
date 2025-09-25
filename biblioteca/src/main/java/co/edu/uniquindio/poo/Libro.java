package co.edu.uniquindio.poo;

public class Libro {
    private String titulo;
    private String autor;
    private int publicacion;
    private boolean disponibilidad;

    public Libro(String Titulo, String Autor, int Publicacion, boolean disponibilidad){
        this.titulo = Titulo;
        this.autor = Autor;
        this.publicacion = Publicacion;
        this.disponibilidad = disponibilidad;
    }
    public String getTitulo(){
        return titulo;
    }
    public String getAutor(){
        return autor;
    }
    public int getPublicacion(){
        return publicacion;
    }
    public boolean getDisponibilidad(){
        return disponibilidad;
    }
    public void setDisponibilidad(boolean disponibilidad){
        this.disponibilidad = disponibilidad;
    }
    public void setTitulo(String Titulo){
        this.titulo = Titulo;
    }
    public void setAutor(String Autor){
        this.autor = Autor;
    }
    public void setPublicacion(int Publicacion){
        this.publicacion = Publicacion;
    }
    public String toString(){
        String mostrarLibro = "titulo libro "+titulo+" autor "+autor+" año de publicacion "+publicacion+" estado de disponibilidad "+disponibilidad;
        return mostrarLibro;
    }

    public void prestar() {
        setDisponibilidad(false);
    }

    public void devolver() { setDisponibilidad(true);
    }
}
