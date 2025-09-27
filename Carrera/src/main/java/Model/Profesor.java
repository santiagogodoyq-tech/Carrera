package Model;

public abstract class Profesor  {
    public String  id;
    public String nombre;
    public String titulo;
    public int añosDeExperiencia;

    public Profesor(String id, String nombre,  String titulo, int añosDeExperiencia) {
        this.id = id;
        this.nombre = nombre;
        this.titulo = titulo;
        this.añosDeExperiencia = añosDeExperiencia;
        this.listaMaterias = new ArrayList<>();
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñosDeExperiencia() {
        return añosDeExperiencia;
    }

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }
}

