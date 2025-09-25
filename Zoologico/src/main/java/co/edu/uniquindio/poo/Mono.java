package co.edu.uniquindio.poo;

public class Mono extends Animal {
    private String filo;
    private String sonido = "chillido";
    public Mono(String nombre, String tipo, String raza, String codigo, String filo) {
        super();
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.codigo = codigo;
        this.filo = filo;
    }
    public String getFilo() {
        return filo;
    }
    public void setFilo(String filo) {
        this.filo = filo;
    }
    public String toString() {
        String respuesta = "Animal: "+tipo+" \n raza: "+raza+"\n codigo:"+codigo+"\n nombre:"+nombre+"\n filo:"+filo+"\n sonido"+sonido+"\n";
        return respuesta;
    }
}
