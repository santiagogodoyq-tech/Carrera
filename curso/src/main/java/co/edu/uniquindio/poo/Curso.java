package co.edu.uniquindio.poo;

import java.util.ArrayList;

public class Curso {
    private String nombre;
    private String NumeroIdentificacion;
    private String descripcion;
    private int creditos;
    private String semestre;
    private ArrayList<Estudiante> ListaEstudiantes;
    public Curso(String nombre, String codigo, String descripcion, int creditos, String semestre){
        this.nombre = nombre;
        this.NumeroIdentificacion = codigo;
        this.descripcion = descripcion;
        this.creditos = creditos;
        this.semestre = semestre;
        this.ListaEstudiantes = new ArrayList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public String getNumeroIdentificacion() {
        return NumeroIdentificacion;
    }
    public String getDescripcion() {
        return descripcion;
    }
    public int getCreditos() {
        return creditos;
    }
    public String getSemestre() {
        return semestre;
    }
    public ArrayList<Estudiante> getListaEstudiantes() {
        return ListaEstudiantes;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.NumeroIdentificacion = numeroIdentificacion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public void setCreditos(int creditos) {
        this.creditos = creditos;
    }
    public void setSemestre(String semestre) {
        this.semestre = semestre;
    }
    public void setListaEstudiantes(ArrayList<Estudiante> listaEstudiantes) {
        this.ListaEstudiantes = listaEstudiantes;
    }

    /**
     * este metodo permite registrar a un estudiante en caso de que no exista
     * @return
     */
    public String registrarEstudiante(){
        String resultado = "";
        Estudiante estudianteEncontrado = null;
        estudianteEncontrado = buscarEstudiante(estudianteEncontrado.getNumeroIdentificacion());
        if(estudianteEncontrado == null) {
            ListaEstudiantes.add(estudianteEncontrado);
            resultado = "Estudiante registrado correctamente";
        }else{
            resultado = "Estudiante existente";
        }
        return  resultado;
    }
    public String buscarEstudiante(String numeroIdentificacion){
        Estudiante estudianteEncontrado = null;
        for(int i = 0; i < ListaEstudiantes.size(); i++){
            Estudiante auxiliar = ListaEstudiantes.get(i);
            if(auxiliar.getNumeroIdentificacion().equals(NumeroIdentificacion);
                return auxiliar;
            }
        }
    }

