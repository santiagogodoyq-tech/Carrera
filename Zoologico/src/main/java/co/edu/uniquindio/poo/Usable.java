package co.edu.uniquindio.poo;

public class Usable {
    private String nombre;
    private String tipo;
    public Usable(String nombre, String tipo) {
        this.nombre = nombre;
        this.tipo = tipo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
}
