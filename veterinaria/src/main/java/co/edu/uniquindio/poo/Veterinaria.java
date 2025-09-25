package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Veterinaria{
    private String nombre;
    private ArrayList<Mascota> listaMascota;
    public Veterinaria(String nombre){
        this.nombre=nombre;
        this.listaMascota=new ArrayList<>();
    }
    public String getnombre(){
        return nombre;
    }
    public ArrayList<Mascota> getlistaMascota(){
        return listaMascota;
    }
    public void setnombre(String nombre){
        this.nombre=nombre;
    }
    public void setlistaMascota(ArrayList<Mascota> listaMascota){
        this.listaMascota=listaMascota;
    }
    public Mascota buscarMascota(String codigo){
        Mascota mascotaBuscada =null;
        for(Mascota m:listaMascota){
            if(m.getcodigo().equals(codigo)){
            mascotaBuscada =m;
            }
        }
        return mascotaBuscada;
    }
    public void agregarMascota(Mascota mascota){
    String respuesta = "";
    Mascota mascotaBuscada = null;
    mascotaBuscada = buscarMascota(mascota.getcodigo());
    if(mascotaBuscada==null){
        listaMascota.add(mascota);
        respuesta = "Se ha ingresado la mascota "+mascota.getnombre()+" a la veterinaria";
    }else{
        respuesta = "La mascota "+mascota.getnombre()+" ya esta registrada";
    }
    System.out.println(respuesta);
    }
    public void eliminarMascota(Mascota mascota){
        String respuesta = "";
        Mascota mascotaBuscada = null;
        mascotaBuscada = buscarMascota(mascota.getcodigo());
        if(mascotaBuscada!=null){
            listaMascota.remove(mascota);
            respuesta = "Se ha removido la mascota "+mascota.getnombre()+" de la veterinaria";
        }else{
            respuesta = "La mascota "+mascota.getnombre()+" no esta registrada";
        }
        System.out.println(respuesta);
    }
    public String toString(){
        String respuesta = "Mascotas registradas en la veteniraria "+nombre+": "+"\n"+listaMascota;
        return respuesta;
    }
}
