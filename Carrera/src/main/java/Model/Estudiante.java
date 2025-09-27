package Model;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String id;
    private String programaAcademico;
    private String semestre;
    protected ArrayList<Materia> listaMaterias;
    public Estudiante(String nombre, String id, String programaAcademico, String semestre) {
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

    public String getSemestre() {
        return semestre;
    }

    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }

    public ArrayList<Materia> getListaMaterias() {
        return listaMaterias;
    }

    public void setListaMaterias(ArrayList<Materia> listaMaterias) {
        this.listaMaterias = listaMaterias;
    }
}
