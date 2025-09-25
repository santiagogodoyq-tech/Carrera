package co.edu.uniquindio.poo;
public class Mascota{
    private String codigo;
    private String nombre;
    private int edad;
    private String raza;
    private int peso;
    private String enfermedades;
    public Mascota(String codigo, String nombre, int edad, String raza,int peso, String enfermedades) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.peso = peso;
        this.enfermedades = enfermedades;
    }
    public void setcodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setnombre(String nombre) {
        this.nombre = nombre;
    }
    public void setedad(int edad) {
        this.edad = edad;
    }
    public void setraza(String raza) {
        this.raza = raza;
    }
    public void setpeso(int peso) {
        this.peso = peso;
    }
    public void setenfermedades(String enfermedades) {
        this.enfermedades = enfermedades;
    }
    public String getcodigo() {
        return codigo;
    }
    public String getnombre() {
        return nombre;
    }
    public int getedad() {
        return edad;
    }
    public String getraza() {
        return raza;
    }
    public int getpeso() {
        return peso;
    }
    public String getenfermedades() {
        return enfermedades;
    }
    public String toString() {
        String respuesta = "Mascota, nombre: "+nombre+", raza: "+raza+", peso: "+peso+", edad: "+edad+", enfermedades: "+enfermedades+"\n";
        return respuesta;
    }
}