package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Biblioteca{
    private String Nombre;
    private ArrayList<Libro> ListaLibro;

    public Biblioteca(String Nombre){
        this.Nombre = Nombre;
        this.ListaLibro = new ArrayList<>();
    }
    public String getNombre(){
        return this.Nombre;
    }
    public ArrayList<Libro> getListaLibro(){
        return this.ListaLibro;
    }

    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }

    public void setListaLibro(ArrayList<Libro> ListaLibro){
        this.ListaLibro = ListaLibro;
    }

    public String registrarLibro(Libro libro){
        String respuesta = "";
        Libro libroencontrado = null;
        libroencontrado = buscarLibro(libro.getTitulo());
        if(libroencontrado == null){
            ListaLibro.add(libro);
            System.out.println(respuesta = "Resgistrado con exito");
        }else{
            System.out.println(respuesta = "el libro ya existe");
        }
        return respuesta;
    }
    public Libro buscarLibro(String Nombre){
    Libro buscar = null;
    for (Libro libro : ListaLibro){
        if (libro.getTitulo().equals(Nombre)){
            buscar = libro;
        }
    }
    return buscar;
    }
    public String prestarLibro(String titulo){
        String respuesta = "";

        Libro libroencontrado = null;
        libroencontrado = buscarLibro(titulo);
        if(libroencontrado != null){
         if(libroencontrado.getDisponibilidad()){
                libroencontrado.prestar();
                respuesta = libroencontrado.getTitulo();
            }
        }

        return respuesta;
    }
    public String devolverLibro(String titulo){
        String respuesta = "";

        Libro libroencontrado = null;
        libroencontrado = buscarLibro(titulo);
        if(libroencontrado != null){
            if(libroencontrado.getDisponibilidad()){
                libroencontrado.devolver();
                respuesta = libroencontrado.getTitulo();
            }
        }

        return respuesta;
    }
    public Libro bucarAutor(String autor){
        Libro autorL = null;
        for (Libro libro : ListaLibro){
            if (libro.getAutor().equals(autor)){
                autorL = libro;
            }
        }
        return autorL;
    }
    public String toString(){
        String respuesta = ListaLibro.toString()+"\n";
        return respuesta;
    }
}
