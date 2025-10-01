package Model;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String id;
    private String programaAcademico;
    private int semestre;
    protected ArrayList<Materia> listaMaterias;
    public Estudiante(String nombre, String id, String programaAcademico, int semestre) {
    this.nombre = nombre;
    this.id = id;
    this.programaAcademico = programaAcademico;
    this.semestre = semestre;
    this.listaMaterias = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getProgramaAcademico() {
        return programaAcademico;
    }

    public void setProgramaAcademico(String programaAcademico) {
        this.programaAcademico = programaAcademico;
    }

    public int getSemestre() {
        return semestre;
    }

    public void setSemestre(int semestre) {
        this.semestre = semestre;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
}
