package co.edu.uniquindio.poo;

public abstract class Animal {
    String nombre;
    String tipo;
    String raza;
    String codigo;
    private String sonido;
    public Animal(String nombre, String tipo, String raza, String codigo, String sonido) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.raza = raza;
        this.codigo = codigo;
        this.sonido = sonido;
    }
    public String getNombre() {
        return nombre;
    }
    public String getRaza() {
        return raza;
    }
    public String getTipo() {
        return tipo;
    }
    public String getCodigo() {
        return codigo;
    }
    public String getSonido() {
        return sonido;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRaza(String raza) {
        this.raza = raza;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setSonido(String sonido) {
        this.sonido = sonido;
    }
}
