package Model;

public abstract class Profesor  {
    public String  identificador;
    public String nombre;
    public String titulo;
    public int añosDeExperiencia;

    public Profesor(String identificador, String nombre,  String titulo, int añosDeExperiencia) {
        this.identificador = identificador;
        this.nombre = nombre;
        this.titulo = titulo;
        this.añosDeExperiencia = añosDeExperiencia;

    }

}

