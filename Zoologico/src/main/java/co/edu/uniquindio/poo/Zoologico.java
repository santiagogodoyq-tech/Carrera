package co.edu.uniquindio.poo;

import javax.swing.*;
import java.util.*;
import java.lang.*;

public class Zoologico {
    private String nombre;
    private String direccion;
    private ArrayList<Animal> listaAnimal;
    public Zoologico(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaAnimal = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public ArrayList<Animal> getListaAnimal() {
        return listaAnimal;
    }
    public void setListaAnimal(ArrayList<Animal> listaAnimal) {
        this.listaAnimal = listaAnimal;
    }
    public Optional<Animal> buscarAnimal(String codigo){
        return listaAnimal.stream().filter(animal -> animal.getCodigo().equals(codigo)).findFirst();
    }
    public void sonido(Animal animal){
        JOptionPane.showMessageDialog(null, "Sonido: " + animal.getSonido());
    }
    public void agregarAnimal(Animal mascota){
        String respuesta = "";
        Optional<Animal> mascotaBuscada = Optional.empty();
        mascotaBuscada = buscarAnimal(mascota.getCodigo());
        if(mascotaBuscada.isEmpty()){
            listaAnimal.add(mascota);
            respuesta = "Se ha ingresado el animal "+mascota.getNombre()+" al zoologico";
        }else{
            respuesta = "El animal "+mascota.getNombre()+" ya esta registrada";
        }
        System.out.println(respuesta);
    }
    public void eliminarAnimal(Animal mascota){
        String respuesta = "";
        Optional<Animal> mascotaBuscada = Optional.empty();
        mascotaBuscada = buscarAnimal(mascota.getCodigo());
        if(mascotaBuscada.isPresent()){
            listaAnimal.remove(mascota);
            respuesta = "Se ha removido al animal "+mascota.getNombre()+" del zoologico";
        }else{
            respuesta = "El animal "+mascota.getNombre()+" no esta registrada";
        }
        System.out.println(respuesta);
    }
    public String toString(){
        String respuesta = "Mascotas registradas en la veteniraria "+nombre+": "+"\n"+listaAnimal;
        return respuesta;
    }
}
